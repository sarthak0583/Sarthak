package access_specifier;
public class Case1_within_class
{
	public void add()
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	private void delete()
	{
		int a=100;
		int b=200;
		int c=b-a;
		System.out.println(c);
	}
	protected void mulitiple()
	{
		int a=100;
		int b=200;
		int c=a*b;
		System.out.println(c);
	}
	 void divide()
	{
		int a=100;
		int b=200;
		int c=b/a;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Case1_within_class c1=new Case1_within_class();
		c1.delete();
		c1.add();
		c1.mulitiple();
		c1.divide();
	}

}
