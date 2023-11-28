package practice;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot 
{
	WebDriver driver;
	@Test
	public void one() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Sarthak");
		search.sendKeys(Keys.ENTER);
		TakesScreenshot t1=(TakesScreenshot) driver;
	    File ss=t1.getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\ScreenShot\\"+Math.random()+"pass.png");
		FileUtils.copyFile(ss, f1);
}
}