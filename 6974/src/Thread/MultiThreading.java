package Thread;

//Extending Thread Class.
//Implements Runnable interface.
class A implements Runnable
//class A extends Thread
{
	public void run()
	{
		System.out.println("Thread A is Started.");
		for(int i=0;i<=10;i++)
		{
			//try
			//{
			//	Thread.sleep(3000);
			//}
			//catch(InterruptedException e)
			//{
				//e.printStackTrace();
			//}
			System.out.println("value of i "+i);
		}
		System.out.println("Thread A is exit.");
	}

		
}
class B implements Runnable
//class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B is Started.");
		for(int j=0;j<=10;j++)
		{
			System.out.println("value of j "+j);
		}
		System.out.println("Thread B is exit.");
	}
}
class C implements Runnable
//class C extends Thread
{
	public void run()
	{
		System.out.println("Thread C is Started.");
		for(int k=0;k<=10;k++)
		{
			System.out.println("value of k "+k);
		}
		System.out.println("Thread C is exit.");
	}
}

public class MultiThreading 
{

	public static void main(String[] args) 
	{
		A obj1=new A();   //New Born state
		B obj2=new B();
		C obj3=new C();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		
		t1.start();   //Runnable State or ready to run
		t2.start();
		t3.start();

	}

}
