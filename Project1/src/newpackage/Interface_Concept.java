package newpackage;// Multiple level inheritance
interface Logout
{
	void UN();
	void PW();
}
interface Login
{
	void add();
	void delete();
}

public class Interface_Concept implements Login,Logout
{
	public void add()
	{
		System.out.println("1");
	}
	public void UN()
	{
		System.out.println("2");
	}
	public void PW()
	{
		System.out.println("3");
	}
	public void delete()
	{
		System.out.println("4");
	}
 public static void main(String[] args)
 {
	 Interface_Concept i1=new Interface_Concept();
	 i1.add();
	 i1.UN();
	 i1.PW();
	 i1.delete();
	}



}
