package org.example;

public class FileReaderAdapter implements DataReader {
    private final DataReader dataReader;

    public FileReaderAdapter(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    @Override
    public void readData(String filename) {
        dataReader.readData(filename);
    }
}