package com.saber.decorator.sample1;

public class BlurFilter extends ImageFilterDecorator {
    public BlurFilter(ImageProcessor imageProcessor) {
        super(imageProcessor);
    }

    @Override
    public void processImage(String image) {
        super.processImage(image);
        applyBlurFilter();
    }
    private void applyBlurFilter() {
        System.out.println("applying blur filter on image .....");
    }
}
