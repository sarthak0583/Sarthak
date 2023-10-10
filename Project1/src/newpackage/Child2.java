package newpackage;

public class Child2 extends Parrent_Class
{
	void delete()
	{
		System.out.println("delete");
	}
	static void hii(char a)
	{
		System.out.println("Character");
	}

	public static void main(String[] args)
	{

		hii(4.52);
		hii('c');
		Child2 c2=new Child2();
		c2.delete();
		c2.das();
	}

}
