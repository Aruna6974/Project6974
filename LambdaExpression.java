package JAVA8;
interface Square
{
	int calculate(int X);
}
public class LambdaExpression 
{

	public static void main(String[] args) 
	{
		int a=6;
		Square s=(int X)->X*X;
		
		int ans=s.calculate(a);
		System.out.println(ans);

	}

}
