package Thread;
class TotalEarning extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<=10;i++)
			{
				total=total+100;
			}
			this.notify();
		}
	}
}
public class MovieApp 
{

	public static void main(String[] args) 
	{
		TotalEarning obj=new TotalEarning();
		obj.start();
		synchronized(obj)
		{
			try 
			{
				obj.wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Total Earning is "+obj.total);
		}

	}

}
