package Reflection;

import java.lang.Class;
import java.lang.reflect.Modifier;

class Animal
{
	
}
 //put this class in different Dog.java file
     class Dog1 extends Animal
   {
	   public void display()
	   {
		   System.out.println("I am a Dog ");
	   }
   }
   //put this in Main.java file
 class Main 
{

	public static void main(String[] args) 
	{
		try 
		{
			//create an object of Dog
			Dog1 d1 = new Dog1();
			
			//create an object of Class
			//using getClass()
			Class obj = d1.getClass();
			
			//get name of the class
			String name = obj.getName();
			System.out.println("Name : " + name);
			
			//get the access modifier of the class
			int modifier = obj.getModifiers();
			
			//convert the access modifier to String
			String mod = Modifier.toString(modifier);
			System.out.println("Modifier : " + mod);
			
			//get the superClass of Dog
			Class superClass = obj.getSuperclass();
			System.out.println("SuperClass : " + superClass.getName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
