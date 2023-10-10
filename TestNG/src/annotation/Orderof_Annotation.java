package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Orderof_Annotation 
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
@Test
public void test()
{
	System.out.println("Test");
}
}
