package TestNG_Parameter;

import org.testng.annotations.Test;

public class Invocation_Count 
{
	@Test(invocationCount=10)
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
