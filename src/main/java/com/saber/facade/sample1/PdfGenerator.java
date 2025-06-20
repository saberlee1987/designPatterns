package com.saber.facade.sample1;

public class PdfGenerator {
    private static PdfGenerator pdfGenerator;
    public static PdfGenerator getInstance() {
        if (pdfGenerator == null)
            pdfGenerator = new PdfGenerator();
        return pdfGenerator;
    }
    private PdfGenerator(){}
    public void generate(String content) {
        System.out.println("generate pdf file");
    }
}
