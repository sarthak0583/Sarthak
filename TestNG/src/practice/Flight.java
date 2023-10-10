package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Flight
{
	@Test
	public void login() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/flights/");
	//	driver.findElement(By.xpath("//input[@value='One way']")).click();
		driver.findElement(By.xpath("//input[@value='Round trip']")).click();
		WebElement from= driver.findElement(By.xpath("(//Select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control select2-hidden-accessible'])"));
        Select s1=new Select(from);
		s1.selectByIndex(2);
		WebElement to=driver.findElement(By.xpath("(//Select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control select2-hidden-accessible'])[2]"));
		Select s2=new Select(to);
		s2.selectByIndex(5);
		driver.findElement(By.name("Departon")).sendKeys("12052023");
		driver.findElement(By.name("Returnon")).sendKeys("21092023");
		WebElement adult=driver.findElement(By.xpath("(//Select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control select2-hidden-accessible'])[3]"));
		Select s3=new Select(adult);
		s3.selectByIndex(0);
		Thread.sleep(5000);
		WebElement Children=driver.findElement(By.xpath("(//Select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control select2-hidden-accessible'])[4]"));
		Select s4=new Select(Children);
		s4.selectByIndex(1);
		Thread.sleep(5000);
		WebElement Infants=driver.findElement(By.xpath("(//Select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control select2-hidden-accessible'])[5]"));
		Select s5=new Select(Infants);
		s5.selectByIndex(2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='wpcf7-form-control wpcf7-submit has-spinner btn btn-default'])[1]")).click();
	}

}
