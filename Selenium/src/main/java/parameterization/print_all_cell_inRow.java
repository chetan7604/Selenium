package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print_all_cell_inRow
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		int last_cell_index = sh.getRow(0).getLastCellNum()-1;
		int last_row_index = sh.getLastRowNum();
		
//		for(int j=0;j<=last_row_index;j++) 
//		{
//			
//			System.out.println(sh.getRow(j).getCell(1).getStringCellValue()+" ");
//		}
//		
		
		for(int i=0;i<=last_cell_index;i++)
		{
			String value = sh.getRow(1).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
	}
}
