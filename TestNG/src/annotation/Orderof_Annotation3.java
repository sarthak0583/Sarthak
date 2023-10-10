package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orderof_Annotation3 
{
@BeforeSuite
public void bs()
{
	System.out.println("1");
}
@BeforeTest
public void bt()
{
	System.out.println("2");
}
@BeforeClass
public void bc()
{
	System.out.println("3");
}
@BeforeMethod
public void bm()
{
	System.out.println("4");
}
@Test
public void logout() //execute in Alphabetic order
{
	System.out.println("7");
}
@Test 
public void login() //execute in Alphabetic order
{
	System.out.println("5");
}
@AfterSuite
public void as()
{
	System.out.println("10");
}
@AfterTest
public void at()
{
	System.out.println("9");
}
@AfterClass
public void ac()
{
	System.out.println("8");
}
@AfterMethod
public void am()
{
	System.out.println("6");
}
}
