package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orderof_Annotation2 
{
@Test
public void add()
{
	System.out.println("Add");
}
@Test
public void substract()
{
	System.out.println("Substract");
}
@AfterMethod
public void am()
{
	System.out.println("After Method");
}
@BeforeMethod
public void bm()
{
	System.out.println("Before Method");
}
}
