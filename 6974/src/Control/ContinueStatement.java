package Control;

public class ContinueStatement {

	public static void main(String[] args) 
	{
		for(int i=1;i<10;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println("\n"+i);
		}

	}

}
