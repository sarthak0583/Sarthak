package mmt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
public class Credentials extends Make_My_Trip
{
	
	public String emailid;
	public String phoneno;
	public String pnr;
	public void data() throws EncryptedDocumentException, IOException
	{
         FileInputStream f1=new FileInputStream("C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\src\\mmt\\ExcelSheet\\Credential.xlsx");
         Workbook w1= WorkbookFactory.create(f1);
         emailid=w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
         phoneno=NumberToTextConverter.toText(w1.getSheet("Login").getRow(0).getCell(1).getNumericCellValue());
         pnr=NumberToTextConverter.toText(w1.getSheet("Login").getRow(0).getCell(2).getNumericCellValue());
    }
}