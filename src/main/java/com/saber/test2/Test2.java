package com.saber.test2;

import com.spire.xls.FileFormat;
import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;

import java.io.FileOutputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        writeExcel();
    }

    private static void writeExcel() {
        List<String> titles = List.of(
                "Id", "FirstName", "LaseName", "Age"
        );
        Object[][] data = {
                {1000, "saber", "azizi", 37},
                {1100, "bruce", "lee", 33},
                {1200, "jackie", "chan", 70},
                {1300, "jet", "li", 61},};

        Workbook workbook = new Workbook();
        workbook.createEmptySheets(1);

        Worksheet sheet = workbook.createEmptySheet();
        sheet.isRightToLeft(true);
        //  Worksheet sheet = workbook.getWorksheets().get(0);
        sheet.setName("saber 23");


        sheet.insertRow(1);
        int col = 1;
        for (String title : titles) {
            sheet.setCellValue(1, col, title);
            col++;
        }
        int rowNum = 2;
        for (Object[] datum : data) {
            sheet.insertRow(rowNum);
            col = 1;
            for (Object o : datum) {
                sheet.setCellValue(rowNum, col, o.toString());
                col++;
            }
            rowNum++;
        }

        workbook.protect("saber66", true, true);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test7.xlsx");
            workbook.saveToStream(fileOutputStream, FileFormat.Xlsb2010);
//            workbook.saveToStream();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


//        workbook.saveToFile("test4.xlsx");
        System.out.println("excel successfully .............");
    }
}
