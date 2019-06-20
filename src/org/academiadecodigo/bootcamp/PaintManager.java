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
        colorPalette = new ColorPalette(maxCol);
    }


    //Methods

}
