package programe;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_AutoSugg_Amazon 
{
	WebDriver driver;
@Test
public void autosuggestion()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("Tab");
	List<WebElement> autos=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	int count=autos.size();
	for(int i=0;i<count;i++)
	{
		WebElement w1=autos.get(i);
		System.out.println(w1.getText());
	}
}
}
