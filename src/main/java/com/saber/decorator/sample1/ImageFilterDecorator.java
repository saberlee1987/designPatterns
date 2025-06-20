package com.saber.decorator.sample1;

public abstract class ImageFilterDecorator implements ImageProcessor {

    private final ImageProcessor imageProcessor;

    public ImageFilterDecorator(ImageProcessor imageProcessor) {
        this.imageProcessor = imageProcessor;
    }

    @Override
    public void processImage(String image) {
        imageProcessor.processImage(image);
    }
}
