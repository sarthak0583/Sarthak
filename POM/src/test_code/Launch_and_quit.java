package test_code;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Testcase1-------
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import source_code.Login_page;
public class Launch_and_quit 
{
	WebDriver driver;
	@BeforeMethod
	public void launch() throws EncryptedDocumentException, IOException
	{
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
/*	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}*/
}
