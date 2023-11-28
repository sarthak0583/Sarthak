package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wayfair 
{
	WebDriver driver;
	@Test
	public void one()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wayfair.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
