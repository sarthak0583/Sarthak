package newpackage;

import java.util.Scanner;

public class Switch_Case
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
	switch(a)
	{
	case 1:
	{
		System.out.println("Case1");
		break;
	}
	case 2:
	{
		System.out.println("Case2");
		break;
	}
	case 3:
	{
		System.out.println("Case3");
		break;
	}
	default :
	{
		System.out.println("Default");
	}
		
	}
	}

}
