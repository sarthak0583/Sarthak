package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Orderof_Annotation1 
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
	public void test()
	{
		System.out.println("Test");
	}
}
