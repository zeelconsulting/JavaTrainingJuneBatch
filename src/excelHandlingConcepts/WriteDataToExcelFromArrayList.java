package excelHandlingConcepts;

import java.io.*;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Workbook -> Sheet -> Row -> Cell
public class WriteDataToExcelFromArrayList {

	public static void main(String[] args) throws Exception {


		XSSFWorkbook wb1 = new XSSFWorkbook();
		//create new sheet
		XSSFSheet sheet1 = wb1.createSheet("DetailsNew");
	//	XSSFSheet sheet2 = wb1.createSheet("DetailsNew1");   Create new sheet



		ArrayList <String> data1 = new ArrayList <String>();
		data1.add("Jane");
		data1.add("John");
		data1.add("Scott");
		data1.add("Mike");
		data1.add("John");
		data1.add("Scott");
		data1.add("Mike");
		data1.add("John");
		data1.add("Scott");
		data1.add("Mike");

		ArrayList <Integer> ID = new ArrayList <Integer>();

		for (int i=0; i<10; i++) {
			ID.add(i);
		}

		System.out.println(ID);

		// Add a header row to the data
		ArrayList<String> headerRow = new ArrayList<String>();
		headerRow.add("ID");
		headerRow.add("Name");

		// to create 1st row
		XSSFRow header = sheet1.createRow(0);
		
		for (int i = 0; i < headerRow.size(); i++) {
			XSSFCell headerCell = header.createCell(i);
			headerCell.setCellValue(headerRow.get(i));
		}


		//Add other data to the excel
		int rowCount2 =1;
		for (int i=0; i<ID.size(); i++){

			XSSFRow row1 = sheet1.createRow(rowCount2++);
			XSSFCell cell = row1.createCell(0);
			cell.setCellValue(ID.get(i));

			XSSFCell cell1 = row1.createCell(1);
			cell1.setCellValue(data1.get(i));

		}


		String path1 = System.getProperty("user.dir");
		System.out.println(path1);

		String FilePath1 = path1 + "\\Data\\EmpDataArrayListdataSample1.xlsx";
		FileOutputStream fos1 = new FileOutputStream(FilePath1);
		wb1.write(fos1);
		wb1.close();

		System.out.println("Data written successfully");



	}


}
