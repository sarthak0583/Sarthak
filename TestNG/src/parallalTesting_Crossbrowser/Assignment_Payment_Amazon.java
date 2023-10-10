package parallalTesting_Crossbrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment_Payment_Amazon 
{
	WebDriver driver;
@Parameters("browser")
@Test
public void Sc1(String nameofthebrowser) throws EncryptedDocumentException, IOException
{
	if(nameofthebrowser.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	if(nameofthebrowser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	if(nameofthebrowser.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.amazon.in");
	WebElement accountlogin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	accountlogin.click();
	WebElement email=driver.findElement(By.id("ap_email"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	email.sendKeys(un);
	WebElement click=driver.findElement(By.id("continue"));
	click.click();
	WebElement pswd=driver.findElement(By.id("ap_password"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	pswd.sendKeys(pass);
	WebElement signin=driver.findElement(By.id("signInSubmit"));
	signin.click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
	Set<String> parentandchildid=driver.getWindowHandles();
	Iterator<String> rf=parentandchildid.iterator();
	String pi =rf.next();
	String ci=rf.next();
	driver.switchTo().window(ci);
	driver.findElement(By.id("buy-now-button")).click();
	driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
	driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[1]")).click(); 
}
@Test
public void Sc2(String nameofthebrowser) throws EncryptedDocumentException, IOException
{
	if(nameofthebrowser.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	if(nameofthebrowser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	if(nameofthebrowser.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	
FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
Workbook wb =WorkbookFactory.create(fs);
String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().to("https://www.amazon.in");
WebElement accountlogin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
accountlogin.click();
WebElement email=driver.findElement(By.id("ap_email"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
email.sendKeys(un);
WebElement click=driver.findElement(By.id("continue"));
click.click();
WebElement pswd=driver.findElement(By.id("ap_password"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
pswd.sendKeys(pass);
WebElement signin=driver.findElement(By.id("signInSubmit"));
signin.click();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
Set<String> parentandchildid=driver.getWindowHandles();
Iterator<String> rf=parentandchildid.iterator();
String pi =rf.next();
String ci=rf.next();
driver.switchTo().window(ci);
driver.findElement(By.id("buy-now-button")).click();
driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]")).click(); 
}
@Test
public void Sc3(String nameofthebrowser) throws EncryptedDocumentException, IOException
{
	if(nameofthebrowser.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	if(nameofthebrowser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	if(nameofthebrowser.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
Workbook wb =WorkbookFactory.create(fs);
String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().to("https://www.amazon.in");
WebElement accountlogin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
accountlogin.click();
WebElement email=driver.findElement(By.id("ap_email"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
email.sendKeys(un);
WebElement click=driver.findElement(By.id("continue"));
click.click();
WebElement pswd=driver.findElement(By.id("ap_password"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
pswd.sendKeys(pass);
WebElement signin=driver.findElement(By.id("signInSubmit"));
signin.click();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
Set<String> parentandchildid=driver.getWindowHandles();
Iterator<String> rf=parentandchildid.iterator();
String pi =rf.next();
String ci=rf.next();
driver.switchTo().window(ci);
driver.findElement(By.id("buy-now-button")).click();
driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[3]")).click(); 
}
}
