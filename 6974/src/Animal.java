 interface Moveable
{
	default void move()
	{
		System.out.println("I am Moveing");
	}
}
public class Animal implements Moveable
{

	public static void main(String[] args)
	{
         Animal obj=new Animal();
         obj.move();
	}

}
