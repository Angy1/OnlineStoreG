package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//https://www.youtube.com/watch?v=MlXV7qSpLDY
public class WriteExcelSheet {

	public static void main(String[] args) throws Exception {
		 
		  
		File src = new File("C:\\Users\\user\\ToolsQA\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet  sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		
		sheet1.getRow(2).createCell(2).setCellValue("14.12");
		
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
	}

}
