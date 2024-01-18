package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_last_cell_no1
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		short last_cell_no = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		
		System.out.println(last_cell_no);
		
		System.out.println("last cell index:"+(last_cell_no-1));
		
		
	}

}
