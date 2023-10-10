package package1;
public class For_Loop
{
	public static void main(String[] args)
     {
    for(int i=0; i<3; i++)//Here first i=o and i<3 is true, so for loop will exicute. then value of"i" will increase by 1 that is i=1 and 1<3 so again exicute.
    {
	System.out.println("Hello");
       }
    for(int i=1; i<5; i++)
    {
    	System.out.println("Hii");
    }
    for(int i=1; i>5; i++)
    {
    	System.out.println("Hey");
    }
    /*for(int i=5; i>2; i++) //Infinite loop.
    {
    	System.out.println("Dear");
    }*/
    /* for(int i=1; i<5; i--)//Infinite loop.
    {
    	System.out.println("Bye");
	}*/
    for(int i=5; i>3; i--)
    {
    	System.out.println("See you");
    }
}
}

