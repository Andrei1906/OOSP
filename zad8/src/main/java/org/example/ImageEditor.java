package org.example;

public class ImageEditor {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Текущее состояние: " + state);
    }

    public ImageState save() {
        return new ImageState(state);
    }

    public void restore(ImageState imageState) {
        this.state = imageState.getState();
        System.out.println("Состояние восстановлено до: " + state);
    }
}