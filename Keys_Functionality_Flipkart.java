package newone;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Keys_Functionality_Flipkart
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();	
		WebElement Searchbox=driver.findElement(By.name("q"));
		Searchbox.sendKeys("Shoe");
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
			Searchbox.sendKeys(Keys.DOWN);
		}
		Thread.sleep(2000);
		Searchbox.click();
	/*	Searchbox.sendKeys(Keys.DOWN);
		Searchbox.sendKeys(Keys.DOWN);
		Searchbox.sendKeys(Keys.DOWN);
	*/
	}

}
