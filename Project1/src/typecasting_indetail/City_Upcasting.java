package typecasting_indetail;
class State
{
	void stateroad()
	{
		System.out.println("EXPRESS HIGHWAY!!");
	}
	void statename()
	{
		System.out.println("MAHARASTRA");
	}}
public class City_Upcasting extends State
{
	void cityroad()
	{
		System.out.println("FC ROAD");
	}
	void cityname()
	{
		System.out.println("PUNE");
	}
	public static void main(String[] args) 
	{
		State s1=new City_Upcasting(); //Implicit way
      //State s1=(State)new City_Upcasting(); //explicit way
		s1.statename();
		s1.stateroad();	
		City_Upcasting c1=(City_Upcasting) s1;//Downcasting
		c1.cityname();
		c1.cityroad();
		c1.statename();
		c1.stateroad();
		
		
		
	}

}
