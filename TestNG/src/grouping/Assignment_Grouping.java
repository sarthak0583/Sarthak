package grouping;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Assignment_Grouping
{
@Test(groups= {"System","Smoke"})
public void amz_ST_01() throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
	driver.findElement(By.id("banner-image")).click();
	driver.findElement(By.linkText("Return to Cart")).click();
	WebElement signout=driver.findElement(By.id("nav-link-accountList"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signout).perform();
	driver.findElement(By.xpath("//span[.='Sign Out']")).click(); 
}
@Test (groups= {"System","Smoke"})
public void amz_ST_02() throws EncryptedDocumentException, IOException 
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
	driver.findElement(By.id("banner-image")).click();
	driver.findElement(By.linkText("Return to Cart")).click();
	WebElement signout=driver.findElement(By.id("nav-link-accountList"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signout).perform();
	driver.findElement(By.xpath("//span[.='Sign Out']")).click();
	
}
@Test (groups= {"System","Smoke"})
public void amz_ST_03() throws EncryptedDocumentException, IOException 
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
	driver.findElement(By.id("banner-image")).click();
	driver.findElement(By.linkText("Return to Cart")).click();
	WebElement signout=driver.findElement(By.id("nav-link-accountList"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signout).perform();
	driver.findElement(By.xpath("//span[.='Sign Out']")).click();
}
@Test (groups= {"Smoke"})
public void amz_ST_04() throws EncryptedDocumentException, IOException 
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
	signin.click(); //Login
}
@Test (groups= {"Smoke"})
public void amz_ST_05() throws EncryptedDocumentException, IOException 
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
	WebElement signout=driver.findElement(By.id("nav-link-accountList"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signout).perform();
	driver.findElement(By.xpath("//span[.='Sign Out']")).click(); // log out
}
@Test(groups= {"System","Smoke"})
public void amz_ST_06() throws EncryptedDocumentException, IOException 
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
	driver.findElement(By.id("add-to-cart-button")).click();
	WebElement signout=driver.findElement(By.id("nav-link-accountList"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signout).perform();
	driver.findElement(By.xpath("//span[.='Sign Out']")).click();// add to card button
}
@Test(groups= {"System","Smoke"})
public void amz_ST_07() throws EncryptedDocumentException, IOException 
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
	driver.findElement(By.id("add-to-cart-button")).click();
    driver.findElement(By.id("sw-gtc")).click();
    driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click(); 
    WebElement signout=driver.findElement(By.id("nav-link-accountList"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signout).perform();
	driver.findElement(By.xpath("//span[.='Sign Out']")).click();//Delete Cart added product
}
@Test(groups= {"System","Smoke"})
public void amz_ST_08() throws EncryptedDocumentException, IOException 
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.name("proceedToRetailCheckout")).click();
	WebElement signout=driver.findElement(By.id("nav-link-accountList"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signout).perform();
	driver.findElement(By.xpath("//span[.='Sign Out']")).click();//Proceed to check out 
}
@Test(groups= {"Smoke"})
public void amz_ST_09() throws EncryptedDocumentException, IOException 
{
	FileInputStream fs=new FileInputStream("\\C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\xcel\\Amazon.xlsx");
    Workbook wb =WorkbookFactory.create(fs);
    String pass=wb.getSheet("Credential").getRow(1).getCell(1).getStringCellValue();
    String un=wb.getSheet("Credential").getRow(1).getCell(0).getStringCellValue();
    ChromeDriver driver=new ChromeDriver();
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
    driver.findElement(By.xpath("(//span[.='Over ₹5,000'])[2]")).click(); //over 5000 filter 
}
@Test(groups={"Smoke"})
public void amz_ST_10() throws EncryptedDocumentException, IOException 
{
    ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.amazon.in");
	WebElement language=driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
    Actions a1=new Actions(driver);
    a1.moveToElement(language).perform();
    driver.findElement(By.xpath("//span[.='हिन्दी']")).click(); //Language Select
}
}