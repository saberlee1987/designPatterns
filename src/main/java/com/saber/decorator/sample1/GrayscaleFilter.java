package com.saber.decorator.sample1;

public class GrayscaleFilter extends ImageFilterDecorator{
    public GrayscaleFilter(ImageProcessor imageProcessor) {
        super(imageProcessor);
    }
    @Override
    public void processImage(String image) {
        super.processImage(image);
        applyGrayscale();
    }
    private void applyGrayscale() {
        System.out.println("applying grayscale filter on image ......");
    }
}