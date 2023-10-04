package newone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Flipkart 
{ 
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
  //   	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//button[.='✕']")).click();	
		WebElement Searchbox=driver.findElement(By.name("q"));
		Searchbox.sendKeys("mobile");
		List<WebElement> Autos=driver.findElements(By.xpath("//form[@class='_2M8cLY header-form-search']/ul/li"));
		Thread.sleep(5000);
		int count=Autos.size();
		System.out.println(count);
		Thread.sleep(5000);
		Autos.get(3).click();		
	}

}
