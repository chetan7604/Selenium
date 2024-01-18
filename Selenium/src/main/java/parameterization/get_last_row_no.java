package parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_last_row_no 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		int last_row_index = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		System.out.println(last_row_index);
		System.out.println("last row no is:"+(last_row_index+1));
		
	}

}
