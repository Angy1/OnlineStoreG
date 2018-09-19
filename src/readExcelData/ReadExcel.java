package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		  //https://www.youtube.com/watch?v=sbBdj4zIMqY
		  // Create a new instance of File(loaded an excel sheet)
		File src = new File("C:\\Users\\user\\ToolsQA\\ExcelData\\TestData.xlsx");
		
		  //Create a new instance of FileInputStream(FileInputStream is a separate class that will accept src)
		  //(loaded an excel sheet in form of bytes)
		FileInputStream fis = new FileInputStream(src);
		
		  //Create a new object of XSSFWordBook(This class is coming from Apachi POI(load a full workbook)
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		  //Specify what sheet will be used
		XSSFSheet  sheet1 = wb.getSheetAt(0);
		
		  // to specify which row and column(cellnum) to use
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from Excel is " + data0);
		
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from Excel is " + data1);
		
		//If you're dealing with xls file use library HSSFWorkbook instead of XSSFWorkbook
		
		wb.close();
	}

}
