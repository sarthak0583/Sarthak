package smoketestingofamazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launch_Quit 
{
	ChromeDriver driver;
@BeforeMethod
public void launch()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in");
	WebElement accountlogin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	accountlogin.click();
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys("sarthakcool223@gmail.com");
	WebElement click=driver.findElement(By.id("continue"));
	click.click();
	WebElement pass=driver.findElement(By.id("ap_password")); //
	pass.sendKeys("8984250750s");
	WebElement signin=driver.findElement(By.id("signInSubmit"));
	signin.click();
}
@AfterMethod
public void quit() throws InterruptedException, IOException
{
	Thread.sleep(3000);
/*	TakesScreenshot t1=driver;
	File Source=t1.getScreenshotAs(OutputType.FILE);
	launch_Quit l1=new launch_Quit ();
//	File destination=new File("C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\ScreenShot\\Sarthak"+Math.random()+".png");
	FileUtils.copyFile(Source, destination);*/
	driver.quit();
	
}
}
