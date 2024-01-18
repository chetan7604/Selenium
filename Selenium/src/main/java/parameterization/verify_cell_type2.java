package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verify_cell_type2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
	    Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");

	    Cell cell_type = sh.getRow(3).getCell(1);
	    
		CellType actual_cell_type = cell_type.getCellType();
		
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
