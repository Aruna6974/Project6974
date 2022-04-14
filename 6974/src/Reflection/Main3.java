package Reflection;

import java.lang.Class;
import java.lang.reflect.*;

class Dog4 
{

  // public constructor without parameter
  public Dog4() 
  {

  }

  // private constructor with a single parameter
  private Dog4(int age) 
  {

  }

}

class Main3 
{
  public static void main(String[] args) 
  {
    try 
    {
      // create an object of Dog
      Dog4 d1 = new Dog4();

      // create an object of Class
      // using getClass()
      Class obj = d1.getClass();

      // get all constructors of Dog
      Constructor[] constructors = obj.getDeclaredConstructors();

      for (Constructor c : constructors) 
      {

        // get the name of constructors
        System.out.println("Constructor Name: " + c.getName());

        // get the access modifier of constructors
        // convert it into string form
        int modifier = c.getModifiers();
        String mod = Modifier.toString(modifier);
        System.out.println("Modifier: " + mod);

        // get the number of parameters in constructors
        System.out.println("Parameters: " + c.getParameterCount());
        System.out.println("");
      }
    }
    
    catch (Exception e) 
    {
      e.printStackTrace();
    }
  }
}