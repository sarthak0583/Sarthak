package newone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Google
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Searchbox=driver.findElement(By.id("APjFqb"));
		Searchbox.sendKeys("Jagannath");
		List<WebElement> Autos=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int count=Autos.size();
		System.out.println(count);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Autos.get(3).click();
		Autos.get(count-6).click();
	
	
	}

}
