package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Final_Class_Example
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		try
		{
			System.out.println("Hii");
			int a1= s1.nextInt();
			System.out.println("Hey");
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Hyy");
		}
	}

}
