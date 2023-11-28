package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exam 
{
WebDriver driver;
@Test
public void login()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement From=driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
	From.sendKeys("Bangalore");
	From.sendKeys(Keys.ENTER);
	WebElement to=driver.findElement(By.cssSelector(".ng-tns-c57-9.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ui-autocomplete-input.ng-star-inserted"));
	to.sendKeys("DELHI");
	to.sendKeys(Keys.ENTER);
	WebElement date=driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
	date.sendKeys(Keys.CONTROL+"A");
	date.sendKeys(Keys.BACK_SPACE);
	date.sendKeys("31/12/2023");
	driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
}
}
