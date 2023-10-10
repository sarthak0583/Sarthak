package programe;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_Dropdown_Amazon
{
	WebDriver driver;
	@Test
	
	public void link()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("searchDropdownBox")).click();
		List<WebElement> dd=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		int count=dd.size();
		for(int i=0;i<count;i++)
		{
			WebElement w1=dd.get(i);
			System.out.println(w1.getText());
		}
}
}