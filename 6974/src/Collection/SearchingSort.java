package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SearchingSort {

	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
        a1.add("Virat");
        a1.add("Surya");
        a1.add("Dhoni");
        
        Collections.sort(a1);
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("The index of Dhoni is "+ Collections.binarySearch(a1, "Dhoni"));
        System.out.println("The index of Surya is "+ Collections.binarySearch(a1, "Surya"));
                
	}

}
