package org.academiadecodigo.bootcamp.Color;

import org.academiadecodigo.simplegraphics.graphics.Color;

public enum ColorList {
    RED,
    GREEN,
    BLUE,
    LIGHT_GRAY,
    GRAY,
    DARK_GRAY,
    BLACK,
    CYAN,
    MAGENTA,
    YELLOW,
    PINK,
    ORANGE;

    public Color colorSelector(ColorList selectColor){
        switch (selectColor){
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
