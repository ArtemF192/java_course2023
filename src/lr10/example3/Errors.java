package lr10.example3;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Errors {
    public static void main(String[] args) {
        try {
            readExcelFile();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (InvalidFormatException e) {
            System.out.println("Ошибка формата файла: " + e.getMessage());
            System.out.println("Проверьте, что файл является действительным файлом Excel и использует правильный формат.");
        } catch (SheetNotFoundException e) {
            System.out.println("Лист не найден: " + e.getMessage());
            System.out.println("Проверьте, что лист с названием '" + e.getSheetName() + "' существует в файле.");
        }
    }

    public static void readExcelFile() throws IOException, InvalidFormatException, SheetNotFoundException {
        String filePath = "src/lr10/example3.xlsx";
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
            return;
        }

        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            System.out.println("Ошибка при открытии файла: " + e.getMessage());
            return;
        }

        XSSFSheet sheet = workbook.getSheet("Товары");
        if (sheet == null) {
            throw new SheetNotFoundException("Лист 'Товары' не найден", "Товары");
        }

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        workbook.close();
        inputStream.close();
    }

    static class SheetNotFoundException extends Exception {
        private final String sheetName;

        public SheetNotFoundException(String message, String sheetName) {
            super(message);
            this.sheetName = sheetName;
        }

        public String getSheetName() {
            return sheetName;
        }
    }

}
