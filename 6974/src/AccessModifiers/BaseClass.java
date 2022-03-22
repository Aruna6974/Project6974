package AccessModifiers;

public class BaseClass 
{
	void display()
	{
		System.out.println("BaseClass");
	}
}
class A
{
	public static void main(String[] args) 
	{
		//access class with default  scope
		BaseClass obj = new BaseClass();
		
		obj.display();     //access class method with
				
	}
		
}


