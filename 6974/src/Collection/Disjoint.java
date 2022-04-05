package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Disjoint 
{

	public static void main(String[] args) 
	{
		List<String> list1=new ArrayList<String>();
        list1.add("Parrot");
        list1.add("Peacock");
        list1.add("Pigeon");
        list1.add("Owl");
        List<String> list2=new ArrayList<String>();
        list2.add("Bear");
        list2.add("Tiger");
        list2.add("Lion");
        list2.add("Bat");
        System.out.println(Collections.disjoint(list1, list2));
	}

}
