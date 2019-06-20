package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Cells.Cell;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    //Properties
    public static final int Padding = 10;
    private int maxCol;
    private int maxRow;
    private int cellSize;
    private Cell[][] cells;

    //Constructor
    public Grid(int maxCol, int maxRow, int cellSize) {
        this.maxCol = maxCol;
        this.maxRow = maxRow;
        this.cellSize = cellSize;

        drawCellGrid();
        drawLayout();
    }

    //Methods
    private void drawCellGrid(){
        cells = new Cell[this.maxCol][this.maxRow];
        for (int i = 0; i < maxCol; i++){
            for (int j = 0; j < maxRow; j++){
                cells[i][j] = new Cell(i,j,cellSize);
            }
        }
    }

    private void drawLayout(){
        Rectangle limits = new Rectangle(Padding,Padding, maxCol * cellSize, maxRow * cellSize);
        limits.draw();
    }


    public void paintCell(int col, int row){
        cells[col][row].paintCell();
    }

    public int pixelToCell(double x){
        System.out.println(x);
        System.out.println((x - Padding)/ cellSize);

        return (int) ((x - Padding )/ cellSize);
    }


    //Getters and Setters
    public int getMaxCol() {
        return maxCol;
    }

    public int getMaxRow() {
        return maxRow;
    }

    public int getCellSize() {
        return cellSize;
    }
}
