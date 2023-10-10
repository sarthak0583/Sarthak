package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Functionality_GTM {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement UN=driver.findElement(By.id("1"));
		UN.sendKeys("Sarthak");
		UN.sendKeys(Keys.CONTROL+"a");
		UN.sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("2")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("3")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("4")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("5")).sendKeys(Keys.CONTROL+"v");
	}

}
