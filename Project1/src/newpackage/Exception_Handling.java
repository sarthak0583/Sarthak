package newpackage;

import java.util.InputMismatchException;

public class Exception_Handling
{
	public static void main(String[] args)
	{	
try
{
	//int a=1/0;
	int b=1/1;
	System.out.println("a");
}
catch(ArithmeticException a1)
{
	System.out.println("1");
}
catch(InputMismatchException a2)
{
	System.out.println("2");
}
catch(NullPointerException a3)
{
	System.out.println("3");
}
finally
{
	System.out.println("Hello");
}
}
}
