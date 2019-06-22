package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Color.ColorConverter;
import org.academiadecodigo.bootcamp.Color.ColorPalette;
import org.academiadecodigo.bootcamp.Peripherals.KeyboardManager;
import org.academiadecodigo.bootcamp.Peripherals.MouseManager;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class PaintManager {

    //Properties
    private Grid grid;
    private ColorPalette colorPalette;
    private ColorConverter colorConverter;
    private MouseManager mouseManager;
    private KeyboardManager keyboardManager;
    private StreamManager streamManager;
    private Color selectedColor;


    //Constructor
    public PaintManager(int maxCol, int maxRow, int cellSize) {
        colorConverter = new ColorConverter();
        grid = new Grid(maxCol, maxRow, cellSize, colorConverter);
        colorPalette = new ColorPalette(maxCol * cellSize, 10, cellSize, colorConverter);
        mouseManager = new MouseManager(this);
        keyboardManager = new KeyboardManager(this);
        streamManager = new StreamManager("src/org/academiadecodigo/bootcamp/save.txt", grid);
        selectedColor = Color.BLACK;
    }

    //Methods
    public void mouseClick(double x, double y){
        if (grid.inGrid(x,y,selectedColor)){
        } else if (colorPalette.inColorPalette(x,y)){
            selectedColor = colorPalette.changeColor(x,y);
        } else {selectedColor = Color.WHITE;}
    }

    public void clearGrid(){
        grid.clearCells();
    }

    public void save(){
        streamManager.saveScreen(grid.toString());
    }

    public void load(){
        streamManager.loadScreen();
    }

}
