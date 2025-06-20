package com.saber.decorator.sample1;

public class BasicImageProcessor implements ImageProcessor {
    @Override
    public void processImage(String image) {
        System.out.println("Processing Image : ".concat(image));
    }
}
