package Inheritance;
class E
{
	public void methodE()
	{
		System.out.println("method of class E");
	}
}
class F extends E
{
  public void methodF()
  {
	  System.out.println("method of class F");
  }
}
class G extends E
{
	public void methodG()
	{
		System.out.println("method of class G");
	}
}
class H extends E
{
	public void methodH()
	{
		System.out.println("method of class H");
	}
}
public class Hierarchical 
{

	public static void main(String[] args) 
	{
		F obj1=new F();
		G obj2=new G();
		H obj3=new H();
		
		obj1.methodE();
		obj2.methodE();
		obj3.methodE();

	}

}
