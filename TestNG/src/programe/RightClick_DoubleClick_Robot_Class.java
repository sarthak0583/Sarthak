package programe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick_DoubleClick_Robot_Class 
{
	ChromeDriver driver;
	@Test
	public void rightclick() throws InterruptedException, AWTException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement mob=driver.findElement(By.linkText("Mobiles"));
		Actions a1=new Actions(driver);
		a1.contextClick(mob).perform();
//		a1.doubleClick(mob).perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
	}
	
}




