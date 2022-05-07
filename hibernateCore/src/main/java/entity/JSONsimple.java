package entity;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONsimple 
{

	public static void main(String[] args) 
	{
		//creating a json object
		JSONObject obj=new JSONObject();
        
		//creating key value pairs
		obj.put("Employee id", "1234");
		obj.put("first name", "Ram");
		obj.put("last name", "kumar");
		obj.put("Country", "INDIA");
		
		JSONObject emp=new JSONObject();
		emp.put("employee", "obj");
		
		//creating a mulitiple json object
				JSONObject obj1=new JSONObject();
		        
				//creating key value pairs
				obj1.put("Employee id", "100");
				obj1.put("first name", "Rama");
				obj1.put("last name", "Das");
				obj1.put("Country", "USA");
				
				JSONObject emp1=new JSONObject();
				emp1.put("employee", "obj1");
				
				JSONArray empList=new JSONArray();
				empList.add(obj);
				empList.add(obj1);
				
				
		try (FileWriter file=new FileWriter("JSON\\test.JSON"))
		{
	       file.write(empList.toJSONString());
			file.flush();
	    }
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
