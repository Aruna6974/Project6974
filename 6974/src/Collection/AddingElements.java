package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingElements 
{

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("DBMS");
		list.add("Java");
		list.add("Python");
		list.add("C");
		System.out.println("Initial collection value:"+list);
		Collections.addAll(list, "Servlet","JSP");
		System.out.println("After adding elements collection value:"+list);
		String[] list2= {"C#",".Net"};
		Collections.addAll(list,list2);
		System.out.println("After adding array collection value:"+list);

	}

}
