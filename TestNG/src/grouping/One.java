package grouping;

import org.testng.annotations.Test;

public class One
{
@Test(groups= {"Smoke"})
public void sc1()
{
	System.out.println("1");
}
@Test(groups= {"Smoke"})
public void sc2()
{
	System.out.println("2");
}
@Test(groups= {"Smoke","System"})
public void sc3()
{
	System.out.println("3");
}
@Test(groups= {"Regression"})
public void sc4()
{
	System.out.println("4");
}
@Test(groups= {"Intregation","System"})
public void sc5()
{
	System.out.println("5");
}
@Test(groups= {"Intregation","Regression"})
public void sc6()
{
	System.out.println("6");
}
@Test(groups= {"Intregation"})
public void sc7()
{
	System.out.println("7");
}
@Test(groups= {"Smoke","Intregation"})
public void sc8()
{
	System.out.println("8");
}
@Test(groups= {"Regression","System"})
public void sc9()
{
	System.out.println("9");
}
@Test(groups= {"Intregation","Regression"})
public void sc10()
{
	System.out.println("10");
}
}
