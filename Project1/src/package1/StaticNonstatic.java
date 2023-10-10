package package1;

public class StaticNonstatic
{
public static void add()
{
	int a= 10;
	int b=45;
	long c=a+b;
	System.out.println(c);
}
public void delete()
{
	int a= 10;
	int b=45;
	long c=b-a;
	System.out.println(c);
}
	public static void main(String[] args)
	{
		add();
		StaticNonstatic d=new StaticNonstatic();
		d.delete();

	}

}
