package Thread;

class D extends Thread
{
	public void run()
	{
		System.out.println("The Thread D is Started");
		for(int i=0;i<=5;i++)
		{
			System.out.println("Value of i:"+i);
		}
		System.out.println("The Thread D is Exit ");
	}
}
class E extends Thread
{
	public void run()
	{
		System.out.println("The Thread E is Started");
		for(int j=0;j<=5;j++)
		{
			System.out.println("Value of j:"+j);
		}
		System.out.println("The Thread E is Exit ");
	}
}
class F extends Thread
{
	public void run()
	{
		System.out.println("The Thread F is Started");
		for(int k=0;k<=5;k++)
		{
			System.out.println("Value of k:"+k);
		}
		System.out.println("The Thread F is Exit ");
	}
}
public class ThreadPriority 
{

	public static void main(String[] args) 
	{
		D t1=new D();
		E t2=new E();
		F t3=new F();
		
        t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(5);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	
	}
	

}
