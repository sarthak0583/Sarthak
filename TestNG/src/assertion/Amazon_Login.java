package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Amazon_Login 
{
WebDriver driver;
@Test
public void login()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in");
	WebElement signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signin).perform();
	driver.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();
	WebElement un=driver.findElement(By.name("email"));
	un.sendKeys("sarthakcool223@gmail.com");
	un.sendKeys(Keys.ENTER);
	WebElement psw=driver.findElement(By.name("password"));
	psw.sendKeys("8984250750s");
	psw.sendKeys(Keys.ENTER);
	Assertion a2=new Assertion();
	a2.assertEquals("Amazon Sign In", driver.getTitle());
}
}
