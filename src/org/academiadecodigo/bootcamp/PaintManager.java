package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Color.ColorPalette;

public class PaintManager {

    //Properties
    private Grid grid;
    private ColorPalette colorPalette;
    private MouseManager mouseManager;


    //Constructor
    public PaintManager(int maxCol, int maxRow, int cellSize) {
        grid = new Grid(maxCol, maxRow, cellSize);
        colorPalette = new ColorPalette(maxCol, cellSize);
        mouseManager = new MouseManager(this);
    }


    //Methods
    public void mouseClick(double x, double y){
        int col = grid.pixelToCell(x);
        int row = grid.pixelToCell(y);
        if (col < grid.getMaxCol() && row < grid.getMaxRow()){
            paintCell(col,row);
        }


    }


    public void paintCell(int col, int row){
        grid.paintCell(col, row);
    }

}
