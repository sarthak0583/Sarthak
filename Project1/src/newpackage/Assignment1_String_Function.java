package newpackage;

public class Assignment1_String_Function
{

	public static void main(String[] args)
	{
		String a="India";
		System.out.println(a.concat(" ").concat("is").concat(" ").concat("my").concat(" ").concat("country"));
		String b="Manish Kumar Tiwari";
		System.out.println(b.substring(0, 5));
		System.out.println(b.substring(7, 12));
		System.out.println(b.substring(13, 19));
		System.out.print(b.charAt(0));
		System.out.print(b.charAt(7));
		System.out.print(b.charAt(13));
		System.out.println(" ");
		System.out.println(b.charAt(0));
		System.out.println(b.charAt(7));
		System.out.println(b.charAt(13));
		String c="MANISH";
		String d="Abhishek";
		System.out.print(c.charAt(0));
		System.out.print(d.charAt(0));
		System.out.print(c.charAt(1));
		System.out.print(d.charAt(1));
		System.out.print(c.charAt(2));
		System.out.print(d.charAt(3));
		System.out.print(c.charAt(3));
		System.out.print(d.charAt(4));
		System.out.print(d.charAt(4));
		System.out.print(d.charAt(5));
		System.out.print(c.charAt(5));
		System.out.print(d.charAt(6));
		System.out.print(d.charAt(7));
		System.out.println(" ");
		String e="Manish";
		String f=e.toUpperCase();
		//System.out.println(f);
		System.out.print(e.charAt(0));
		System.out.print(e.charAt(1));
		System.out.print(f.charAt(2));
		System.out.print(e.charAt(3));
		System.out.print(f.charAt(4));
		System.out.print(e.charAt(5));
	}

}
