package gr.uom.opensource.my_uom;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Component
public class MyRunner implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Override
    public void run(String... args) throws Exception {
        File excel = new File("C:\\Users\\kon_k\\IdeaProjects\\my_uom\\src\\main\\resources\\static\\ΠΡΟΓΡΑΜΜΑ ΔΙΔΑΣΚΑΛΙΑΣ ΧΕΙΜΕΡΙΝΟΥ ΕΞΑΜΗΝΟΥ 2022-2023.xlsx");

        try(XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(excel));) {
            for (Sheet sheet : workbook) {
                for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                    var row = sheet.getRow(i);
                    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                        var cell = row.getCell(j);
                        if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().isBlank()) {
                            if (cell.getStringCellValue() != null)
                                logger.info("SHEET %s ROW %d CELL %d VALUE %s".formatted(sheet.getSheetName(), i, j, cell.getStringCellValue()));
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
