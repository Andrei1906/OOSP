package org.example;

public class Main {
    public static void main(String[] args) {
        ImageFactory jpgFactory = new JPGImageFactory();
        Image jpg = jpgFactory.createImage();
        jpg.render();

        ImageFactory pngFactory = new PNGImageFactory();
        Image png = pngFactory.createImage();
        png.render();

        ImageFactory gifFactory = new GIFImageFactory();
        Image gif = gifFactory.createImage();
        gif.render();
    }
}