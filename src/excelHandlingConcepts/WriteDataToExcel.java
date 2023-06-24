package excelHandlingConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
    	
		String sheetName = "User Details";
        Workbook workbook = WorkbookFactory.create(true);
        Sheet sheet = workbook.createSheet(sheetName);
        
        // to set the cell style - not mandatory
        CellStyle style = workbook.createCellStyle();
        
        style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        
        Font font = workbook.createFont();
        font.setColor(IndexedColors.WHITE.getIndex());
        style.setFont(font);
        
        // created rows
        Row headerRow = sheet.createRow(0);
        //create cell
        Cell cell = headerRow.createCell(0);
        //set cell value
        cell.setCellValue("Name");
        //set cell style
        cell.setCellStyle(style);
 
        cell = headerRow.createCell(1);
        cell.setCellValue("Age");
        cell.setCellStyle(style);
        
        
        Row dataRow = sheet.createRow(1);
        cell = dataRow.createCell(0);
        cell.setCellValue("John");
        cell = dataRow.createCell(1);
        cell.setCellValue(25);
        
        dataRow = sheet.createRow(2);
        cell = dataRow.createCell(0);
        cell.setCellValue("Doe");
        cell = dataRow.createCell(1);
        cell.setCellValue(35);
        
        dataRow = sheet.createRow(3);
        cell = dataRow.createCell(0);
        cell.setCellValue("Test");
        cell = dataRow.createCell(1);
        cell.setCellValue(135);
        cell.setCellStyle(style);
        
        //writing to a excel
        
        String fileName = path + "\\Data\\TestingAgain1.xlsx";
        
        File excelFile = new File(fileName);
        FileOutputStream fos = new FileOutputStream(excelFile);
        
        workbook.write(fos);
        System.out.println("Data is written successfully");
        workbook.close();

	}

}
