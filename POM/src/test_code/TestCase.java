package test_code;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source_code.Home_Page;
import source_code.Login_page;

class TestCase 
{
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
Login_page l1=new Login_page(driver);
l1.un();
l1.continue_button();
l1.psw();
l1.signin();
Home_Page h1=new Home_Page(driver);
h1.search();
h1.searchclick();
h1.mobile();
	}
}
