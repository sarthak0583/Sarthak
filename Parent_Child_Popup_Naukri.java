package newone;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Popup_Naukri 
{
 public static void main(String[] args) throws InterruptedException 
    {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=EAIaIQobChMIq7GRxaSVgQMV4pBLBR2TOgFCEAAYASAAEgLySvD_BwE&gclsrc=aw.ds");
	    WebElement google=driver.findElement(By.xpath("//button[@name='google-register']"));
	    Thread.sleep(5000);
	    google.click();
	    String parentid= driver.getWindowHandle();
//	    System.out.println(parentid);
	    Set<String> childid= driver.getWindowHandles();
//	    System.out.println(childid);
	    Iterator<String> id=childid.iterator();
	    String pi= id.next(); //separate parent ID
	    String ci= id.next(); //separate Child ID
	    driver.switchTo().window(ci); //Control moved to child
	    driver.findElement(By.id("identifierId")).sendKeys("sarthakcool223@gmail.com"); //Login page google
	    driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
//	    System.out.println(pi);
//	    System.out.println(ci);
	    Thread.sleep(5000);
	    driver.close();
	    driver.switchTo().window(pi); //Control moved to Parent
	    Thread.sleep(5000);
	    driver.close();
	//  driver.quit();
	    
    }
 

}
