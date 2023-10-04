package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinateof_Componet {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement canada=driver.findElement(By.linkText("Canada"));
		Point coordinate=canada.getLocation();
		System.out.println(coordinate.getX());
		System.out.println(coordinate.getY());
	}

}
