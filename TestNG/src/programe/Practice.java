package programe;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice 
{
	ChromeDriver driver;
@Test
public void auth() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/gp/buy/payselect/handlers/display.html?_from=cheetah");
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
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
	Set<String> parentandchildid=driver.getWindowHandles();
	Iterator<String> rf=parentandchildid.iterator();
	String pi =rf.next();
	String ci=rf.next();
	driver.switchTo().window(ci);
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='ppw-instrumentRowSelection']")).click();
//	driver.findElement(By.id("pp-Fo0rRy-102")).click();
//	driver.findElement(By.xpath("//span[.='Credit or debit card']")).click();
}
}
