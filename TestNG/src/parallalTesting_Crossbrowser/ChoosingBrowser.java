package parallalTesting_Crossbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChoosingBrowser 
{
	WebDriver driver;
	
@Test
@Parameters("browser")
public void ts1(String nameofthebrowser)
{
	if(nameofthebrowser.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	if(nameofthebrowser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	if(nameofthebrowser.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("India");
}
}
