package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BD_BioScience
{
@Test
public void bd() throws InterruptedException
{
//	ChromeDriver driver=new ChromeDriver();
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.bdbiosciences.com/en-us");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[.='Stay Here']")).click();
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	driver.findElement(By.xpath("//span[.='Products']")).click();
    driver.findElement(By.xpath("//span[.='Flow Cytometers']")).click();
	driver.findElement(By.linkText("View Products")).click();
	driver.navigate().to("https://login.bd.com/bdciam.onmicrosoft.com/oauth2/v2.0/authorize?p=B2C_1A_BDB_SISU&client_id=49269b80-fbef-4194-be7f-9163a39efd86&redirect_uri=https://www.bdbiosciences.com/content/bdb/paths/sso-customer-login&scope=openid+profile&response_type=code&ui_locale=en-us&state=security_token=ztMJvDhZfg7xGr9xPHdC0K6SMencrKBbDp6c6IqJ6LXWuaWJTXGSlvFCwjSx7brD@@separator@@bdbUS@@separator@@url=https://www.bdbiosciences.com/en-us/products/instruments/flow-cytometers/clinical-cell-analyzers&_gl=1*6whjyd*_ga*MjEyMzM2OTIwNy4xNjk1NzI0ODM3*_ga_LL7XK30S8W*MTY5NTcyNDgzNy4xLjEuMTY5NTcyNTU2NC4zNy4wLjA.");
    driver.findElement(By.id("locale-create-account")).click();
    driver.findElement(By.id("firstName")).sendKeys("Mike");
    driver.findElement(By.id("lastName")).sendKeys("alpha");
	driver.findElement(By.id("company")).sendKeys("NA");
	driver.findElement(By.id("phone")).sendKeys("7008963458");
	driver.findElement(By.id("mobile")).click();
	driver.findElement(By.id("email")).sendKeys("mikealpha416@gmail.com");
	driver.findElement(By.id("password")).sendKeys("8984250750@Ss");
	driver.findElement(By.id("confPassword")).sendKeys("8984250750@Ss");
	driver.findElement(By.xpath("//a[@aria-label='BDB Logo']")).click();
	driver.findElement(By.xpath("//span[.='Products']")).click();
    WebElement instrument=driver.findElement(By.xpath("//span[.='Instruments']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(instrument).perform();
	Thread.sleep(3000);
	WebElement cyclometer=driver.findElement(By.xpath("//span[.='Flow Cytometers']"));
	Actions a7=new Actions(driver);
	a7.moveToElement(cyclometer).perform();
	Thread.sleep(3000);
	WebElement clinical=driver.findElement(By.xpath("//span[.='Clinical Sample Prep Systems']"));
	Actions a8=new Actions(driver);
	a8.moveToElement(clinical).perform();
	Thread.sleep(3000);
	WebElement singlecell=driver.findElement(By.xpath("//span[.='Single-Cell Multiomics Systems']"));
	Actions a9=new Actions(driver);
	a9.moveToElement(singlecell).perform();
	Thread.sleep(3000);
	WebElement reagent=driver.findElement(By.xpath("//span[.='Reagents']"));
	Actions a2=new Actions(driver);
	a2.moveToElement(reagent).perform();
	Thread.sleep(3000);
	WebElement si=driver.findElement(By.xpath("//span[.='Software & Informatics']"));
	Actions a3=new Actions(driver);
	a3.moveToElement(si).perform();
	Thread.sleep(3000);
	WebElement services=driver.findElement(By.xpath("//span[.='Services']"));
	Actions a4=new Actions(driver);
	a4.moveToElement(services).perform();
	Thread.sleep(3000);
	WebElement bloodcollection=driver.findElement(By.xpath("//span[.='Blood Collection']"));
	Actions a5=new Actions(driver);
	a5.moveToElement(bloodcollection).perform();
	Thread.sleep(3000);
	WebElement promotion=driver.findElement(By.xpath("//span[.='Promotions']"));
	Actions a6=new Actions(driver);
	a6.moveToElement(promotion).perform();
}
}
