package org.example;

public class JSONReader implements DataReader {
    @Override
    public void readData(String filename) {
        System.out.println("чтение данных с JSON файла: " + filename);
    }
}