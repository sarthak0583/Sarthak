package ddt;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Scenario1 extends Launch_And_Quit 
{
	@Test
	public void ts1() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
		Set<String> parentandchildid=driver.getWindowHandles();
		Iterator<String> rf=parentandchildid.iterator();
		String pi =rf.next();
		System.out.println(pi);
		String ci=rf.next();
		driver.switchTo().window(ci);
		driver.findElement(By.id("buy-now-button")).click();
		driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[1]")).click();
		
	}
}
