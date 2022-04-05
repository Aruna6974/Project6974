 public interface moveable
{
	default void move();
	{
		System.out.println("I am Moving Method");
	}
	
	int calculate(int X,int Y);
}
public class Demo 
{

	public static void main(String[] args) 
	{
		int B=10;
		int C=10;
		
		Circle c=( X, Y)->X*Y;
		
		int ans=c.calculate(B,C);
		System.out.println(ans);

	}

}
