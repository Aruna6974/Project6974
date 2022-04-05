package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WrapperSort 
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
        a1.add(Integer.valueOf(100));
        a1.add(Integer.valueOf(101));
        a1.add(112);
        
        Collections.sort(a1);
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        Comparable<Integer> c=Collections.max(a1);
        System.out.println("The Maximum value is "+c);
        Comparable<Integer> c1=Collections.min(a1);
        System.out.println("The Minimum value is "+c1);
	}

}
