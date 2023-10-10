package programe;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddt {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
		Workbook wb =WorkbookFactory.create(fs);
		String  un=wb.getSheet("Data").getRow(1).getCell(0).getStringCellValue();
		System.out.println(un);
	}

}
