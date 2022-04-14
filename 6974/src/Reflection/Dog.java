package Reflection;

  public class Dog 
{


 //create object of class
 //to reflect the Dog class
   Class a = Class.forName("Dog");
   
   //create an object of Dog class
    Dog d1 = new Dog();
    
    //create an object of class
    //to reflect Dog
      Class b = d1.getClass();
      
      //create an object of Class
      //to reflect the Dog Class
        Class c = Dog.class;
}
      
