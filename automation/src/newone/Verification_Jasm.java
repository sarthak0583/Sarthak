package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_Jasm
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sarthak%20-FG%20WFH/Downloads/JSAM.html");
	//	WebElement lname=driver.findElement(By.id("121"));
		WebElement lname=driver.findElement(By.id("1"));
		boolean l1=lname.isEnabled();
		System.out.println(l1);
		boolean l2=lname.isDisplayed();
		System.out.println(l2);
		WebElement radiobutton=driver.findElement(By.id("123"));
//		radiobutton.click();
		boolean l3=radiobutton.isSelected();
		System.out.println(l3);
	}

}
