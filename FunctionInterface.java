package JAVA8;
interface Eatable
{
	abstract public void Eat1();
}
public class FunctionInterface 
{

	public static void main(String[] args) 
	{
		Eatable eat =new Eatable()
		{
			public void Eat1()
			{
				System.out.println("Nice Fruits");
			}
		};
		eat.Eat1();

	}

}
