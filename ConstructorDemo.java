package JAVA8;
interface Engine2
{
	abstract public void speed();
}
class Car2
{
	public Car2()
	{
		System.out.println("This is my Constructor of Car");
	}
}
public class ConstructorDemo
{

	public static void main(String[] args) 
	{
		Engine2 obj=()->System.out.println("Speed is Good");
		obj.speed();
		
		Engine2 obj1=Car2::new;
		obj1.speed();

	}

}
