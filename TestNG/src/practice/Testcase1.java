package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1
{
	WebDriver driver;
	
@Test(retryAnalyzer=practice.Retrylogic.class)
public void one()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search=driver.findElement(By.name("qqq"));
	search.sendKeys("India");
}
}
