package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class LinkedHashSet1 {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("AB");
		set.add("CD");
		set.add("EF");
		set.add("GH");
		set.add("IJ");
		
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
