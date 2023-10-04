package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Loging
{
	public static void main(String[] args)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sarthakcool223@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("7008963458");
		driver.findElement(By.name("login")).click();
		}

}
