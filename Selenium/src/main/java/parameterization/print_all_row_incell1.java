package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print_all_row_incell1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
	  Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	  
	  int last_row_index= sh.getLastRowNum();
	  
	  for(int i=0; i<=last_row_index; i++)
	  {
		  String value = sh.getRow(i).getCell(5).getStringCellValue();
		  System.out.println(value);
	  }
	  
		
	} 

}
