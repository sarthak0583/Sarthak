package newpackage;

import java.util.Scanner;

public class Assignment_Scanner_Class 
{
static void addition()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of A");
	int a= s1.nextInt();
	System.out.println("Enter the value of B");
	int b= s1.nextInt();
	int c= a+b;
	System.out.println("The addition of two number is=" +c);
}
static void multiplication()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of A");
	int a= s1.nextInt();
	System.out.println("Enter the value of B");
	int b= s1.nextInt();
	int c= a*b;
	System.out.println("The multiplication of two number is=" +c);
}
static void substraction()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of A");
	int a= s1.nextInt();
	System.out.println("Enter the value of B");
	int b= s1.nextInt();
	int c= a-b;
	System.out.println("The substraction of two number is=" +c);
}
static void division()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of A");
	int a= s1.nextInt();
	System.out.println("Enter the value of B");
	int b= s1.nextInt();
	int c= a/b;
	System.out.println("The division of two number is=" +c);
}
	public static void main(String[] args)
	{
	addition();	
	multiplication();
	substraction();
	division();
	}

}
