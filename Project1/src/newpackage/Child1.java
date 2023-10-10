package newpackage;

public class Child1 extends Parrent_Class
{
	void add()
	{
		System.out.println("1");
	}
	static void hii(int a)
	{
		System.out.println("Bye");
	}

	public static void main(String[] args)
	{
		hii(4.52);
		hii(5);
		Child1 c1=new Child1();
		c1.add();
		c1.das();
	}

}
