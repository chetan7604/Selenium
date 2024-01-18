package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
	FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
//		
//		String sh = WorkbookFactory.create(file).getSheet("sheet4").getRow(0).getCell(0).getStringCellValue();
//		
//		System.out.println(sh);
//		
		 Sheet sh = WorkbookFactory.create(file).getSheet("sheet4");
		 
		 Row row = sh.getRow(0);
		 
		 Cell cell = row.getCell(0);
		 
		 String vallue = cell.getStringCellValue();
		 
		 System.out.println(vallue);
		 
	}

}
