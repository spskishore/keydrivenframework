package kwdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_keydriven {

	
	String filename="C:\\softwares\\keydriven.xlsx";
	String sheetname="Sheet1";
	
	public String read_excel(int r, int c) {
		String s=null;
		
		try {
			    File f = new File(filename);
			    FileInputStream fis = new FileInputStream(f);
			    XSSFWorkbook wb = new XSSFWorkbook(fis);
			    XSSFSheet sh = wb.getSheet(sheetname);
			    XSSFRow row = sh.getRow(r);
			    XSSFCell cell = row.getCell(c);
			    
			     s = cell.getStringCellValue();
			    
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return s;
	}
}
