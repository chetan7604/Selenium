package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_same_data 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			int last_cell_index = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0;j<=last_cell_index;j++)
			{
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
			
		}
		
		
	}
}
