package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Credential 
{
	String  un;
	String  pass;
	@Test
	public String password() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
	    Workbook wb =WorkbookFactory.create(fs);
    return pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
	}
	public String uname() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
	    Workbook wb =WorkbookFactory.create(fs);
		return un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
	}
}