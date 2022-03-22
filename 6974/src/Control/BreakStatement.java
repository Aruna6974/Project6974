package Control;

public class BreakStatement {

	public static void main(String[] args) 
	{
		int i=2;
		while(i<=12)
		{
			System.out.println("\n"+i);
			i++;
			if(i==8)
			{
				break;
			}
		}

	}

}
