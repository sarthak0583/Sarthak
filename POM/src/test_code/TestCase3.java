package test_code;
import java.io.IOException;
//Validation of login in amazon application and seraching a product and adding it to wishlist
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source_code.AddToCart_Page;
import source_code.Home_Page;
import source_code.Whistlist_Page;
public class TestCase3 extends Launch_and_quit
{
	@Test
	public void sc3() throws EncryptedDocumentException, IOException
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
	Whistlist_Page w1=new Whistlist_Page(driver);
	w1.whislist();
/*	w1.creatlist();
	w1.countinueshopping();*/
}
}
