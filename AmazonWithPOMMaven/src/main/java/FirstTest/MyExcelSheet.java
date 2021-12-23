package FirstTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MyExcelSheet {

	
	public static String ExcelSheet(String fileName,String sName,int row, int col) throws Exception
	{
		
		
		File file=new File("E:\\SeleniumTask\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
	
		Sheet sh=wb.getSheet("Sheet1");
		Row row1=sh.getRow(row);
		Cell cell=row1.getCell(col);
		String data=cell.toString();
		
	
		
		return data;
		
	}
}
