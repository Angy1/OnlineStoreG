package readExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {

		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\user\\ToolsQA\\ExcelData\\TestData.xlsx");
		
		System.out.println(excel.getData(1, 0, 1));

	}

}
