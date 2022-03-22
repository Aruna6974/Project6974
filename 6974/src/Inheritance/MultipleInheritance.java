package Inheritance;
interface A
{
	final static int x=30;
	abstract void display();
	abstract void show();
}
interface B
{
	final static int x=50;
	abstract void show();
}
class Car
{
	public void speed()
	{
		System.out.println("The speed of the car is very Bad");
	}
}

public class MultipleInheritance extends Car implements A,B
{

	public static void main(String[] args) 
	{
		
	  MultipleInheritance obj=new MultipleInheritance();
	  
	  obj.speed();
	  obj.display();
	  obj.show();

	}

	@Override
	public void display() 
	{
		System.out.println("This is my display method");
		
	}

	@Override
	public void show() 
	{
	   System.out.println("the value of x of interface A "+A.x);
	   System.out.println("the value of x of interface B "+B.x);
		
	}

}
