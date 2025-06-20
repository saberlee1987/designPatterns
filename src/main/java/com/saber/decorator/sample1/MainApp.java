package com.saber.decorator.sample1;

public class MainApp {
    public static void main(String[] args) {
        ImageProcessor imageProcessor = new BasicImageProcessor();
        GrayscaleFilter grayscaleFilter = new GrayscaleFilter(imageProcessor);
        BlurFilter blurFilter = new BlurFilter(grayscaleFilter);
        blurFilter.processImage("image1.jpg");

    }
}
