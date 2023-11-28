package programe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop
{
	WebDriver driver;
	
@Test
public void drapanddrop()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://grotechminds.com/drag-and-drop/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement drag=driver.findElement(By.id("drag7"));
	WebElement drop=driver.findElement(By.id("div2"));
	Actions a1=new Actions(driver);
	a1.dragAndDrop(drag, drop).perform();
	
}
}
