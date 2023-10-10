package package1;

public class ConditionalStatement1//If else if
{

	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		if(a>100)
		{
			System.out.println("1");
		}
		else if(a==b)
		{
			System.out.println("2");
		}
		else if(a!=b)//whichever block comes true first will exicute only
		{
			System.out.println("3");
		}
		else if(a<=b)
		{
			System.out.println("4");
		}
		else if(a<b)
		{
			System.out.println("5");
		}
		else if(a>=b)
		{
			System.out.println("6");
		}
		else
		{
			System.out.println("7");
		}
	}

}
