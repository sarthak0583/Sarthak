package programe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gtm 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/registration/");
	}
    @Test
    public void test1() throws InterruptedException
    {
    	driver.findElement(By.xpath("//input[@id='1']")).sendKeys("Sarthak Das");
		driver.findElement(By.xpath("//input[@id='2']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='3']")).sendKeys("8984250750");
		driver.findElement(By.xpath("//input[@id='4']")).sendKeys("Sarthak");
		driver.findElement(By.xpath("//input[@id='5']")).sendKeys("Das");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		WebElement relegion=driver.findElement(By.name("menu-431"));
		Select s1=new Select(relegion);
		Thread.sleep(3000);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		WebElement resume=driver.findElement(By.name("file-935"));
		resume.sendKeys("C:\\Users\\Sarthak -FG WFH\\Desktop\\GroTechMinds File Upload pdf.pdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='checkbox-833[]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
    }
	 @AfterMethod
		public void quit() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.quit();
		}
}