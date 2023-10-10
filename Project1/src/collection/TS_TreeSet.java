package collection;
import java.util.Collections;
import java.util.TreeSet;
public class TS_TreeSet
{
	public static void main(String[] args)
	{
		TreeSet a1= new TreeSet();
		a1.add("Sarthak");
		//a1.add("Sarthak");
		//a1.add("Sarthak"); //Doesn't accept duplicate value
		a1.add("Kumar");
		//a1.add("Kumar");
		//a1.add("Sarthak");
		//a1.add("Sarthak");
		a1.add("Das");
		System.out.println(a1);
		/*a1.add(28);
		a1.add(29);
		a1.add(29);
		a1.add(59);
	    a1.add(28);
	    System.out.println(a1);
		a1.add('m');
	    a1.add('m');
		a1.add('m');
		System.out.println(a1);
		a1.add(null); //Doesn't accept Null Value
	    a1.add(null);
		a1.add(null);
	    a1.add(null);
		System.out.println(a1);*/
		TreeSet a2= new TreeSet();
		a2.add(25);
		a2.add(55);
		a2.add(28);
		a2.add(55);
		a2.add(95);
		//Collections.sort(a2);
		System.out.println(a2);
	}

}
