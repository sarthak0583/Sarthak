package newpackage;
/*abstract class Google_Credential
{
	abstract void login();
	abstract void logout();
	void hello()
	{
		System.out.println("Welcom msg");
	}
	static void main(int a)
	{
		a=10;
		System.out.println(a);
	}
	 void main()
	{
		System.out.println("a");
	}
}*/
public class Google extends Google_Credential
{
	void hello()
	{
		System.out.println("Welcom msg");
	}
	void main()
	{
		
		System.out.println("Overriding the concrete method");
	}
	void login()
	{
		int a=10; int b=20;
		int c=a+b;
		System.out.println("The login credential is:"+ c);
	}
	void logout()
	{
		int a=10; int b=20;
		int c=a-b;
		System.out.println("The logout credential is:"+ c);
	}

	public static void main(String[] args)
	{
		Google g1= new Google();
		g1.login();
		g1.logout();
		g1.main();
		
		
	}

}
