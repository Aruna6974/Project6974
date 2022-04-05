package Exception;
class MyOwnException extends Exception
{
  public MyOwnException(String msg)
  {
	  super(msg);
  }

	}
class Player
{

	public static void PlayerAge(int age)throws MyOwnException
	{
		if(age>15)
		{
			 MyOwnException  obj=new MyOwnException("Age can't be less than 15");
			 throw obj;
		}
		else
		{
			System.out.println("Input is valid");
		}
	}

      public static void main(String[] args) 
      {
    	  try
    	  {
    		  PlayerAge(13);
    	  }
    	  catch(MyOwnException e)
    	  {
    		  e.printStackTrace();
    	  }

	}

}
