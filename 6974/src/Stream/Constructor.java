package Stream;
interface Engine2
{
	abstract public void speed();
}
class Car2
{
	
 public Car2()
  {
	System.out.println("This is Constructor of Car");
  }
}
public class Constructor 
{

	public static void main(String[] args)
	{
       Engine2 obj=()->System.out.println("Speed is Good");
       obj.speed();
       
       Engine2 obj4=Car2::new;
       obj4.speed();
	}

}
