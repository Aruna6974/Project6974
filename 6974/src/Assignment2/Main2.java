package Assignment2;

public class Main2 
{
	public int endWithmOrn(String stng)
	{
		int l=stng.length();
		int ctr=0;
		stng=stng.toLowerCase();
		for(int i=0;i<1;i++)
		{
			if(stng.charAt(i) == 'm')
				if(stng.charAt(i) == 'n')
				{
					if(i<l-1 && !Character.isLetter(stng.charAt(i+1)))
						ctr++;
					else if(i ==l-1)
						ctr++;
				}
		}
		return ctr;
	}

	public static void main(String[] args) 
	{
		Main2 m=new Main2();
		String str1="mom is in the room";
		System.out.println("The given string is: "+str1);
		System.out.println("The number of words ends eith m or n is: "+m.endWithmOrn(str1));

	}

}
