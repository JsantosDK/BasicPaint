package org.academiadecodigo.bootcamp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StreamManager {

    private String saveFile;

    public StreamManager(String path) {
        saveFile = path;
    }

    public void saveScreen(String gridInformation) {
        try {
            FileWriter fileWriter = new FileWriter(saveFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(gridInformation);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException error2) {
            System.out.println("An error occurred while trying to save.");
        }
    }
}
