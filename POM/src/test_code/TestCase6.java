package test_code;
import java.io.IOException;
//Validation of login in amazon application with valid email and click on forget password link and find out forget password page.
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source_code.Address_Page;
import source_code.Buynow_Page;
import source_code.Home_Page;

public class TestCase6 extends Launch_and_quit
{
	@Test
	public void sc6() throws EncryptedDocumentException, IOException
	{
	Home_Page h1=new Home_Page(driver);
	h1.search();
	h1.searchclick();
	h1.mobile();
	Set<String> pc=driver.getWindowHandles();
	Iterator<String> rf=pc.iterator();
	String parent_id=rf.next();
	String child_id=rf.next();
	driver.switchTo().window(child_id);
	Buynow_Page b1=new Buynow_Page(driver);
	b1.buynow();
	Address_Page a1=new Address_Page(driver);
	a1.address();
}
}
