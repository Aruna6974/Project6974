package Control;

public class DoWhile {

	public static void main(String[] args) 
	{
		int i=2;
		int sum=0;
		do
		{                //sum 0,2,5,9,14,20,27,35,44,54,65,77
			             //i 2,3,4,5,6,7,8,9,10,11,12
			
			sum=sum+i;
			i++;
		}while(i<=12);
		System.out.println("\n\n\tThesum of 2 to 12 is.."+sum);		

	}

}
