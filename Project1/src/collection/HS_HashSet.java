package collection;

import java.util.Collections;
import java.util.HashSet;
public class HS_HashSet 
{
	public static void main(String[] args)
	{
		HashSet a1= new HashSet();
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Das");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Das");
		//System.out.println(a1);
	    a1.add(28);
		a1.add(29);
	    a1.add(28);
	    //System.out.println(a1);
		a1.add('m');
	    a1.add('m');
		a1.add('m');
		//System.out.println(a1);
		a1.add(null);
	    a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
	    HashSet a2= new HashSet();
		a2.add(25);
		a2.add(55);
		a2.add(28);
		a2.add(55);
		a2.add(95);
		//Collections.sort(a2);;
		System.out.println(a2);
	}

}
