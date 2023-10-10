package newone;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Relative_xpath_Flipkart_Login
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
   /* 	driver.findElement(By.xpath("(//input)[7]")).sendKeys("8984250750");
    	driver.findElement(By.xpath("(//button)[3]")).click();*/
    //  driver.findElement(By.xpath("(//button)[2]")).click();   //For cross button
	    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8984250750");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}

}
