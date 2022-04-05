//Create an ArrayList which will be able to store only Strings.
//Create a printAll method which will print all the elements
//using an Iterator.

package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator 
{

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<>();
		list.add("Banana");
		list.add("Grapes");
		list.add("Mango");
		list.add("Cherry");
		list.add("Apple");

		printAll(list);
	}
	public static void printAll(List<String>list)
	{
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
