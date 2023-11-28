package practice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoSuggestion 
{
	WebDriver driver;
	@Test
	public void one() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
	/*	WebDriverWait w1 =new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleIs("Google"));*/
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Sarthak");
	
		search.sendKeys(Keys.ENTER);
		List<WebElement> autos= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=autos.size();
		for(int i=0;i<count;i++)
		{
			WebElement w1=	autos.get(i);
	     	String s1=w1.getText();
			System.out.println(s1);
		}
		autos.get(5).click();
}
}