package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example05 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
          FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\datafile.xlsx");
		
		  Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		  int last_row_index = sh.getLastRowNum();
		  
		  for(int i=0;i<=last_row_index;i++)
		  {
			  int last_cell_index = sh.getRow(i).getLastCellNum()-1;
			  for(int j=0;j<=last_cell_index;j++)
			  {
				  
				  Cell cellinfo = sh.getRow(i).getCell(j);
				  CellType ColType = cellinfo.getCellType();
				  
				  if(ColType==CellType.STRING)
				  {
					  System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
				  }
				  else if(ColType==CellType.NUMERIC)
				  {
					  System.out.print(sh.getRow(i).getCell(j).getNumericCellValue()+" ");
				  }
				  else if(ColType==CellType.BOOLEAN)
				  {
					  System.out.print(sh.getRow(i).getCell(j).getBooleanCellValue()+" ");
				  }
				  
			  }
			  System.out.println();
			  
		  }
		
	}
}
