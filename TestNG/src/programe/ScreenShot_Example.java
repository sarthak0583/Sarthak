package programe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot_Example 
{
	@Test
	public void testcase1() throws IOException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://www.google.com");
	 
	 WebElement searchtextfield = driver.findElement(By.name("q"));
	 searchtextfield.sendKeys("India");
	 searchtextfield.sendKeys(Keys.ENTER);
	//  Step 1: - upcasting driver to take ss
	   TakesScreenshot ts= driver;
	 
	 //step 2:
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   
	 //step 3:
	   File destination = new File("C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\ScreenShot\\sarthak.png");
	 
	  //step 4:
	   FileUtils.copyFile(source, destination);
	   
	
}
}
