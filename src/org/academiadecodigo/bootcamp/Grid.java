package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Cells.Cell;
import org.academiadecodigo.bootcamp.Color.ColorConverter;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    //Properties
    private final int padding = 10;
    private int maxCol;
    private int maxRow;
    private int cellSize;
    private ColorConverter colorConverter;
    private Cell[][] cells;

    //Constructor
    public Grid(int maxCol, int maxRow, int cellSize, ColorConverter colorConverter) {
        this.colorConverter = colorConverter;
        this.maxCol = maxCol;
        this.maxRow = maxRow;
        this.cellSize = cellSize;

        drawCellGrid();
        drawLayout();
    }

    //Methods
    private void drawCellGrid() {
        cells = new Cell[maxCol][maxRow];
        for (int i = 0; i < maxCol; i++) {
            for (int j = 0; j < maxRow; j++) {
                cells[i][j] = new Cell(i, j, cellSize, padding, padding, colorConverter);
            }
        }
    }

    private void drawLayout() {
        Rectangle limits = new Rectangle(padding, padding, maxCol * cellSize, maxRow * cellSize);
        limits.draw();
    }

    public void inGrid(double x, double y, Color selectedColor) {
        int col = (int) ((x - padding) / cellSize);
        int row = (int) ((y - padding) / cellSize);
        paintCell(col, row, selectedColor);
    }

    private void paintCell(int col, int row, Color color) {
        cells[col][row].paintCell(color);
    }

    public void clearCells() {
        for (int i = 0; i < maxCol; i++) {
            for (int j = 0; j < maxRow; j++) {
                cells[i][j].clearPaint();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < maxCol; i++) {
            for (int j = 0; j < maxRow; j++) {
                stringBuilder.append(cells[j][i].toString());
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setupCell(int col, int row, String cellInformation){
        cells[col][row].loadCell(cellInformation);
    }



}