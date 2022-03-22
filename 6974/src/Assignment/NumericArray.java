package Assignment;

import java.util.Arrays;

public class NumericArray 
{

	public static void main(String[] args) 
	{
		int[] myarray= {23,12,45,67,89,13,34,29};
		String[] myarray2= {"Java", "Python" ,"DBMS","Cpp"};
		System.out.println("Original numeric array : "+Arrays.toString(myarray));
		Arrays.sort(myarray);
		System.out.println("Sorted numeric array : "+Arrays.toString(myarray));
		
		System.out.println("Original numeric array : "+Arrays.toString(myarray2));
		Arrays.sort(myarray2);
		System.out.println("Sorted numeric array : "+Arrays.toString(myarray2));
		

	}

}
