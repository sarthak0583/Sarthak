package package1;

public class ConditionalStatement
{

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		if(a<b)//true
		{
			System.out.println("a is greater than b");
		}
		if(a>b)//false
		{
			System.out.println("b is greater than a");
		}
		if(a>=b)//false
		{
			System.out.println("b is greater than or equals to a");
		}
		if(a<=b)//true
		{
			System.out.println("a is greater than or equals to b");
		}
		
		if(a!=b)//true
		{
			System.out.println("a is equals to b");
		}
		else
		{
			System.out.println("The statement is correct");
		}
		if(a==b)//false
		{
			System.out.println("a is not equals to b");
		}
		else
		{
			System.out.println("else statement");
		}
		
		
		
	}

}
