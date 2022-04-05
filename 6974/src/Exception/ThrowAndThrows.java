package Exception;

public class ThrowAndThrows 
{
	
    public static double divide(double a,double b)throws ArithmeticException
    {
    	if(b==0)
    	{
    		throw new ArithmeticException("Invalid Division");
    	}
    	else
    	{
    		return a/b;
    	}
    }
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(divide(10,0));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
