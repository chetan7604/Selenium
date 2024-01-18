package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_difftype_data 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		int last_row_index = sh.getLastRowNum();
		
		for(int i=0; i<=last_row_index; i++)
		{
			int last_cell_in = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=last_cell_in; j++)
			{
				Cell cell_info = sh.getRow(i).getCell(j);
				CellType actual_cell_type = cell_info.getCellType();
				
				if(actual_cell_type==CellType.STRING)
				{
					System.out.print(cell_info.getStringCellValue()+"  ");
				}
				else if(actual_cell_type==CellType.NUMERIC)
				{
					System.out.print(cell_info.getNumericCellValue()+"  ");
				}
				else if(actual_cell_type==CellType.BOOLEAN)
				{
					System.out.print(cell_info.getBooleanCellValue()+"  ");
				}
				
			}
			System.out.println();
		}
		
		
	}

}
