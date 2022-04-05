package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionSort 
{

	public static void main(String[] args) 
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Kajal");
		ar.add("Keerthi");
		ar.add("Anu");
		ar.add("Sweety");
		
		Collections.sort(ar);
		Iterator itr=ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("........................");
		Collections.reverse(ar);
		Iterator i=ar.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
