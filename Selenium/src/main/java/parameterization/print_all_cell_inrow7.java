package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print_all_cell_inrow7 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		int col_last_index = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=col_last_index;i++)
		{
			String value = sh.getRow(6).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
		
	}

}
