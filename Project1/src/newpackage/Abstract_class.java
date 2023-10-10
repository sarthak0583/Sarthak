package newpackage;

abstract class Abstract_class1 //abstract class
{
	abstract void delete();
	abstract void add(); //abstract method
}

public class Abstract_class extends Abstract_class1
{
	void add()
	{
		int a=10; int b=20;
		int c=a+b;
		System.out.println(c);
	}
	void delete()
	{
		int a=10; int b=20;
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Abstract_class a1=new Abstract_class();
		a1.add();
		a1.delete();	
	}

}
