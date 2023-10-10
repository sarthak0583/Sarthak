package annotation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class Orderof_Annotation5 
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
	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
}
