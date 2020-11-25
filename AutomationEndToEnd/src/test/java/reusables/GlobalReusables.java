package reusables;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GlobalReusables {
	String cell;
	double cell1;
	String value;
	
	public String readProperties(String key) {
		//public static void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			FileReader file = new FileReader("./ObjectRepository/objRepo.properties");
			prop.load(file);
			value = prop.getProperty(key);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public String readExcel(String sheetName, int rowNum, int colNum) {
			
		try {
			FileInputStream file = new FileInputStream(".//src/test/java/testData/OrangeHRM.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			for(int i=rowNum; i<=sheet.getPhysicalNumberOfRows();i++) {
				
			}
			cell = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cell;
	}
	
	public double readIntExcel(String sheetName, int rowNum, int colNum) {
		
		try {
			FileInputStream file = new FileInputStream(".//src/test/java/testData/OrangeHRM.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			cell1 = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cell1;
	}
	
	

}
