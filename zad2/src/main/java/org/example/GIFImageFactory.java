package org.example;

public class GIFImageFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new GIFImage();
    }
}