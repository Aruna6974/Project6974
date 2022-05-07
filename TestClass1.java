package JAVA8;
interface TestInterface1
{
	public void square(int a);
	
	default void show()
	{
		System.out.println("This is Default Method");
	}
	
}
public class TestClass1 implements TestInterface1
{
	public void square(int a)
	{
		System.out.println(a*a);
	}

	public static void main(String[] args)
	{
      TestClass1 test=new TestClass1();
      test.square(5);
      test.show();
	}

}
