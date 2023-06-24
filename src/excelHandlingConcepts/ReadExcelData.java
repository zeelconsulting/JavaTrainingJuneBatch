package excelHandlingConcepts;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		
		String path = System.getProperty("user.dir");
	//	System.out.println(path);
		String excelpath = "\\Data\\ExcelData.xlsx";
		
		// giving full path - hard coding
		//File excelFile1 = new File("C:\\Users\\Swati\\eclipse-workspace\\JavaLearning\\Data\\ExcelData.xlsx");
		
		//relative path
		File excelFile = new File(path + excelpath);
		System.out.println(excelFile);
		
		//workbook -> worksheet -> rows or columns -> cells
		// to read the data 
		FileInputStream fis = new FileInputStream(excelFile);
		// control of workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//control of sheet
		XSSFSheet sheet = wb.getSheet("Credentials");
		
		//	wb.getSheetAt(0); - to get the sheet at particular index
		
		// to get no. of rows
		int rows = sheet.getLastRowNum();
		System.out.println("No. of rows " + rows);
		
		//to get no. of columns
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("No. of columns " + cols);
		
		String data =  sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		
		for (int i=0; i<=rows;i++) {
			
			//get the row data
			XSSFRow row = sheet.getRow(i);
			
			for (int j=0; j<cols; j++) {
				
				XSSFCell cell = row.getCell(j);
				switch(cell.getCellType()) { //STRING, BOOLEAN, NUMERIC, FORMULA
				
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + "\t");
					break;
				case FORMULA:
					System.out.print(cell.getCellFormula() + "\t");
					break;
				}
			}
			System.out.println();
		
		}
		
		
	}

}
