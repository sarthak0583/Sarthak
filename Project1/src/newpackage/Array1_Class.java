package newpackage;
public class Array1_Class
{
	public static void main(String[] args)
	{
		String [] name=new String[4];
		name[0]="Gudu";
		name[1]="Sarthak";
		name[2]="Mike";
		name[3]="alpha";
		int[]age=new int[4];
		age[0]=25;
		age[1]=26;
		age[2]=27;
		age[3]=28;
		char []gender=new char[4];
		gender[0]='M';
		gender[1]='F';
		gender[2]='T';
		gender[3]='A';
		
		for(int i=0;i<3;i++)
		{
			/*System.out.println(name[i]);
			System.out.println(age[i]);
			System.out.println(gender[i]);*/
			//System.out.println(name[i]+age[i]+gender[i]);
			System.out.println(name[i]+age[i]+gender[i+1]);
		}
	}

}
