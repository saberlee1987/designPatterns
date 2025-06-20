package com.saber.facade.sample1;

public class DocumentGenerator {
    public void generateFile(DocumentType documentType, String content) {
        switch (documentType) {
            case PDF -> PdfGenerator.getInstance().generate(content);
            case EXCEL -> ExcelGenerator.getInstance().generate(content);
            case WORD -> WordGenerator.getInstance().generate(content);
            default -> System.err.println("unsupported operation");
        }
    }
}
