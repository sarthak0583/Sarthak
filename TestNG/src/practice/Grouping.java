package practice;

import org.testng.annotations.Test;

public class Grouping 
{
@Test(groups={"Smoke","System"})
public void one()
{
	System.out.println("1");
}
@Test(groups={"Smoke"})
public void two()
{
	System.out.println("2");
}
@Test(groups={"Smoke","System"})
public void three()
{
	System.out.println("3");
}
@Test(groups={"System"})
public void four()
{
	System.out.println("4");
}
}
