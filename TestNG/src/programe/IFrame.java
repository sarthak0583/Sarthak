package programe;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IFrame 
{
WebDriver driver;
@Test
public void login() throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement accountlogin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	accountlogin.click();
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys(un);
	WebElement click=driver.findElement(By.id("continue"));
	click.click();
	WebElement pswd=driver.findElement(By.id("ap_password"));
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
	driver.findElement(By.linkText("Enter card details")).click();
	WebElement frame1=driver.findElement(By.name("ApxSecureIframe"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.name("addCreditCardNumber")).sendKeys("6070936165786267");
	WebElement month=driver.findElement(By.name("ppw-expirationDate_month"));
	Select s1=new Select(month);
	s1.selectByValue("11");
	WebElement year=driver.findElement(By.name("ppw-expirationDate_year"));
	Select s2=new Select(year);
	s2.selectByValue("2025");
	driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.name("addCreditCardVerificationNumber0")).sendKeys("888");
}
}
