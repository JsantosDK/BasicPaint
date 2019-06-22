package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Color.ColorPalette;
import org.academiadecodigo.bootcamp.Peripherals.KeyboardManager;
import org.academiadecodigo.bootcamp.Peripherals.MouseManager;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class PaintManager {

    //Properties
    private Grid grid;
    private ColorPalette colorPalette;
    private MouseManager mouseManager;
    private KeyboardManager keyboardManager;
    private Color selectedColor;


    //Constructor
    public PaintManager(int maxCol, int maxRow, int cellSize) {
        grid = new Grid(maxCol, maxRow, cellSize);
        colorPalette = new ColorPalette(maxCol * cellSize, 10, cellSize);
        mouseManager = new MouseManager(this);
        keyboardManager = new KeyboardManager(this);
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

}
