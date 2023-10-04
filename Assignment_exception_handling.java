package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_exception_handling 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sarthak%20-FG%20WFH/Downloads/JSAM.html");
		try
		{
		WebElement lname=driver.findElement(By.id("121"));
		lname.sendKeys("Das");
		}
		catch(ElementNotInteractableException a1)
		{
			System.out.println("Last Name Componet is Disable");
		}
	}

}
