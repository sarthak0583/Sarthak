package newpackage;
public class This_Keyword
{
	int age;
	String name;
	double weight;
	
	void studentinfo(int age1,String name1,double weight1)
	{
		this.age=age1;
		this.name=name1;
		this.weight=weight1;
		System.out.println("Good Morning");
	}
	public static void main(String[] args)
	{
		This_Keyword t1=new This_Keyword();
		t1.studentinfo(28, "Sarthak", 92.5);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.weight);
		
	}

}
