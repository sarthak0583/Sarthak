package typecasting_indetail;
class One
{
	void add()
	{
		System.out.println("ADD");
	}
}
class Two extends One
{
	void Delete()
	{
		System.out.println("Delete");
	}
}
class Three extends Two
{
	void substract()
	{
		System.out.println("Substract");
	}
}
public class Assignment1_Typecasting extends Three
{
	void divide()
	{
		System.out.println("Divide");
	}
	public static void main(String[] args)
	{
		Two t1=new Three();
		t1.add();
		t1.Delete();
		Three t2=new Assignment1_Typecasting();
		t2.add();
		t2.Delete();
		t2.substract();
		Assignment1_Typecasting a1 = (Assignment1_Typecasting) t2;
		a1.add();
		a1.Delete();
		a1.substract();
		a1.divide();
	}

}
