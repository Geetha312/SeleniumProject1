package Generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{

	/*public static String getusername(String path,String sheet,int row,int cell) throws IOException
	{
		FileInputStream F=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(F);
		String username=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return username;
	
	}
	public static String getpassword(String path,String sheet,int row,int cell) throws IOException
	{
		FileInputStream F=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(F);
		String password=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return password;

	}*/
	


	public static String getcellvalue(String path,String sheet,int row,int cell) throws IOException 
	{ 
	FileInputStream F=new FileInputStream(path); 
	XSSFWorkbook wb=new XSSFWorkbook(F); 
	String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue(); 
	return cellvalue; 
    }
	
	
}
