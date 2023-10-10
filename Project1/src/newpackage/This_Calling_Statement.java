package newpackage;

public class This_Calling_Statement //used for to call one constructor to another constructor in same class 
{
	This_Calling_Statement()
	{
		System.out.println("1");
	}
	This_Calling_Statement(int a)
	{
		this();
		System.out.println("2");
	}
	This_Calling_Statement(char a, boolean c)
	{
		this(5);
		System.out.println("3");
	}
	This_Calling_Statement(double d)
	{
		this('d',true);
		System.out.println("4");
	}
	public static void main(String[] args)
	{
		 new This_Calling_Statement(5.25);
	
	}

}
