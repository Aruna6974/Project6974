package Reflection;

public class Sample 
{

	public static void main(String[] args) 
	{
		Class aclass = "foo".getClass();
		
		System.out.println(aclass.getTypeName());
		System.out.println(args.getClass().getTypeName());
		
		
		boolean flag;
		//flag.getClass();
		
		Class<Boolean> booleanClass = boolean.class;
		System.out.println(booleanClass.getTypeName());
		
		Class<?> forName = null;
		   try 
		    {
			forName = Class.forName("java.lang.String");
		    }
		    catch (ClassNotFoundException e) 
		   {
		    	e.printStackTrace();
		   }
		System.out.println(forName.getTypeName());
	}

}
