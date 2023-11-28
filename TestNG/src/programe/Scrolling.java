package programe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling 
{
WebDriver driver;
@Test
public void scroll()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement a1=driver.findElement(By.linkText("Canada"));
	Point p1=a1.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	JavascriptExecutor jse= (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,"+y+")");
}
}
