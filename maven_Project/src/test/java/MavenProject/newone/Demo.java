package MavenProject.newone;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		System.out.println("Hii");
	}

}
