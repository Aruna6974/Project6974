package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashMap 
{


	public static void main(String[] args) 
	{
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("Martyn","D"); //put elements in Map
		map.put("Arun","C");
		map.put("Sadhya","B");
		map.put("Kavya","A");
		
		System.out.println(map);
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry map1=(Map.Entry)itr.next();
			System.out.println(map1.getKey()+"  "+map1.getValue());
		}

	}

}
