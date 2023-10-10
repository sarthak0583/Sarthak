package newpackage;

public class Assignment_String_Functions {

	public static void main(String[] args)
	{
		String b="12 DEC 2021";
		String Day= b.substring(0, 2);
		String Month=b.substring(3, 6);
		String Year= b.substring(7);
		System.out.println(Day);
		System.out.println(Month);
		System.out.println(Year);
	}

}
