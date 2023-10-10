package newone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Shoe");
		List<WebElement> Autos=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(5000);
		int Count=Autos.size();
		System.out.println(Count);
		Thread.sleep(5000);
		Autos.get(3).click();
	}

}
