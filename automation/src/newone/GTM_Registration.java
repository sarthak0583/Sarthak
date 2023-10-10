package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_Registration
{
	public static void main(String[] args)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("1")).sendKeys("Sarthak Das");
		driver.findElement(By.id("2")).sendKeys("Hello");
		driver.findElement(By.id("3")).sendKeys("12345xyz");
		driver.findElement(By.id("4")).sendKeys("Sarthak");
		driver.findElement(By.id("5")).sendKeys("Das");
		driver.findElement(By.name("radio-45")).click();
		driver.findElement(By.className("wpcf7-form-control wpcf7-submit has-spinner btn btn-default")).click();
		
		
	}

}
