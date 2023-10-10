package newpackage;

public class Child3 extends Parrent_Class
{
	void sarthak()
	{
		System.out.println("Sarthak");
	}
	static void hii( boolean c)
	{
		System.out.println(c);
	}
	public static void main(String[] args)
	{

		hii(4.52);
		hii(true);
		Child3 c3=new Child3();
		c3.sarthak();
		c3.das();
	}

}
