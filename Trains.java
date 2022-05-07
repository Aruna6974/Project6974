package JAVA8;
interface TrainEngine1
{
	public static void display()
	{
		System.out.println("This is my display method");
	}
}
public class Trains implements TrainEngine1
{

	public static void main(String[] args)
	{
		TrainEngine1.display();

	}

}
