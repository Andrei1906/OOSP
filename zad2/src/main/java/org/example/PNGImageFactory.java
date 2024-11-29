package org.example;

public class PNGImageFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new PNGImage();
    }
}
