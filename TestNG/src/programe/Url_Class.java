package programe;
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
public class Url_Class 
{
	WebDriver driver;
@Test
public void link() throws IOException
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
		String url=	w1.getAttribute("href");
		//	System.out.println(url);
		toverifyiflinksarevalid(url);		
	}
}
public static void toverifyiflinksarevalid(String url) throws IOException
{
try
{
	URL u1=new URL(url);
	HttpURLConnection rv=(HttpURLConnection) u1.openConnection();
		rv.connect();
			if(rv.getResponseCode()==200)	
			{
				System.out.println(url+"It is a valid link"+ rv.getResponseCode()+ rv.getResponseMessage());
			}
			else
			{
				System.out.println(url+"it is a invalid link"+rv.getResponseCode()+rv.getResponseMessage());
			}
}
catch(NullPointerException a1)
{
	System.out.println("getting null pointer exception but dont worry I have handled this");
}
catch(MalformedURLException a2)
{
	System.out.println("getting MalformedURLException but dont worry I have handled this");
}
}
}
