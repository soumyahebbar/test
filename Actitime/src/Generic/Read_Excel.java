package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Read_Excel implements Auto_constant
{
	String data = "";
	
	public String readdata(String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis= new FileInputStream(Path);
		Workbook ws= WorkbookFactory.create(fis);
		try{
		Sheet sh=ws.getSheet(sheet);
		data=sh.getRow(row).getCell(cell).toString();
		
		Reporter.log("Excel sheet found and Row Cell is proper",true);
		}
		catch(Exception e)
		{
			Reporter.log("Excel sheet Not found and Row Cell is not proper",true);

		}
		return data;
	}
	
	
}
