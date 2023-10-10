package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice
{
	public static void main(String[] args) throws InterruptedException
	{
	EdgeDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Sarthak%20-FG%20WFH/Downloads/manish.html");
	driver.switchTo().alert().accept();
	driver.findElement(By.id("1")).sendKeys("Manish");
	}

}
