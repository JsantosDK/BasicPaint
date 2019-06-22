package org.academiadecodigo.bootcamp.Color;

import org.academiadecodigo.bootcamp.Cells.Cell;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class ColorPalette {

    //Properties
    private int minCol;
    private int minRow;
    private int maxCol;
    private int maxRow;
    private int cellSize;
    private Cell[][] palette;


    //Constructor
    public ColorPalette(int colPadding, int rowPadding, int cellSize) {
        this.cellSize = cellSize;
        minCol = colPadding + cellSize * 2;
        minRow = rowPadding;
        maxCol = minCol;
        minRow = maxRow;
        drawPalette();
    }


    //Methods
    private void drawPalette() {
        palette = new Cell[2][6];
        int colorIndex = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                palette[i][j] = new Cell(i, j, cellSize, minCol, minRow);
                palette[i][j].paintCell(colorSelector(ColorList.values()[colorIndex]));
                colorIndex++;
                maxRow += cellSize;
            }
            maxCol += cellSize;
        }
        maxRow = maxRow / 2;
        Rectangle contour = new Rectangle(minCol, minRow, maxCol - minCol, maxRow - minRow);
        contour.draw();
    }

    private Color colorSelector(ColorList colorList) {
        switch (colorList) {
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

    public boolean inColorPalette(double x, double y) {
        return (x > minCol && x <= maxCol && y > minRow && y <= maxRow);
    }

    public Color changeColor(double x, double y) {
        int col = (int) (x - minCol) / cellSize;
        int row = (int) (y - minRow) / cellSize;
        return palette[col][row].getColor();
    }


}
