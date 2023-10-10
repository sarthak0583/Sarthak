package newone;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Relative_Xpath_Amazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
//		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Shoe");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoe");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Shoe");
	}

}
