package newone;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LaunchBrowser 
{
	public static void main(String[] args)
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.google.com/");
		c1.get("https://www.youtube.com/");
		String title =c1.getTitle();
		System.out.println(c1.getWindowHandle());
		System.out.println(title);
		/*c1.close();
		c1.quit();
		EdgeDriver e1= new EdgeDriver();
		e1.get("https://www.google.com/");
		String title1=e1.getTitle();
		System.out.println(title1);
		e1.close();*/
	
	}
}
