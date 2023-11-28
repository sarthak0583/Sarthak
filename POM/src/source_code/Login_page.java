package source_code;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datasheet.Data;

public class Login_page extends Data
{
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement username;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	Data d1=new Data();
	public void un() throws EncryptedDocumentException, IOException
	{
		
	  //  String uname=d1.username();
		username.sendKeys(un);
	}
	public void continue_button()
	{
		continue_button.click();
	}
	public void psw() throws EncryptedDocumentException, IOException
	{
	//	String pass=d1.password();
		password.sendKeys(psw);
	}
	public void signin()
	{
		signin_button.click();
	}
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

