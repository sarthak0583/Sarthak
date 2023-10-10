package TestNG_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Timeout_Class
{
	ChromeDriver driver;
	@BeforeMethod
	public void lunch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
	}
    @Test(timeOut=1000)
    public void testcase1()
    {
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void quit() throws InterruptedException
    {
    Thread.sleep(3000);
	driver.quit();
    }
}
