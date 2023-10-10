package newpackage;
interface sarthak
{
	void xyz();
}
interface das //extends sarthak
{
	void abc();
}
abstract class Assignment_Interface_concept3 implements das,sarthak
{
	public void xyz() 
	{
	System.out.println("xyz");	
	}
	public void abc() 
	{
		System.out.println("abc");	
	}
	abstract void xyz2();
	static void xyz1()
	{
		System.out.println("xyz1");
	}
	
}
class Assignment_Interface_concept2 extends Assignment_Interface_concept3
{
	void xyz2() 
	{
		System.out.println("xyz2");
	}
	void xyz3()
	{
		System.out.println("xyz3");	
	}
}
class Assignment_Interface_concept1 extends Assignment_Interface_concept2
{
	void xyz4()
	{
		System.out.println("xyz4");
	}
}
public class Assignment_Interface_concept extends Assignment_Interface_concept1
{
	public static void main(String[] args)
	{
		Assignment_Interface_concept a1=new Assignment_Interface_concept();
		a1.abc();
		a1.xyz();
		a1.xyz2();
		a1.xyz3();
		a1.xyz4();
		xyz1();
	}

}
