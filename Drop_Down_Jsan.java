package newone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Jsan
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sarthak%20-FG%20WFH/Downloads/JSAM.html");
		WebElement religion=driver.findElement(By.id("Relegion"));
		Select s1=new Select(religion);
//		s1.selectByVisibleText("Christian");
//		s1.selectByIndex(1);
		s1.selectByValue("2");
		List<WebElement> dd=s1.getOptions();
		System.out.println(dd.size());
	}

}
