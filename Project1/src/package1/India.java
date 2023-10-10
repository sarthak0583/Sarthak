package package1;

public class India
{
	public static void add()//static method
	{
		System.out.println("static method");
	}
	public void delete()//non static method
	{
			System.out.println("Non-static method");
	}
	India()//Constructor
    {
	     System.out.println("I Love My India");	
    }
    India(int a)//Constructor overloading.
    {
  System.out.println("I Love India");	
    }
    India(int a,char c)//Constructor overloading
    {
  System.out.println("we Love India");	
    }
    India(boolean d,int a)//Constructor overloading
    {
  System.out.println("He Loves India");	
    }
    India(double a,float c)//Constructor overloading
    {
  System.out.println("She Loves India");	
    }

	public static void main(String[] args)
	{
		add();//calling static method by using the method name only.
		India i1=new India(25);//creating an object by using reference variable.
		i1.delete();//Calling non static method by using reference variable.
		new India();// we can call the constructor by creating an object.
	//	new India(25);
		new India(55,'f');
		new India(true,55);
		new India(2.55,5.555f);
		
	}

}
