package org.academiadecodigo.bootcamp.Color;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class ColorConverter {

    //Properties


    //Constructor


    //Methods
    public Color colorSelector(int i) {
        switch (i) {
            case 1:
                return Color.RED;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.BLUE;
            case 4:
                return Color.LIGHT_GRAY;
            case 5:
                return Color.GRAY;
            case 6:
                return Color.DARK_GRAY;
            case 7:
                return Color.BLACK;
            case 8:
                return Color.CYAN;
            case 9:
                return Color.MAGENTA;
            case 10:
                return Color.YELLOW;
            case 11:
                return Color.PINK;
            case 12:
                return Color.ORANGE;
            default:
                return Color.WHITE;
        }
    }

    public String colorIndex(Color color){
        if (color == Color.RED){
            return "01";
        } else if (color == Color.GREEN){
            return "02";
        } else if (color == Color.BLUE){
            return "03";
        } else if (color == Color.LIGHT_GRAY){
            return "04";
        } else if (color == Color.GRAY){
            return "05";
        } else if (color == Color.DARK_GRAY){
            return "06";
        } else if (color == Color.BLACK){
            return "07";
        } else if (color == Color.CYAN){
            return "08";
        } else if (color == Color.MAGENTA){
            return "09";
        } else if (color == Color.YELLOW){
            return "10";
        } else if (color == Color.PINK){
            return "11";
        } else if (color == Color.ORANGE){
            return "12";
        } else return "00";
    }

}
