package org.academiadecodigo.bootcamp.Color;

import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class ColorPalette {

    //Properties
    private int col;
    private int row;
    private int cellSize;

    //Constructor

    public ColorPalette(int maxCol, int cellSize) {
        this.cellSize = 25;
        col = maxCol * cellSize + this.cellSize * 2;
        row = Grid.Padding;
        drawPalette();
    }


    //Methods
    private void drawPalette(){
        for (int i = 0; i < ColorList.values().length; i++){
            Ellipse paletteColor = new Ellipse(col, row, cellSize, cellSize);
            paletteColor.setColor(colorSelector(ColorList.values()[i]));
            paletteColor.fill();
            if (i == ColorList.values().length/2 - 1){
                row = Grid.Padding;
                col += cellSize;
            } else {
                row += cellSize;
            }
        }
        Rectangle contour = new Rectangle(col - cellSize, Grid.Padding, cellSize * 2, cellSize * 6);
        contour.draw();
    }

    private Color colorSelector(ColorList colorList){
        switch (colorList){
            case RED:
                return Color.RED;
            case GREEN:
                return Color.GREEN;
            case BLUE:
                return Color.BLUE;
            case LIGHT_GRAY:
                return Color.LIGHT_GRAY;
            case GRAY:
                return Color.GRAY;
            case DARK_GRAY:
                return Color.DARK_GRAY;
            case BLACK:
                return Color.BLACK;
            case CYAN:
                return Color.CYAN;
            case MAGENTA:
                return Color.MAGENTA;
            case YELLOW:
                return Color.YELLOW;
            case PINK:
                return Color.PINK;
            case ORANGE:
                return Color.ORANGE;
                default:
                    return Color.WHITE;
        }
    }



}
