package collection;
import java.util.Collections;
import java.util.LinkedList;
public class L_LinkedList 
{
	public static void main(String[] args)
	{
		LinkedList a1= new LinkedList();
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Sarthak");
		a1.add("Das");
		a1.add(28);
		a1.add(29);
		a1.add(28);
		a1.add('m');
		a1.add('m');
		a1.add('m');
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		LinkedList a2= new LinkedList();
		a2.add(25);
		a2.add(55);
		a2.add(28);
		a2.add(55);
		a2.add(95);
		Collections.sort(a2);
		System.out.println(a2);
	}

}
