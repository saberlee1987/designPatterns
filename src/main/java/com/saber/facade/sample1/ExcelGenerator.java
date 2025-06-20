package com.saber.facade.sample1;

public class ExcelGenerator {

    private static ExcelGenerator excelGenerator;
    public static ExcelGenerator getInstance() {
        if (excelGenerator == null)
            excelGenerator = new ExcelGenerator();
        return excelGenerator;
    }
    private ExcelGenerator(){}
    public void generate(String content) {
        System.out.println("generate excel file");
    }
}
