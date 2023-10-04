package newone;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Popup_Amazon
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement accountlogin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		accountlogin.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("sarthakcool223@gmail.com");
		WebElement click=driver.findElement(By.id("continue"));
		click.click();
		WebElement pass=driver.findElement(By.id("ap_password")); //
		pass.sendKeys("8984250750s");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Set<String> parentandchildid=driver.getWindowHandles();
		Iterator<String> rf=parentandchildid.iterator();
		String pi =rf.next();
		String ci=rf.next();
		driver.switchTo().window(ci);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
/*		driver.findElement(By.id("buy-now-button")).click();
		driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='pp-UTgI8K-119']")).click();*/
	}

}
