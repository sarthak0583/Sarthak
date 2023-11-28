package practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Coordinates 
{
	WebDriver driver;
	@Test
	public void one()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		Point p1=gmail.getLocation();
	    System.out.println(p1.getX());
	    System.out.println(p1.getY());
}
}