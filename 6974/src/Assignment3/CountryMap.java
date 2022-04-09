package Assignment3;


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

	public static void main(String[] args)
	{

	}

}
