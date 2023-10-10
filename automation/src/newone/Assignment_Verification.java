package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Verification {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sarthak%20-FG%20WFH/Downloads/JSAM.html");
		WebElement un=driver.findElement(By.id("1"));
		boolean un1=un.isEnabled();
		boolean un2=un.isDisplayed();
		if(un1 && un2)
		{
			System.out.println("Componet is enabled and displyed");
		}
		else
		{
			System.out.println("Not Sure that componet is enanled and displayed");
		}
		WebElement lname=driver.findElement(By.id("121"));
		boolean lname1=lname.isEnabled();
		boolean lname2=lname.isDisplayed();
		if(lname1 && lname2)
		{
			System.out.println("Either the Componet is enabled or displyed");
		}
		else
		{
			System.out.println("Not Sure that componet is enanled or displayed");
		}
	}

}
