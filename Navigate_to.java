package newone;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_to
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().to("http://www.flipkart.com");
		Thread.sleep(3000);
		driver.navigate().to("http://www.amazon.com");
	}

}
