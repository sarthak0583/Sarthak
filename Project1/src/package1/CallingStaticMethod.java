package package1;

public class CallingStaticMethod 
{
public void Add()
{
	System.out.println("I am adding");
}
public static void Substract()// we can call static method by using method name only
{
	System.out.println("I am Substracting");
}
public static void Mulitiple()// we can call static method by using method name only
{
	System.out.println("I am doing Multilication");
}
	public static void main(String[] args)
	{
	Mulitiple();// we can call static method by using method name only
	System.out.println("We can call Static method by using the method name only");
	Substract();// we can call static method by using method name only
	}

}
