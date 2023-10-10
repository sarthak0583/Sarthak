package newpackage;

class Assignment1_abstract_class3
{
	void d1()
	{
		System.out.println("1");
	}
}

abstract class Assignment1_abstract_class2 extends Assignment1_abstract_class3
{
	static void add()
	{
		System.out.println("2");
	}
	 abstract void a1();
	 abstract void a2();
}

 abstract class Assignment1_abstract_class1 extends Assignment1_abstract_class2
{
	 abstract void b1();
	 abstract void b2();
	 void a1()
	 {
		 System.out.println("3"); 
	 }
	 void a2()
	 {
		 System.out.println("4");
	 }
	void b3()
	{
		System.out.println("5");	
	}
	static void b4()
	{
		System.out.println("6");
	}
}
public class Assignment1_abstract_class extends Assignment1_abstract_class1
{
	void b1()
	{
		System.out.println("7");
	}
	void b2()
	{
		System.out.println("8");
	}
void c1()
{
	System.out.println("9");
}
static void c2()
{
	System.out.println("10");
}
	public static void main(String[] args) 
	{
		Assignment1_abstract_class a1=new Assignment1_abstract_class();
		a1.d1();
		add();
		a1.a1();
		a1.a2();
		a1.b1();
		a1.b2();
		a1.b3();
		b4();
		a1.c1();
		c2();
	}

}
