package package1;
public class Main_method_Overloading 
{
     static void main()
      {
	System.out.println("1");
      }
      void main(int a)
      {
    	  System.out.println("2");
      }
	public static void main(String[] args)
	{
		System.out.println("3");
		main();
		Main_method_Overloading m1=new Main_method_Overloading();
		m1.main(5);
	}

}
