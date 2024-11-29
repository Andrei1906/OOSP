package org.example;

public class Brush implements Tool {
    @Override
    public void use() {
        System.out.println("используем кисть для рисования.");
    }
}