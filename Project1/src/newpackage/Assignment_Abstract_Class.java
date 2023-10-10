package newpackage;

abstract class Assignment_Abstract_Class2
{
	 abstract void add();
	static void substract()
	{
		 int a=10; int b=20;
		 int c=a-b;
		 System.out.println("The substraction of two number is:"+c);
	}
}
 class Assignment_Abstract_Class1 extends Assignment_Abstract_Class2
{
	 void add()
	 {
		 int a=10; int b=20;
		 int c=a+b;
		 System.out.println("The addition of two number is:"+c);
	 }
	 void multiplication()
	 {
		 int a=10; int b=20;
		 int c=a*b;
		 System.out.println("The multiplication of two number is:"+c);
	 } 
}
public class Assignment_Abstract_Class extends Assignment_Abstract_Class1
{
	/*void add() //we can override in either parent or child class.
	 {
		 int a=10; int b=20;
		 int c=a+b;
		 System.out.println("The addition of two number is:"+c);
	 }*/
	void divide()
	 {
		 int a=100; int b=20;
		 int c=a/b;
		 System.out.println("The division of two number is:"+c);
	 } 
	public static void main(String[] args)
	{
		Assignment_Abstract_Class a1=new Assignment_Abstract_Class();
		a1.add();
		substract();
		a1.multiplication();
		a1.divide();
		
	}

}
