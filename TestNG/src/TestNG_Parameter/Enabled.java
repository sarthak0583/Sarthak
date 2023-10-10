package TestNG_Parameter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Enabled 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("AfterMethod");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("AfterSuite");
	}
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("Test2");
	}
}
