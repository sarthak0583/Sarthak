package newpackage;
public class Return_Keyword
{
	static int add(int a,int b)
	{
	int c=a*b;
	System.out.println(a+b);
	return c;
	}
	static double add(double a,int b)
	{
		double c=b/a;
	System.out.println(c);
	return c;
	}
	public static void main(String[] args)
	{
		add(5,10);
		add(50.55,4);
		
	}

}
