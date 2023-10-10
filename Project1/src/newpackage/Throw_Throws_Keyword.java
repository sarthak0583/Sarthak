package newpackage;

import java.util.InputMismatchException;

public class Throw_Throws_Keyword
{
	public static void main(String[] args) throws ArithmeticException, InterruptedException,InputMismatchException
	{
		int a=10;
		System.out.println("Hii");
		Thread.sleep(5000);
		if(a>15)
		{
			System.out.println("Hello");
		}
		if(a==10)
		{
			throw new InputMismatchException();
		}
		else
		{
			throw new ArithmeticException("Error Message");
		}
		
	}

}
