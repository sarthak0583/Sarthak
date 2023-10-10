package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ecommerse
{
@Test
public void app()
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/shop/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Books");
	driver.findElement(By.xpath("//button[.='Filter']")).click();
	driver.findElement(By.xpath("//a[@data-product_id='72336']")).click();
	driver.findElement(By.xpath("//a[@class='button wc-forward']")).click();
	
	
	
	
	
	
	
}
}
