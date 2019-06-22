package org.academiadecodigo.bootcamp.Cells;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    //Properties
    private int col;
    private int row;
    private int cellSize;
    private int colPadding;
    private int rowPadding;
    private Color color;
    private Rectangle cell;

    //Constructor
    public Cell(int col, int row, int cellSize, int colPadding, int rowPadding) {
        this.col = col;
        this.row = row;
        this.colPadding = colPadding;
        this.rowPadding = rowPadding;
        this.cellSize = cellSize;
        color = Color.BLACK;
        draw();
    }

    //Methods
    private void draw(){
        cell = new Rectangle(colPadding + col * cellSize, rowPadding + row * cellSize, cellSize,cellSize);
        cell.setColor(Color.WHITE);
        cell.draw();
    }

    public void paintCell(Color color) {
        this.color = color;
        cell.setColor(this.color);
        if (!cell.isFilled()) {
            cell.fill();
        } else cell.draw();
    }

    public Color getColor() {
        return color;
    }

    public void clearPaint(){
        cell.setColor(Color.WHITE);
        cell.draw();
    }


}
