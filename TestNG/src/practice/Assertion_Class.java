package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertion_Class
{
WebDriver driver;
@Test
public void one()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search=driver.findElement(By.name("q"));;
	search.sendKeys("India");
	Assertion a1=new Assertion();
	a1.assertEquals("Google", driver.getTitle());
	search.sendKeys(Keys.ENTER);
}
}
