package org.academiadecodigo.bootcamp.Color;

import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class ColorPalette {

    //Properties
    private int col;
    private int row;
    private int cellSize;

    //Constructor

    public ColorPalette(int maxCol, int cellSize) {
        col = maxCol * cellSize + cellSize * 2;
        row = Grid.Padding;
        this.cellSize = cellSize;
        drawPalette();
    }


    //Methods
    private void drawPalette(){
        System.out.println(ColorList.values().length);
        for (int i = 0; i < ColorList.values().length; i++){
            Ellipse paletteColor = new Ellipse(col, row, cellSize, cellSize);
            paletteColor.setColor(ColorList.values()[i].colorSelector(ColorList.values()[i]));
            paletteColor.fill();
            if (i == ColorList.values().length/2 - 1){
                row = Grid.Padding;
                col += cellSize;
            } else {
                row += cellSize;
            }
        }
    }



}
