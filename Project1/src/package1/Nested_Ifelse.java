package package1;

public class Nested_Ifelse
{

	public static void main(String[] args)
	{
	int a=10;
	int b=20;
	int c=30;
	
	if(a==10)//If this statement is true then it should go to the next if statement, otherwise else block will be the output.
	{
		if(a==c)
		{
			if(a<=b)
			{
				System.out.println("Hello");
			}
			else
			{
				System.out.println("Hey");
			}
			
		}
		else
		{
			System.out.println("Hii");
		}
		
	}
	
	else
	{
		System.out.println("Bye");
	}
	}

}
