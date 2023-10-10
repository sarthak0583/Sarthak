package package1;

public class Assignment_SIB
{
	static
	{
		System.out.println("SIB");
	}
	static
	{
		System.out.println("Another SIB");
	}
	{
		System.out.println("IIB");
	}
	{
		System.out.println("Another IIB");
	}
	Assignment_SIB()
	{
		System.out.println("Constructor");
	}
	Assignment_SIB(int a)
	{
		System.out.println("Another Constructor");
	}
	/*static void add()
	{
		System.out.println("static method");
	}
	public void delete()
	{
		System.out.println("non-static method");
	}*/
	
public static void main(String[] args) 
{
	new Assignment_SIB();
	new Assignment_SIB(5);
	//System.out.println("main method");//main method
	/*Assignment_SIB s1=new Assignment_SIB();// object created
    s1.delete();//non static method
    add();//static method
	new Assignment_SIB(5);//another constructor*/
}
}
