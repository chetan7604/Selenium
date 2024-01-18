package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example04 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		int last_row_index = sh.getLastRowNum();
		
		for(int i=0;i<=last_row_index;i++)
		{
			int cell_index = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0;j<=cell_index;j++)
			{
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		
		
	}

}
