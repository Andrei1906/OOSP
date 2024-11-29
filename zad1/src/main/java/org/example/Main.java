package org.example;

public class Main {
    public static void main(String[] args) {
        Tool pencil = ToolFactory.getTool("ручка");
        pencil.use();

        Tool brush = ToolFactory.getTool("кисть");
        brush.use();

        Tool eraser = ToolFactory.getTool("ластик");
        eraser.use();
    }
}