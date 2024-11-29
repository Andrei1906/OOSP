package org.example;

public class Main {
    public static void main(String[] args) {
        DataReader csvReader = new FileReaderAdapter(new CSVReader());
        csvReader.readData("data.csv");

        DataReader jsonReader = new FileReaderAdapter(new JSONReader());
        jsonReader.readData("data.json");

        DataReader xmlReader = new FileReaderAdapter(new XMLReader());
        xmlReader.readData("data.xml");
    }
}