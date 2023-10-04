package newone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Selector {

	public static void main(String[] args) 
	{

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement s=driver.findElement(By.cssSelector("input[name=field-keywords]")); 
		s.sendKeys("Tab");
		s.sendKeys(Keys.ENTER);
		driver.navigate().to("https://www.amazon.in");
		WebElement s1=driver.findElement(By.cssSelector("input#twotabsearchtextbox")); //Css using Tagname.id
		s1.sendKeys("Laptop");
		s1.sendKeys(Keys.ENTER);
		WebElement s2=driver.findElement(By.cssSelector("div.layoutToolbarPadding")); //Css using Tagname
		s2.click();
		driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
		WebElement s3=driver.findElement(By.cssSelector("input.sbq[name=p]")); //Css using Tagname.classname[AN=AV]
		s3.sendKeys("India");
		s3.sendKeys(Keys.ENTER);
		
	
	}

}
