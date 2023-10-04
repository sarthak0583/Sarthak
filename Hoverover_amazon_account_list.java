package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_amazon_account_list 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();   //Hello, sign in
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement accountList=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
//		WebElement accountList=driver.findElement(By.linkText("Hello, sign in"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountList).perform();
	    WebElement signin= driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
	    signin.click();
	}

}
