package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orderof_Annotation4 
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
@Test
public void multiplication()
{
	System.out.println("Multiplication");
}
@BeforeMethod
public void bm()
{
	System.out.println("Before Method");
}
@AfterMethod
public void am()
{
	System.out.println("After Method");
}
}
