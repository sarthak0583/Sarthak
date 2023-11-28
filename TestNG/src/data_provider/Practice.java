package data_provider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice 
{
	WebDriver driver;
@Test(dataProvider="data1")
public void sc1(String un,String psw)
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/login/");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(psw);
	driver.findElement(By.id("loginbutton")).click();	
}
@DataProvider(name="data1")
public Object[][]login() throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new FileInputStream("C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
	Workbook wb=WorkbookFactory.create(fs);
	Object[][]data=new Object[3][2];
	data[0][0]=wb.getSheet("Data").getRow(0).getCell(0).getStringCellValue();
	data[0][1]=wb.getSheet("Data").getRow(0).getCell(1).getStringCellValue();
	data[1][0]=wb.getSheet("Data").getRow(1).getCell(0).getStringCellValue();
	data[1][1]=wb.getSheet("Data").getRow(1).getCell(1).getStringCellValue();
	data[2][0]=wb.getSheet("Data").getRow(2).getCell(0).getStringCellValue();
	data[2][1]=wb.getSheet("Data").getRow(2).getCell(1).getStringCellValue();
	return data;
}
}
