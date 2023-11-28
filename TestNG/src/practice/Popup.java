package practice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popup
{
	WebDriver driver;
	@Test
	public void one() throws AWTException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.navigate().to("https://grotechminds.com/javascript-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.switchTo().alert().accept();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.name("google-register")).click();
		Set<String> parrentchild=driver.getWindowHandles();
		Iterator<String> i1=parrentchild.iterator();
		String parentid=i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		driver.findElement(By.name("identifier")).sendKeys("sarthakcool223@gmail.com");
		driver.close();
		
		
}
}