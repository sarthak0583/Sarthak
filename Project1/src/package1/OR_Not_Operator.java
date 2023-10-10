package package1;

public class OR_Not_Operator 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
      if(!(a<b && b<a))
      {
    	System.out.println("If block will exicute");  
      }
      else
      {
    	  System.out.println("else block will exicute");
      }
      if(!(a<b || a<20))
      {
    	System.out.println("If block");  
      }
      else
      {
    	  System.out.println("else block");
      }

	}

}
