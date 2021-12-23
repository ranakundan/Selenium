package com.practice.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {

	
	public static String fromExcel(String fileName,String sheetName,int rowIndex, int colIndex) throws Exception
	{
		String data=null;
		File file=new File("E:\\SeleniumTask\\Ecomerse.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(sheetName);
		Row r=st.getRow(rowIndex);
		Cell c=r.getCell(colIndex);
		
		data=c.toString();
		
		
		return data;
		
	}
	
	
	
	public static String fromProperties(String fileName, String key) throws Exception
	{
		String value=null;
		File f=new File("E:\\SeleniumTask\\AssignmentGivenAnupamSir\\config\\config.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty(key);
		
		
		return value;
	}
}
