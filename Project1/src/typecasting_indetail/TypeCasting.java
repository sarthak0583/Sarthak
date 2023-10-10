package typecasting_indetail;

public class TypeCasting
{
	public static void main(String[] args) 
	{
		int wt=85;
		double wt1=wt;
		System.out.println(wt1);
		double wt3=69.25;
		int wt4=(int) wt3;
		System.out.println(wt4);
		byte age=28;
		long newage=age;
		System.out.println(newage);
		long days=111;
		byte changedday=(byte) days;
		System.out.println(changedday);
	}

}
