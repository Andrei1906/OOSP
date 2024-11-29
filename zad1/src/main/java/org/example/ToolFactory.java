package org.example;

public class ToolFactory {
    public static Tool getTool(String toolType) {
        switch (toolType.toLowerCase()) {
            case "ручка":
                return new Pencil();
            case "кисть":
                return new Brush();
            case "ластик":
                return new Eraser();
            default:
                throw new IllegalArgumentException("Invalid tool");
        }
    }
}