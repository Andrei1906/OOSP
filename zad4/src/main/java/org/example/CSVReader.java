package org.example;

public class CSVReader implements DataReader {
    @Override
    public void readData(String filename) {
        System.out.println("Чтение данных с CSV файла: " + filename);
    }
}