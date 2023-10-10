package newpackage;

import java.util.Scanner;

public class Scanner_Class 
{

	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		//String name=s1.next();
	    System.out.println("Please enter the value of a");
		      int a=s1.nextInt();
		System.out.println("Please enter the value of b");
		      int b=s1.nextInt();
		      int c=a+b;
		System.out.println("addition of a and b is:"+c);    
		   
	}

}
