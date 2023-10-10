package newpackage;
abstract class Assignment2_abstract_class1
{
	abstract void ITC();
	abstract void ITC1();
	void ITC2()
	{
		System.out.println("a");
	}
	void ITC3()
	{
		System.out.println("b");
	}
}
abstract class Assignment2_abstract_class2 extends Assignment2_abstract_class1
{
	abstract void ITC4();
	abstract void ITC5();
	void ITC6()
	{
		System.out.println("c");
	}
static void ITC7()
	{
	System.out.println("d");
	}
void ITC()
{
	System.out.println("e");
}
void ITC1()
{
	System.out.println("f");
}
}
public class Assignment2_abstract_class extends Assignment2_abstract_class2
{
	void ITC4()
	{
		System.out.println("g");
	}
	void ITC5()
	{
		System.out.println("h");
	}

	void ITC8()
	{
		System.out.println("i");
	}
    static void ITC9()
	{
	System.out.println("j");
	}
	public static void main(String[] args)
	{
		Assignment2_abstract_class a1= new Assignment2_abstract_class();
		a1.ITC();
		a1.ITC1();
		a1.ITC2();
		a1.ITC3();
		a1.ITC4();
		a1.ITC5();
		a1.ITC6();
		ITC7();
		a1.ITC8();
		ITC9();
		
	}

}

