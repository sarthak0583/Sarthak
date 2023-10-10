package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Alist_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList a1= new ArrayList();
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Das");
		a1.add(28);
		a1.add(29);
		a1.add('m');
		a1.add('m');
		a1.add('m');
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		ArrayList a2= new ArrayList();
		a2.add(25);
		a2.add(28);
		a2.add(55);
		a2.add(95);
		Collections.sort(a2);
		System.out.println(a2);
	}

}
