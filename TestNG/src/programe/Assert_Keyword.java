package programe;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Assert_Keyword 
{
	int age=25;
@Test
public void one()
{
	
/*	Scanner s1=new Scanner(System.in);
	int age=s1.nextInt();*/
	assert age>18:"Age is less";
	
}
}
