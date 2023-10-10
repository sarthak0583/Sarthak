package newpackage;

import java.util.Scanner;

public class New_Scanner_Class
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String a=s1.next();
		byte c=s1.nextByte();
		short d=s1.nextShort();
		int b=s1.nextInt();
		long e=s1.nextLong();
		boolean f=s1.nextBoolean();
		float g=s1.nextFloat();
		double h=s1.nextDouble();
		s1.close();
				
	}

}
