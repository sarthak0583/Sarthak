package newpackage;
class Auth
{
	private String Loginin="sales@sarthakdas.com";
	private String Password="11223344";
	private int age=25;
	private boolean declar=true;
	public boolean getDeclar() 
	{
		return declar;
	}
	public void setDeclar(boolean declar)
	{
		this.declar = declar;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getLoginin() 
	{
		return Loginin;
	}
	public void setLoginin(String loginin) 
	{
		this.Loginin = loginin;
	}
	public String getPassword()
	{
		return Password;
	}
	public void setPassword(String password)
	{
		this.Password = password;
	}	
}
public class Encapsulation
{
	public static void main(String[] args)
	{
		Auth a1=new Auth();
		a1.setLoginin("sd@sarthakdas.com");
 		System.out.println(a1.getLoginin());
		a1.setPassword("111222333");
		System.out.println(a1.getPassword());
		a1.setAge(30);
		System.out.println(a1.getAge());
		a1.setDeclar(false);
		System.out.println(a1.getDeclar());
	}

}
