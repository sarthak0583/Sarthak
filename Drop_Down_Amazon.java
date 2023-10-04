package newone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Amazon
{
	public static void main(String[] args) 
	{
	//	ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement login= driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(login);
	//	s1.selectByIndex(2);
		s1.selectByValue("search-alias=beauty");
	//	s1.selectByVisibleText("Baby");
		List<WebElement> count=	s1.getOptions();
		System.out.println(count.size());

	}

}
