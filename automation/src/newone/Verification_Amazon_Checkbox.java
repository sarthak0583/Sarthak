package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_Amazon_Checkbox
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement accountlogin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		accountlogin.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("sarthakcool223@gmail.com");
		WebElement click=driver.findElement(By.id("continue"));
		click.click();
		WebElement pass=driver.findElement(By.id("ap_password")); //
		pass.sendKeys("8984250750s");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
	//	WebElement radiobutton=driver.findElement(By.xpath("//span[.='Get It by Tomorrow']"));
		WebElement radiobutton=driver.findElement(By.xpath("//span[.='Get It in 2 Days']"));
		Thread.sleep(9000);
		radiobutton.click();
		Thread.sleep(9000);
		boolean rb=radiobutton.isSelected();
		Thread.sleep(9000);
		System.out.println(rb);
	}

}
