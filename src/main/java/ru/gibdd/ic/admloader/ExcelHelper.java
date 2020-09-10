package ru.gibdd.ic.admloader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ru.gibdd.ic.admloader.entity.Admpractice;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelHelper {
    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    public static boolean hasExcelFormat(File file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<Admpractice> excelToAdm(InputStream inputStream) {
        try {
            Workbook workbook = new XSSFWorkbook(inputStream);

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();

            List<Admpractice> admList = new ArrayList<Admpractice>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                Admpractice admpractice = new Admpractice();

                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                    switch (cellIdx) {
                        case 0:
                            admpractice.setIdentificator(currentCell.getStringCellValue());
                            break;


                    }
                    cellIdx++;
                }

                admList.add(admpractice);

                workbook.close();

                return admList;

            }
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}