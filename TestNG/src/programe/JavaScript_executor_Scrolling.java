package programe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_executor_Scrolling 
{
WebDriver driver;
@Test
public void one() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.youtube.com/");
	for(int i=5;i>3;i++)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
	}
}
}
