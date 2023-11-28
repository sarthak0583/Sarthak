package datasheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Data
{
public static String un;
public static String psw;
public static String value1;
@Test
public static void fetchdata() throws EncryptedDocumentException, IOException
{
	
		FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
	    Workbook wb =WorkbookFactory.create(fs);
        un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
        psw=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
        value1=wb.getSheet("Credential").getRow(1).getCell(2).getStringCellValue();
}
/*public String username() throws EncryptedDocumentException, IOException
{
	
		FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
	    Workbook wb =WorkbookFactory.create(fs);
         return un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
}
public String password() throws EncryptedDocumentException, IOException
{
	
		FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
	    Workbook wb =WorkbookFactory.create(fs);
         return psw=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
}
public String value1() throws EncryptedDocumentException, IOException
{
	
		FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
	    Workbook wb =WorkbookFactory.create(fs);
         return value1=wb.getSheet("Credential").getRow(1).getCell(2).getStringCellValue();
}*/
}
