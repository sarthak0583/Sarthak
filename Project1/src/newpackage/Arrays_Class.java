package newpackage;

public class Arrays_Class
{

	public static void main(String[] args)
	{
		String[] friend =new String[4];
		friend [0]="Trupti";
		friend [1]="Gauri";
		friend [2]="Yogita";
		friend [3]="Momma";
		for (int i=0;i<4;i++)
		{
			System.out.println(friend[i]);
		}
		/*for (int i=0;i<5;i++) //ArrayIndexOutOfBoundsException
		{
			System.out.println(friend[i]);
		}*/
	}

}
