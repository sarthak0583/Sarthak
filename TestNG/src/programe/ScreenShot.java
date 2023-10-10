package programe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot 
{
	ChromeDriver driver;
@BeforeMethod
public void launch()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://grotechminds.com/registration/");
}
@AfterMethod
public void quit() throws InterruptedException 
{
driver.findElement(By.id("1")).sendKeys("Sarthak Das");	
driver.findElement(By.id("2")).sendKeys("Heyy!!");
driver.findElement(By.id("3")).sendKeys("xyz");
driver.findElement(By.id("4")).sendKeys("Sarthak");
driver.findElement(By.id("5")).sendKeys("Das");
driver.findElement(By.xpath("//input[@value='Male']")).click();
WebElement relegion=driver.findElement(By.name("menu-431"));
Thread.sleep(3000);
Select s1=new Select(relegion);
s1.selectByIndex(1);
driver.findElement(By.xpath("//input[@name='file-935']")).sendKeys("C:\\Users\\Sarthak -FG WFH\\Desktop\\GroTechMinds File Upload pdf.pdf");
driver.findElement(By.xpath("//input[@name='checkbox-833[]']")).click();
driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
}
@Test
public void testcase1() throws InterruptedException, IOException
{
	TakesScreenshot t1=driver;
    File ss=t1.getScreenshotAs(OutputType.FILE);
	File f1=new File("C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\ScreenShot\\pass.png");
	FileUtils.copyFile(ss, f1);
	Thread.sleep(3000);
	driver.quit();
	
}
}
