package Inheritance;
class Animal
{
	public void animalsound22()
	{
		System.out.println("The animal makes a sound");
	}
}
class Dog extends Animal
{
	public void animalsound44()
	{
	//animalsound44();
		System.out.println("The dog says:bow bow");
	}
	
}
public class Super 
{

	public static void main(String[] args) 
	{
		Animal myDog=new Dog();
		

	}

}
