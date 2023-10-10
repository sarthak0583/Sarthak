package newpackage;
public class Assignment3_Array
{
	public static void main(String[] args)
	{
		String[] city= new String[4];
		city[0]="pune";
		city[1]="Montreux";
		city[2]="Zurich";
		city[3]="Bhubaneswar";
		boolean[]checklist=new boolean[4];
		checklist[0]=true;
		checklist[1]=false;
		checklist[2]=false;
		checklist[3]=true;
		String[] declar= new String[4];
		declar[0]="I have been there.";
		declar[1]="I will visit soon.";
		declar[2]="I will visit soon.";
		declar[3]="I have been there.";
		for (int i=0;i<4;i++)
		{
			System.out.println(city[i]+ " "+checklist[i]+ " "+declar[i]);
		}
	}

}
