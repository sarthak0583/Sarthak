package practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverOver 
{
	WebDriver driver;
	@Test
	public void one()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
}
}