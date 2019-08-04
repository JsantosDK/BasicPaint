package org.academiadecodigo.bootcamp.Peripherals;

import org.academiadecodigo.bootcamp.PaintManager;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class MouseManager implements MouseHandler {

    private Mouse mouse;
    private PaintManager paintManager;
    public MouseManager(PaintManager paintManager) {
        this.paintManager = paintManager;

        mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        //Necessary compensations since the Library is not properly aligned.;
        paintManager.mouseClick(mouseEvent.getX(), mouseEvent.getY() - 25);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }


}
