package package1;

public class MethodOverloading 
{
public void add()//Non Static method
{
	System.out.println(1);
}
public void add(int a)// method overloading(same method name with different parameter )
{
	System.out.println(2);
}
public void add(int a,int b,char c)// method overloading(same method name with different parameter )
{
	System.out.println(3);
}
public static void add(int a,double b,char c)// method overloading(same method name with different parameter )
{
	System.out.println(4);
}
	public static void main(String[] args)
	{
		
		MethodOverloading m1=new MethodOverloading();
				m1.add();
				m1.add(1);
				m1.add(45,56,'m');
				add(45,4.85,'k');
	}

}
