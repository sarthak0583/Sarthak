package newpackage;
class Authentication
{
	 private String Username="San@gmail.com";
	 private String Password="123";
	 private int age=22;
	 
	 public int getage()
	 {
		 return age;
	 }
	 public void setage(int age)
	 {
		 this.age=age;
	}
	 public String getUsername()
	 {
		 return Username;
	 }
	 public void setUsername(String Username)
	 {
		 this.Username=Username;
	 }
	 public String getPassword()
	 {
		 return Password;		 
	 }
	 public void setPasswod(String Password)
	 {
		 this.Password=Password;
	 }
}
public class Encap
{
	public static void main(String[] args)
	{
		Authentication a1= new Authentication();
 		a1.setage(19);
 		System.out.println(a1.getage());
 		a1.setUsername("Sandhya@gmail.com");
 		System.out.println(a1.getUsername());
 		a1.setPasswod("123");
 		System.out.println(a1.getPassword());

	}
}




