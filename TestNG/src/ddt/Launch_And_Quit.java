package ddt;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Launch_And_Quit extends Credential
{

	ChromeDriver driver;

	@BeforeMethod
	public void lq() throws EncryptedDocumentException, IOException, InterruptedException
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.amazon.in");
	WebElement accountlogin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	accountlogin.click();
	WebElement email=driver.findElement(By.id("ap_email"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Credential c1=new Credential();
	String username=c1.uname();
	email.sendKeys(username);
	WebElement click=driver.findElement(By.id("continue"));
	click.click();
	WebElement pswd=driver.findElement(By.id("ap_password"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String password1=c1.password();
	pswd.sendKeys(password1);
	WebElement signin=driver.findElement(By.id("signInSubmit"));
	signin.click();
}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
	}	
}