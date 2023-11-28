package mmt;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class Make_My_Trip extends LaunchAndQuit 
{

@Test(enabled=false)
public void booking() throws InterruptedException
{
	WebElement frame1=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.xpath("(//span[@class='headerIconTextAlignment chNavText darkGreyText'])[5]")).click();
	driver.findElement(By.xpath("//label[@class='makeFlex column latoRegular']")).sendKeys("Pune");
	Thread.sleep(3000);
	driver.findElement(By.id("toCity")).sendKeys("bbs");
	Thread.sleep(3000);
	List<WebElement> to=driver.findElements(By.xpath("//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']/ul/li"));
	to.get(0).click();
	driver.findElement(By.id("travelDate")).click();
	driver.findElement(By.xpath("//div[@aria-label='Tue Dec 12 2023']")).click();
	driver.findElement(By.xpath("//div[@class='code latoBlack font32 blackText makeRelative']")).click();
	List<WebElement> clas=driver.findElements(By.xpath("//div[@class='rsw_inputBox travelFor inactiveWidget activeWidget']/ul/li"));
	clas.get(2).click();
	driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
	driver.findElement(By.id("train_options_12-12-2023_0")).click();
	driver.findElement(By.xpath("(//div[@class='cg-radio-button-inner false'])[2]")).click();
	driver.findElement(By.id("contactEmail")).sendKeys("Sarthakcool223@gmail.com");
	driver.findElement(By.id("mobileNumber")).sendKeys("7008963458");
	driver.findElement(By.xpath("//a[@class='paymentBtn whiteText latoBlack font16 capText']")).click();
}
@Test(enabled=false)
public void checkpnr() throws EncryptedDocumentException, IOException
{
	WebElement frame1=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.xpath("(//span[@class='headerIconTextAlignment chNavText darkGreyText'])[5]")).click();
	driver.findElement(By.xpath("//span[.='Check PNR Status']")).click();
	Credentials c1=new Credentials();
	c1.data();
	driver.findElement(By.id("pnr")).sendKeys(c1.pnr);
	driver.findElement(By.xpath("//a[.='CHECK STATUS']")).click(); 
}
@Test
public void livestatus() throws InterruptedException
{
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.xpath("//span[.='Live Train Status']")).click();
	WebElement trainNum=driver.findElement(By.id("trainNum"));
	trainNum.click();
}
@Test(enabled=false)
public void flight() throws InterruptedException, EncryptedDocumentException, IOException
{
/*	WebElement frame1=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();*/
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.id("fromCity")).sendKeys("BBI");
	List<WebElement> from=driver.findElements(By.xpath("//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']/ul/li"));
	Thread.sleep(3000);
	from.get(0).click();
	driver.findElement(By.id("toCity")).sendKeys("pune");
	List<WebElement> to=driver.findElements(By.xpath("//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']/ul/li"));
	Thread.sleep(3000);
	to.get(0).click();
	driver.findElement(By.xpath("//div[@aria-label='Tue Dec 05 2023']")).click();
	driver.findElement(By.xpath("//span[.='Travellers & Class']")).click();
	driver.findElement(By.xpath("//li[@data-cy='adults-3']")).click();
	driver.findElement(By.xpath("//li[@data-cy='children-3']")).click();
	driver.findElement(By.xpath("//li[@data-cy='infants-2']")).click();
	driver.findElement(By.xpath("//button[.='APPLY']")).click();
	driver.findElement(By.xpath("//a[.='Search']")).click();
	driver.findElement(By.xpath("//span[@class='bgProperties  overlayCrossIcon icon20']")).click();
	driver.findElement(By.xpath("(//div[@class='makeFlex spaceBetween appendBottom12'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='makeFlex spaceBetween appendBottom12'])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='makeFlex spaceBetween appendBottom12'])[3]")).click();
/*	WebElement checkbox=driver.findElement(By.id("listingFilterCheckbox"));
	checkbox.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[.='View Prices'])[1]")).click();
	driver.findElement(By.xpath("(//button[.='Book Now'])[1]")).click();
	Set<String> pcid=driver.getWindowHandles();
	Iterator<String> rf=pcid.iterator();
	String pid=rf.next();
	String cid=rf.next();
	driver.switchTo().window(cid);
//	driver.findElement(By.xpath("//span[.='MMTSUPER']")).click();
	driver.findElement(By.xpath("(//span[@class='customRadioBtn sizeSm primary '])[2]")).click();
	Thread.sleep(1000);
	Credentials c1=new Credentials();
	c1.data();
	driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys(c1.phoneno);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(c1.emailid);
//	driver.findElement(By.xpath("//input[@name='cb_gst_info']")).click();
	driver.findElement(By.xpath("//button[.='Continue']")).click();*/
}

//@Test(retryAnalyzer=mmt.Retry_MMT.class,groups= {"Smoke"},priority=2)
public void roundtrip() throws InterruptedException
{
/*	WebElement frame1=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();*/
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[3]")).click();
	driver.findElement(By.xpath("(//li[@class='font12 blackText wrapFilter  '])[1]")).click();
	WebElement link=driver.findElement(By.xpath("//input[@placeholder='Enter Mobile number ']"));
	Point p1=link.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,"+y+")");
}
@Test(enabled=false)
public void login() throws EncryptedDocumentException, IOException
{
	WebElement frame1=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
	WebElement un=driver.findElement(By.name("username"));
	Credentials c1=new Credentials();
	c1.data();
	un.sendKeys(c1.emailid);
/*	driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c']")).click();
	Set<String> parrentchild=driver.getWindowHandles();
	Iterator<String> rf=parrentchild.iterator();
	String pid=rf.next();
	String cid=rf.next();
	driver.switchTo().window(cid);
	WebElement un=driver.findElement(By.name("identifier"));
	un.sendKeys("sarthakcool223@gmail.com");
	un.sendKeys(Keys.ENTER);*/
	
}
}