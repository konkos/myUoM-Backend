package gr.uom.opensource.my_uom;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(MyRunner.class);

    private final List<String> hourList = new ArrayList<>();
    private final List<String> dayList = new ArrayList<>();

    @Override
    public void run(String... args) {
        File excel = new File("C:\\Users\\kon_k\\IdeaProjects\\my_uom\\src\\main\\resources\\static\\ΠΡΟΓΡΑΜΜΑ ΔΙΔΑΣΚΑΛΙΑΣ ΧΕΙΜΕΡΙΝΟΥ ΕΞΑΜΗΝΟΥ 2022-2023.xlsx");

        try (XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(excel))) {
            getDataFromExcelFile(workbook);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String hour : hourList)
            logger.info(hour);

        for (String day : dayList)
            logger.info(day);

    }

    private void getDataFromExcelFile(XSSFWorkbook workbook) {
        for (var sheet : workbook)
            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)
                getDataFromSheetRow(sheet, i);

    }

    private void getDataFromSheetRow(Sheet sheet, int i) {
        Row row = sheet.getRow(i);
        for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
            var cell = row.getCell(j);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().isBlank()) {
                DataFormatter dataFormatter = new DataFormatter();
                var sheetName = sheet.getSheetName();
                String cellData = dataFormatter.formatCellValue(row.getCell(j));
                logger.info("SHEET {} ROW {} CELL {} VALUE {}", sheetName, i, j, cellData);
                if (j == 0 && !hourList.contains("21 - 22") && !cellData.equals("ΩΡΑ")) hourList.add(cellData);
                if (i == 0 && !dayList.contains("ΠΑΡΑΣΚΕΥΗ")) dayList.add(cellData);
            }
        }
    }
}
