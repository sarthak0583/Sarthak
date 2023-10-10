package newone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Relative_Xpath_Gtm_Registration
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
/*		driver.findElement(By.xpath("(//input)[19]")).sendKeys("Sarthak Das");
		driver.findElement(By.xpath("(//input)[20]")).sendKeys("Hello");
		driver.findElement(By.xpath("(//input)[21]")).sendKeys("8984250750");
		driver.findElement(By.xpath("(//input)[22]")).sendKeys("Sarthak");
		driver.findElement(By.xpath("(//input)[23]")).sendKeys("Das");
		driver.findElement(By.xpath("(//input)[24]")).click();
		driver.findElement(By.xpath("(//input)[25]")).click();
		driver.findElement(By.xpath("(//input)[27]")).click();
		driver.findElement(By.xpath("(//input)[28]")).click(); */
		driver.findElement(By.xpath("//input[@id='1']")).sendKeys("Sarthak Das");
		driver.findElement(By.xpath("//input[@id='2']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='3']")).sendKeys("8984250750");
		driver.findElement(By.xpath("//input[@id='4']")).sendKeys("Sarthak");
		driver.findElement(By.xpath("//input[@id='5']")).sendKeys("Das");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
//		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		WebElement relegion=driver.findElement(By.name("menu-431"));
		Select s1=new Select(relegion);
		s1.selectByIndex(1);
//		s1.selectByVisibleText("Sikh");
		WebElement resume=driver.findElement(By.name("file-935"));
	//	resume.click();
		resume.sendKeys("C:\\Users\\Sarthak -FG WFH\\Desktop\\GroTechMinds File Upload pdf.pdf");
		driver.findElement(By.xpath("//input[@name='checkbox-833[]']")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
