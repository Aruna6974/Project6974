package List;

import java.util.*;

public class ListDemo 
{

	public static void main(String[] args)
	{
		List<String> list=new Vector<String>();
		
		list.add("Aruna");
		list.add("Kavya");
		list.add("Swetha");
		list.add("Anil");
		list.add("Mani");
		
		
		list.add("Aruna");
		list.add("Kavya");
		list.add("Swetha");
		list.add("Anil");
		list.add("Mani");
		
		System.out.println("Original List"+list);
		
	     //Collection.sort(list)
		//System.out.println("Sorted List"+list);
		System.out.println(".........................");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		}
}
