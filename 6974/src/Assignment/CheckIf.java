package Assignment;

public class CheckIf 
{

	public static void main(String[] args) 
	{
		int[] num= {2,4,6,8,10};
		int toFind=6;
		boolean found=false;
		
		for(int n : num)
		{
			if(n==toFind)
			{
				found=true;
				break;
			}
		}
		if(found)
			System.out.println(toFind + "is found.");
		else
			System.out.println(toFind + "is not found");

	}

}
