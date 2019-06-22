package org.academiadecodigo.bootcamp.Cells;

import org.academiadecodigo.bootcamp.Color.ColorConverter;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    //Properties
    private int col;
    private int row;
    private int cellSize;
    private int colPadding;
    private int rowPadding;
    private ColorConverter colorConverter;
    private Color color;
    private Rectangle cell;

    //Constructor
    public Cell(int col, int row, int cellSize, int colPadding, int rowPadding, ColorConverter colorConverter) {
        this.col = col;
        this.row = row;
        this.cellSize = cellSize;
        this.colPadding = colPadding;
        this.rowPadding = rowPadding;
        this.colorConverter = colorConverter;
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

    public void loadCell(String information){
        cell.setColor(colorConverter.colorSelector(Integer.parseInt(information.substring(1))));
        if (Integer.parseInt(information.substring(0,1)) == 1){
            cell.fill();
        }  else {
            cell.draw();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(3);
        if (cell.isFilled()){
            stringBuilder.append("1");
        } else {
            stringBuilder.append("0");
        }
        stringBuilder.append(colorConverter.colorIndex(cell.getColor()));
        return stringBuilder.toString();
    }
}
