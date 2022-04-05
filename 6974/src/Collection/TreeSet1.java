package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 
{
   public static void main(String[] args)
   {
	   TreeSet<String> a1=new TreeSet<String>();
	    a1.add("Arya");
	    a1.add("Sowmya");
	    a1.add("Eswar");
	    a1.add("Tasleem");
	    
	    //Traversing elements
	    Iterator<String> itr=a1.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println("Elements are: ");
	    	System.out.println(itr.next());
	    }
   }

}
