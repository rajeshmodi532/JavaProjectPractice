package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static Map<String, String> map = new HashMap<String, String>();
	
	public static Map<String, String> GetExcelData() throws IOException
	{
		File file = new File("H:\\Project Workspace\\Project1\\TestData\\TestDataFile_DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sht = workbook.getSheet("Sheet1");
		int rowcount = sht.getLastRowNum()-sht.getFirstRowNum();
		
		for (int i=0; i<rowcount+1; i++)
		{
			Row row = sht.getRow(i);
			for (int j=0; j<row.getLastCellNum();j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+"|| ");
			}
			System.out.println();
		}
		
		return map;
	}
	public static void main (String[] args)
	{
		
	}
	
	
	
	
}
