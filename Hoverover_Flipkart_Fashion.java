package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_Flipkart_Fashion
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click(); //Men's Top Wear
	    WebElement fashion=driver.findElement(By.xpath("(//div[@class='_1psGvi SLyWEo'])[1]"));
		Thread.sleep(3000);
		Actions a1= new Actions(driver);
		a1.moveToElement(fashion).perform();
		WebElement CasualShirts =driver.findElement(By.linkText("Men's Casual Shirts"));
		CasualShirts.click();
	}

}
