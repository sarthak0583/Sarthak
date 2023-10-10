package collection;
import java.util.Collections;
import java.util.LinkedHashSet;
public class LHS_LinkedHashSet 
{
	public static void main(String[] args)
	{
		LinkedHashSet a1= new LinkedHashSet();
		a1.add("Sarthak");
		a1.add("Sarthak");
		//a1.add("Sarthak");
		a1.add("Das");
	//	a1.add("Sarthak");
		//a1.add("Sarthak");
	//	a1.add("Sarthak");
		a1.add("Das");
		//System.out.println(a1);
	    a1.add(28);
		a1.add(29);
	    a1.add(28);
	    //System.out.println(a1);
		a1.add('m');
	    a1.add('m');
		a1.add('N');
		//System.out.println(a1);
		a1.add(null);
	    a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		LinkedHashSet a2= new LinkedHashSet();
		a2.add(25);
		a2.add(55);
		a2.add(28);
		a2.add(55);
		a2.add(95);
		//Collections.sort(a2);;
		System.out.println(a2);
	}

}
