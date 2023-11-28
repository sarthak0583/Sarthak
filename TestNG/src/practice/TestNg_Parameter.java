package practice;

import org.testng.annotations.Test;

public class TestNg_Parameter 
{
@Test(priority=2)
public void one()
{
	System.out.println("3");
}
@Test(priority=-1)
public void two()
{
	System.out.println("1");
}
@Test()
public void three()
{
	System.out.println("2");
}
@Test(invocationCount=5)
public void four()
{
	System.out.println("4");
}
@Test(enabled=false)
public void five()
{
	System.out.println("5");
}
}
