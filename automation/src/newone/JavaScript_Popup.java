package newone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript_Popup 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sarthak%20-FG%20WFH/Downloads/manish.html");
        driver.switchTo().alert().accept();
        WebElement name=driver.findElement(By.id("1"));
        name.sendKeys("Sarthak");
	}

}
