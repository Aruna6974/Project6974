package JAVA8;
interface Engine
{
	abstract public void speed();
}
class car
{
	public static void average()
	{
		System.out.println("The average of the car is very Speed ");
	}
}
public class StaticRefernce 
{

	public static void main(String[] args) 
	{
		//using Lambda Expression
	  	Engine eng=()->System.out.println("Speed is very Good");
	  	eng.speed();
	  	
	  	//Lambda replaced with static method Refernce
	  	Engine eng1=car::average;
	  	eng1.speed();

	}

}
