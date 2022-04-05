package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{

	public static void main(String[] args) 
	{
        
		//Creating HashSet and adding elements
		HashSet<String> set=new HashSet();
		 set.add("AB");
		 set.add("ED");
		 set.add("AA");
		 set.add("XZ");
		 set.add("CD");
		 
		 Iterator<String> i=set.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());		 
		 }
	}

}
