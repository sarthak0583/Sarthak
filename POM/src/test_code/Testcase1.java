package test_code;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Validation of login in amazon application with all valid data
import org.testng.annotations.Test;

import datasheet.Data;
import source_code.Login_page;
public class Testcase1 extends Launch_and_quit
{
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		Login_page l1=new Login_page(driver);
		Data.fetchdata();
		l1.un();
		l1.continue_button();
		l1.psw();
		l1.signin();
    }
}
