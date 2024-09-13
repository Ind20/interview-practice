package problems;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvReader {

    // Constant file path
    private static final String EXCEL_FILE_PATH = System.getProperty("user.dir")+"\\src\\test\\java\\resources\\users.csv";

    public static Map<String, String> readExcelToMapByIndex(String sheetName, String searchIndex) {
        Map<String, String> dataMap = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(EXCEL_FILE_PATH);
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Get the sheet by its name
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");
            }

            // Get the first row (header) which contains the keys
            Row headerRow = sheet.getRow(0);
            if (headerRow == null) {
                throw new IllegalArgumentException("Sheet is empty or does not contain a header row.");
            }

            // Iterate through the rows (starting from the second row) to find the matching index
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    Cell indexCell = row.getCell(0);  // Assuming index is in the first column

                    if (indexCell != null && searchIndex.equals(indexCell.toString())) {
                        // If the index matches, create the map based on the header and the current row
                        for (int j = 1; j < row.getLastCellNum(); j++) {  // Start from column 1 (second column)
                            String key = headerRow.getCell(j).toString();
                            String value = row.getCell(j).toString();
                            dataMap.put(key, value);
                        }
                        break;  // Stop after finding the matching index
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataMap;
    }

    public static void main(String[] args) {
        // Example usage
        String sheetName = "users"; // The name of the sheet (tab) you want to read from
        String searchIndex = "1"; // The index you want to search for

        Map<String, String> resultMap = readExcelToMapByIndex(sheetName, searchIndex);

        // Print the map
        for (Map.Entry<String, String> entry : resultMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
