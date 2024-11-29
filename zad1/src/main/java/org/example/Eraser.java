package org.example;

public class Eraser implements Tool {
    @Override
    public void use() {
        System.out.println("используем ластик для стирания.");
    }
}