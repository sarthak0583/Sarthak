package newpackage;

public class String_Functions
{

	public static void main(String[] args)
	{
		String a="Sarthak";
		String b="Das";
		String c="India";
		String d="I love my India";
		String e="  I love my India  ";
		String f="";
		String g="Automaton Testing";
		String x="Assam";
		System.out.println(x.indexOf('s'));
		System.out.println(a.length());
		System.out.println(c.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.charAt(4));
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf('S'));
		System.out.println(a.indexOf('z'));
		System.out.println(a.indexOf('k'));
		System.out.println(d.substring(5));
		System.out.println(g.substring(1));
		System.out.println(d.substring(2, 5));
		System.out.println(e.trim());
		System.out.println(d.trim());
		System.out.println(a.contains("p"));
		System.out.println(a.contains("S"));
		System.out.println(a.contains("s"));
		System.out.println(a.isEmpty());
		System.out.println(f.isEmpty());
		System.out.println(a.concat(b));
		System.out.println(a.concat(" ").concat(b));

	}

}
