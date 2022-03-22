package Assignment;

public class CopytoAnotherArray 
{

	public static void main(String[] args)
	{
		int[] original= {20,10,30,40,45};
		int[] copy=original;
		System.out.println("Original Array is:");
		for(int i=0;i<original.length;i++)
		{
		System.out.print(original[i]+"\t ");
		}
		System.out.println("Copied Array is:");
		for(int i=0;i<copy.length;i++)
		{
		System.out.print(copy[i]+" \t");
	    }

    }
}
