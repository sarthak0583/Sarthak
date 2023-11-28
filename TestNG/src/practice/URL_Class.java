package practice;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class URL_Class 
{
	WebDriver driver;
@Test
public void sc1() throws IOException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int count=links.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement w1=links.get(i);
		String url=w1.getAttribute("href");
		System.out.println(url);
		validation(url);
	}
}
public static void validation(String url) throws IOException
{
	try {
	URL u1=new URL(url);
	HttpURLConnection rv=(HttpURLConnection)u1.openConnection();
	rv.connect();
	

		if(rv.getResponseCode()==200)
		{
			System.out.println("Valid");
			
		}
		else
		{
		System.out.println("invalid");
		}
	}
	catch (NullPointerException m1) 
	{
        System.out.println("Malformed");
	}
	catch (MalformedURLException n1) 
	{
		System.out.println("Null Value");
	}
}
}
