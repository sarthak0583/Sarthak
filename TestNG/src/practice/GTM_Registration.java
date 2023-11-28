package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GTM_Registration 
{
WebDriver driver;
@Test
public void registration()
{
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://grotechminds.com/registration/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("1")).sendKeys("sarthakdas");
	driver.findElement(By.id("3")).sendKeys("das123");
	driver.findElement(By.id("4")).sendKeys("sarthak");
	driver.findElement(By.id("5")).sendKeys("das");
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	WebElement skill=driver.findElement(By.name("menu-600"));
	Select s1=new Select(skill);
	s1.selectByIndex(1);
	WebElement course=driver.findElement(By.name("menu-802"));
	Select s2=new Select(course);
	s2.selectByIndex(3);
	WebElement country=driver.findElement(By.name("country"));
	Select s3=new Select(country);
	s3.selectByVisibleText("India");
	driver.findElement(By.name("paddress")).sendKeys("xyz");
	driver.findElement(By.name("permanentaddress")).sendKeys("abcd");
	driver.findElement(By.name("pincode")).sendKeys("465265");
	WebElement relegion=driver.findElement(By.name("menu-431"));
	Select s4=new Select(relegion);
	s4.selectByVisibleText("Buddhist");
	driver.findElement(By.name("file-935")).sendKeys("C:\\Users\\Sarthak -FG WFH\\Desktop\\GroTechMinds File Upload pdf.pdf");
	driver.findElement(By.name("checkbox-833[]")).click();
	driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
	
}
}
