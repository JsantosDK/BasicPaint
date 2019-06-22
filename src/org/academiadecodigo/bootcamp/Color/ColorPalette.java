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
    private ColorConverter colorConverter;

    //Constructor
    public ColorPalette(int colPadding, int rowPadding, int cellSize, ColorConverter colorConverter) {
        this.cellSize = cellSize;
        this.colorConverter = colorConverter;
        minCol = colPadding + cellSize * 2;
        minRow = rowPadding;
        maxCol = minCol;
        minRow = maxRow;
        drawPalette();
    }

    //Methods
    private void drawPalette() {
        palette = new Cell[2][6];
        int colorIndex = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                palette[i][j] = new Cell(i, j, cellSize, minCol, minRow, colorConverter);
                palette[i][j].paintCell(colorConverter.colorSelector(colorIndex));
                colorIndex++;
                maxRow += cellSize;
            }
            maxCol += cellSize;
        }
        maxRow = maxRow / 2;
        Rectangle contour = new Rectangle(minCol, minRow, maxCol - minCol, maxRow - minRow);
        contour.draw();
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
