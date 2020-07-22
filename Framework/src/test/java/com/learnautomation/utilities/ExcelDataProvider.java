package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	HSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		System.out.println("./TestData/TestData.xls");
		File src=new File("./TestData/TestData.xls");
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(src);
			
			wb=new HSSFWorkbook(fis);
			//wb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println("Unable to read Excel File "+ e.getMessage());
		}
		
		
	}
	
	public String getStringData(int sheetIndex, int row, int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}	
	
	public String getStringData(String sheetName, int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
