package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IRCTC 
{
WebDriver driver;
@Test
public void booking()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement from=driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
	from.sendKeys("Bhubaneswar");
	from.sendKeys(Keys.ENTER);
//	driver.findElement(By.xpath("//div[@class='ng-tns-c19-13 ui-dialog-content ui-widget-content']")).click();
	WebElement to=driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
	to.sendKeys("Pune");
	to.sendKeys(Keys.ENTER);
	WebElement date=driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
	date.sendKeys(Keys.CONTROL+"A");
	date.sendKeys(Keys.BACK_SPACE);
	date.sendKeys("10/12/2023");
	date.sendKeys(Keys.ENTER);
	WebElement catagory=driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[3]/div[1]/div[1]/p-dropdown[1]/div[1]"));
	driver.findElement(By.xpath("//span[.='LADIES']")).click();

	
}
}
