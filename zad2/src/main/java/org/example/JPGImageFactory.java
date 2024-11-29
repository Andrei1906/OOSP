package org.example;

public class JPGImageFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new JPGImage();
    }
}