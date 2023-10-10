package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath_fblogin
{
public static void main(String[] args)
    {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
/*	driver.findElement(By.xpath("(//input)[3]")).sendKeys("9040750650");
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("8984250750");
	driver.findElement(By.xpath("(//button)")).click();*/
	//..................
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9040750650");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8984250750");
//	driver.findElement(By.xpath("//button[@id='u_0_5_hf']")).click();
	driver.findElement(By.xpath("//button[@name='login']")).click(); 
	//...............
/*	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("9040750650");
	driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("8984250750");
	driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();   */
	}

}
