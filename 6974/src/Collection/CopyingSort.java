package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CopyingSort 
{

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
        List<String> sourceList=new ArrayList<>();
        sourceList.add("Abcdghtre");
        sourceList.add("Singh");
        sourceList.add("Sam");
        Collections.copy(a1, sourceList);
        System.out.println("After copying the list");
        for(String j:a1)
        {
        	System.out.println(j);
        }

	}
}
