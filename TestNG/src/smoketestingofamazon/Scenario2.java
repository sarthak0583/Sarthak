package smoketestingofamazon;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Scenario2 extends launch_Quit
{
	@Test
	public void testcase1() throws InterruptedException, IOException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
		Set<String> parentandchildid=driver.getWindowHandles();
		Iterator<String> rf=parentandchildid.iterator();
		String pi =rf.next();
		String ci=rf.next();
		driver.switchTo().window(ci);
		driver.findElement(By.id("buy-now-button")).click();
		driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]")).click();
		TakesScreenshot t1=driver;
		File Source=t1.getScreenshotAs(OutputType.FILE);
		Scenario2 s2=new Scenario2 ();
		File destination=new File("C:\\Users\\Sarthak -FG WFH\\eclipse-workspace\\TestNG\\ScreenShot\\Guddu"+s2.getClass()+".png");
		FileUtils.copyFile(Source, destination);
	}
}
