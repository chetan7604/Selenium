package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_last_cell_no 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		short last_cell_no = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getLastCellNum();
		
		System.out.println(last_cell_no);
		System.out.println("last cell index is:"+(last_cell_no-1));
	}

}
