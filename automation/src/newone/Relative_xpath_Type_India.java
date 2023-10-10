package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath_Type_India
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	//	driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("India");
	//	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("India");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("India");
	}

}
