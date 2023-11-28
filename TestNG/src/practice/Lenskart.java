package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lenskart 
{
WebDriver driver;
@Test
public void one()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.lenskart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement kidsglass=driver.findElement(By.id("lrd11"));
	Actions a1=new Actions(driver);
	a1.moveToElement(kidsglass).perform();
	driver.findElement(By.xpath("//div[.='Zero Power Computer Glasses']")).click();
	driver.findElement(By.xpath("(//div[@class='ImageContainer--1o9gw5f fMYMyj'])[1]")).click();
	Set<String> parentchildid=driver.getWindowHandles();
	Iterator<String> rf=parentchildid.iterator();
	String pid=rf.next();
	String cid=rf.next();
	driver.switchTo().window(cid);
	driver.findElement(By.id("btn-primary")).click();
	driver.findElement(By.xpath("//img[@title='Lenskart']")).click();
	WebElement storelocator=driver.findElement(By.id("lrd9"));
	Actions a2=new Actions(driver);
	a2.moveToElement(storelocator).perform();
	
	
	
	
	
	}
}
