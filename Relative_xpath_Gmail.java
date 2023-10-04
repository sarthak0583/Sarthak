package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath_Gmail {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	//  driver.findElement(By.xpath("(//a)[1]")).click();
	//	driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).click();
		driver.findElement(By.xpath("//a[@data-pid='23']")).click();
	}

}
