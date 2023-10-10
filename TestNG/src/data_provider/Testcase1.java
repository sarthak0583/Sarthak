package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase1
{
@Test(dataProvider="data1")
public void test1(String a)
{
	System.out.println("a");
}
@DataProvider(name="data")
public Object[][] number()
{
     return new Object[][] {{"15"},{"25"}};
}
@DataProvider(name="data1")
public Object[][] numbers()
{
     return new Object[][] {{"15"},{"25"},{"35"},{"45"}};
}
}
