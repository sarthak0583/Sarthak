package programe;

import org.testng.annotations.Test;

public class Random_forloop
{
	@Test
	public void ts1()
	{
		for (int i=0;i<=1000;i++)
		{
			System.out.println(Math.random());
		}
	}
}
