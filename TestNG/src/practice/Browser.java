package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser
{
	WebDriver driver;
@Parameters("browser")
@Test
public void one(String nameofthebroswer)
{
	if(nameofthebroswer.equals("Chrome"))
	{
    driver=new ChromeDriver();
    }
	if(nameofthebroswer.equals("Edge"))
	{
    driver=new EdgeDriver();
    }
	if(nameofthebroswer.equals("Firefox"))
	{
    driver=new FirefoxDriver();
    }
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("India");
}

}