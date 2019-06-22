package org.academiadecodigo.bootcamp;

import java.io.*;

public class StreamManager {

    private String saveFile;
    private Grid grid;

    public StreamManager(String path, Grid grid) {
        saveFile = path;
        this.grid = grid;
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

    public void loadScreen() {
        try {
            FileReader fileReader = new FileReader(saveFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);
            String text;
            String[] arrayOfCellInformation;
            while ((text = lineNumberReader.readLine()) != null) {
                arrayOfCellInformation = text.split(" ");
                for (int i = 0; i < arrayOfCellInformation.length-1; i++){
                    grid.setupCell(i, lineNumberReader.getLineNumber()-1,arrayOfCellInformation[i]);
                }
            }
            bufferedReader.close();
        } catch (IOException error3) {
            System.out.println("An error occurred while trying to load the previous save.");
        }
    }

}
