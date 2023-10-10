package newpackage;
class Great_GrandParent_Class// Multi Level Inheritance
{
	static void hii()
	{
		System.out.println("Hii");
	}
}
 class GrandParent_Class extends Great_GrandParent_Class
{
	void add()
	{
		System.out.println("1");
	}
	static void hii(int a)
	{
		System.out.println("Bye");
	}
}

 class Parent_Class extends GrandParent_Class
{
	 void delete(char c)
		{
			System.out.println(c);
		}
}

public class Child_Class extends Parent_Class
{

	public static void main(String[] args)
	{
		Child_Class c1=new Child_Class();
		hii();
		hii(5);
		c1.add();
		c1.delete('h');
		System.out.println("3");
	}

}
