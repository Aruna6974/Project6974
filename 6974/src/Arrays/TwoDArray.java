package Arrays;

public class TwoDArray 
{

	public static void main(String[] args) 
	{
		int[][] myarray = new int[2][3];
		myarray[0][0]=12;
		myarray[0][1]=13;
		myarray[0][2]=20;
		myarray[1][0]=25;
		myarray[1][1]=30;
		myarray[1][2]=35;
		
		System.out.println("Marks at myarray[0][0] "+myarray[0][0]);
		System.out.println("Marks at myarray[0][1] "+myarray[0][1]);
		System.out.println("Marks at myarray[0][2] "+myarray[0][2]);
		System.out.println("Marks at myarray[1][0] "+myarray[1][0]);
		System.out.println("Marks at myarray[1][1] "+myarray[1][1]);
		System.out.println("Marks at myarray[1][2] "+myarray[1][2]);
		
		for(int row=0;row<myarray.length;row++)
		{
			for(int column=0;column<myarray[row].length;column++)
			{
				System.out.print(myarray[row][column]+"\t");

	         }
			System.out.println("\n");

	    }

	}


}
