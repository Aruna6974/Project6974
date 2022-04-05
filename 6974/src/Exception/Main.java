package Exception;

public class Main {

	public static void main(String[] args) 
	{
		try
		{
			int[] mynumbers= {1,2,3};
			System.out.println(mynumbers[15]);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong.");
		}
       finally
       {
    	   System.out.println("The 'try catch' is finished.");
       }
	}

}
