package org.academiadecodigo.bootcamp.Peripherals;

import org.academiadecodigo.bootcamp.PaintManager;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardManager implements KeyboardHandler {

    //Properties
    private Keyboard keyboard;
    private PaintManager paintManager;

    //Constructor
    public KeyboardManager(PaintManager paintManager) {
        keyboard = new Keyboard(this);
        this.paintManager =  paintManager;
        start();
    }

    //Methods
    public void start(){
        KeyboardEvent clearAll = new KeyboardEvent();
        clearAll.setKey(KeyboardEvent.KEY_C);
        clearAll.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(clearAll);
        KeyboardEvent save = new KeyboardEvent();
        save.setKey(KeyboardEvent.KEY_O);
        save.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(save);
        KeyboardEvent load = new KeyboardEvent();
        load.setKey(KeyboardEvent.KEY_P);
        load.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(load);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_C){
            paintManager.clearGrid();
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_O){
            paintManager.save();
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_P){
            paintManager.load();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
