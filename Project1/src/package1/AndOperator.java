package package1;

public class AndOperator
{
	
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
      if(a<b && b<a) //true && false
      {
    	System.out.println("If block will exicute");  
      }
      else
      {
    	  System.out.println("else block will exicute");
      }
      if(a<b && a<20) // True && True
      {
    	System.out.println("If block");  
      }
      else
      {
    	  System.out.println("else block");
      }
	}

}
