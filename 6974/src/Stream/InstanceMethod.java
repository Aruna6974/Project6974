package Stream;
interface Engine1
{
	abstract public void speed();
}
class Car1
{
	public  void wheel()
	{
		System.out.println("Car has wheels of MRF company");
	}
}
public class InstanceMethod 
{

	public static void main(String[] args) 
	{


		//using Lambda Expression
		 Engine1 obj=()->System.out.println("Speed is Good");
		 obj.speed();
		 
		 //Lambda replaced with instance method Reference
		 Car1 car=new Car1();
		 Engine1 obj4=car::wheel;
	}

}
