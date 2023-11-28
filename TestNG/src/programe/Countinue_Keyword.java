package programe;

import org.testng.annotations.Test;

public class Countinue_Keyword
{
@Test
public void one()
{
	for(int i=0;i<5;i++)
	{
		if(i==2)
		{
			continue;
		}
		System.out.println("Hello"+i);
	}
}

}
