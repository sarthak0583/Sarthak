package practice;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDT 
{
	WebDriver driver;
	@Test
	public void one() throws AWTException, EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream f1=new FileInputStream("C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
		Workbook ws=WorkbookFactory.create(f1);
		String value=ws.getSheet("Data").getRow(0).getCell(2).getStringCellValue();
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys(value);
		w1.sendKeys(Keys.ENTER);
}
}