package org.example;

public class Pencil implements Tool {
    @Override
    public void use() {
        System.out.println("используем ручку для рисования.");
    }
}