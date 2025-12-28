package cheak_util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	public static int getRowCount(String xl, String Sheet) 
	{
		try 
		{
			FileInputStream fi = new FileInputStream(xl); // open file path
			XSSFWorkbook wb = new XSSFWorkbook(fi); // open sheet

			return wb.getSheet(Sheet).getLastRowNum(); // count no of rows and return back the value(test cls rowcount)
		} 
		catch (Exception e) 
		{
			return 0;
		}
	}

	public static String getCellValString(String xl, String sheet, int r, int c) 
	{
		try 
		{
			FileInputStream fi = new FileInputStream(xl);
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFCell cell = wb.getSheet(sheet).getRow(r).getCell(c); // locate cell

			if (cell.getCellType() == CellType.STRING) 
			{
				return cell.getStringCellValue();
			} 
			else 
			{
				return cell.getRawValue();
			}
		} 
		catch (Exception e) 
		{
			return "";
		}
	}


}
