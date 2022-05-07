package JAVA8;
interface Engine1
{
	abstract public void speed();
}
class Car1
{
	public void Wheel()
	{
		System.out.println("Car has wheel of MRF Company");
	}
}
public class InstanceMethod 
{

	public static void main(String[] args)
	{
		//Using lambda Expression
		Engine1 obj=()->System.out.println("The Speed of the Car is Very Good");
		obj.speed();
		
		//lambda replaced with instance Referance
		Car1 car=new Car1();
		//car.Wheel();
		Engine1 obj1=car::Wheel;
		obj1.speed();
		

	}

}
