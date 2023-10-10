package package1;

public class CallingNonStaticMethod 
{
	public void delete()//non static method
	{
		int a= 10;
		int b=45;
		long c=b-a;
		System.out.println(c);
	}
	public void keep()//non static method
	
	{
		int a= 10;
		int b=45;
		long c=b*a;
		System.out.println(c);
	}
public void use()//non static method
	
	{
	int dividend = 45;
    int divisor = 10;
    double quotient = (double)dividend / divisor;
    
    System.out.println(quotient);
	}
	
	public static void main(String[] args)
	{
		//CLass Name  reference variable=keyword Class Name();
		CallingNonStaticMethod d=new CallingNonStaticMethod();//New object is created
		d.delete();//by using new object we can call non static method
        d.keep();
        d.use();
	}

}
