package org.academiadecodigo.bootcamp.Cells;

import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    //Properties
    private int col;
    private int row;
    private int cellSize;
    private Rectangle cell;

    //Constructor

    public Cell(int col, int row, int cellSize) {
        this.col = col;
        this.row = row;
        this.cellSize = cellSize;
        draw();
    }

    //Methods
    private void draw(){
        cell = new Rectangle(Grid.Padding + col * cellSize, Grid.Padding + row * cellSize, cellSize,cellSize);
        //cell.setColor(Color.WHITE);
        cell.draw();
    }

    public void paintCell(){
        cell.fill();
    }

    public void drawCell(){}


}
