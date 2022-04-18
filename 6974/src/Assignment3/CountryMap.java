package Assignment3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap 
{
	static HashMap<String,String>M1;
	public CountryMap()
	{
		M1=new HashMap<String,String>();
	}
	public HashMap<String,String> saveCountryCapital(String CountryName,String Capital)
	{
		M1.put(CountryName, Capital);
		return M1;
		
	}
	public static String getCapital(String CountryName)
	{
		return M1.get(CountryName);
	}
	public static String getCountry(String Capital)
	{
		Set<Entry<String,String>> set=M1.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		while (itr.hasNext())
		{
			Map.Entry<String,String> obj=itr.next();
			if(obj.getValue().equals(Capital))
				return obj.getKey();
		}
		return null;
	}

	public static HashMap<String, String> swapKeyValue()
	{
		HashMap<String,String> M2 = new HashMap<String,String>();
		
		Set<Entry<String,String>> set = M1.entrySet();
		Iterator<Entry<String,String>> it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String,String> obj = it.next();
			M2.put(obj.getValue(), obj.getKey());
		}
        return M2;
        
	}
	public static ArrayList<String> toArrayList()
	{
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String,String>> set = M1.entrySet();
		Iterator<Entry<String,String>> it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		return list;
		
	}
	}


