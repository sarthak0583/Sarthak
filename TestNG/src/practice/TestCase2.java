package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reporting_Listeners.class)
public class TestCase2 
{	
WebDriver driver;
@Test
public void one()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("India");
}
}
