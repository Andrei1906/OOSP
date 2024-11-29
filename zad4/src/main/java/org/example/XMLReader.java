package org.example;

public class XMLReader implements DataReader {
    @Override
    public void readData(String filename) {
        System.out.println("чтение данных с XML файла: " + filename);
    }
}