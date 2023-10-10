package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fb_Login_Using_Multipledata 
{
	WebDriver driver;
@Test(dataProvider="data1")
public void sc1(String un,String psw)
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/login/");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(psw);
	driver.findElement(By.id("loginbutton")).click();
	
}
@DataProvider(name="data1")
public Object[][]login()
{
	Object[][]data=new Object[10][2];
	data[0][0]="sarthakcool223@gmail.com";
	data[0][1]="Sarthak@123";
    data[1][0]="sarthakdas0853@gmail.com";
    data[1][1]="Sarthak#123";
    data[2][0]="mikeaplha416@gmail.com";
    data[2][1]="mikeaplha#123";
    data[3][0]="sarthakdas@gmail.com";
    data[3][1]="Sarthak123";
    data[4][0]="";
	data[4][1]="Sarthak@123";
    data[5][0]="sarthakdas0853@gmail.com";
    data[5][1]="";
    data[6][0]="";
    data[6][1]="";
    data[7][0]="7008963458";
    data[7][1]="Sarthak123";
    data[8][0]="!@#$!&&^%%";
    data[8][1]="455";
    data[9][0]="497008963458";
    data[9][1]="8984250750";
	return data;
	
}
}
