package practice;
public class New implements Two{
public void id()
{
	System.out.println("1");
}

@Override
public void id1()
{
	// TODO Auto-generated method stub
	System.out.println("3");
}
public static void main(String[] args) {
	New n1= new New();
	n1.id();
	n1.id1();
}
}
