package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verify_cell_type1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		Cell cell_type = WorkbookFactory.create(file).getSheet("sheet1").getRow(3).getCell(5);
		
		CellType actual_cell_type = cell_type.getCellType();
		
		System.out.println(actual_cell_type);
		
		if(actual_cell_type==CellType.STRING)
		{
			System.out.println(cell_type.getStringCellValue());
		}
		else if(actual_cell_type==CellType.NUMERIC)
		{
			System.out.println(cell_type.getNumericCellValue());
		}
		else if(actual_cell_type==CellType.BOOLEAN)
		{
			System.out.println(cell_type.getBooleanCellValue());
			
		}
		
	}

}
