package test_code;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Validation of login in amazon application and seraching a product
import org.testng.annotations.Test;

import datasheet.Data;
import source_code.Home_Page;
import source_code.Login_page;

public class TestCase2 extends Launch_and_quit
{
	@Test
	public void sc2() throws EncryptedDocumentException, IOException
	{
		   Login_page l1=new Login_page(driver);
			Data.fetchdata();
			l1.un();
			l1.continue_button();
			l1.psw();
			l1.signin();
	       Home_Page h1=new Home_Page(driver);
	        h1.search();
	        h1.searchclick();
}
}
