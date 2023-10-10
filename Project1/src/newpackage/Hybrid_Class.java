package newpackage;
class ThirdChild extends SecondChild //c1
{
void substract()
{
	int a=50;int b=20;
	int c=a-b;
	System.out.println(c);
}
static void delete()
{
	//int a=10;int b=20;
	//int c=a+b;
	System.out.println("Delete");
}
}
class SecondChild //c2
{
void muliplication()
{
	int a=10;int b=20;
	int c=a*b;
	System.out.println(c);
}
}

class FirstChild extends SecondChild //c3
{
void add()
{
	int a=10;int b=20;
	int c=a+b;
	System.out.println(c);
} 
static void delete1()
{
	//int a=10;int b=20;
	//int c=a+b;
	System.out.println("Delete1");
}
}

 public class Hybrid_Class //extends FirstChild //c4
{

	public static void main(String[] args)
	{
		Hybrid_Class h1=new Hybrid_Class();
		/*h1.add();
		//delete();
		h1.muliplication();*/
		ThirdChild t1=new ThirdChild();
		t1.substract();
		t1.muliplication();
		//delete1();
		t1.delete();
	}

}
