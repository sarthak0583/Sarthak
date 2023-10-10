package newone;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
 class Xpath {

	public static void main(String[] args)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Sarthak%20-FG%20WFH/Downloads/learningHTML1%20(1).html");
	    driver.manage().window().maximize();
	    //driver.findElement(By.xpath("//input[@id='1']")).sendKeys("Sarthak");
	    //driver.findElement(By.xpath("/html[1]/body[1]/input[1]")).sendKeys("Sarthak");
	    driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Sarthak");
	    driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Hello");
	    driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("ABC");
	    driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("XYZ");
	    //driver.findElement(By.xpath("((/html/body/form)[1])/input)[2]")).sendKeys("Das"); //Your Last name is Disable
	    //driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]")).click(); //Submit Button
	    driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
	    driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
	    driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
	   // driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]")).click();  //Submit Button
	    driver.findElement(By.xpath("(/html/body/input)[4]")).click();
	    driver.findElement(By.xpath("(/html/body/input)[5]")).click();
	    driver.findElement(By.xpath("(/html/body/input)[6]")).click();
	    driver.findElement(By.xpath("(/html/body/input)[7]")).click();
	}

}
