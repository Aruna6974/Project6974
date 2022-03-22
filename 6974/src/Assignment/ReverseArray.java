package Assignment;

import java.util.Scanner;

public class ReverseArray 
{

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("How many elements you want?");
      int n=sc.nextInt();
      int[] elt=new int[n];
      for(int i=0;i<n;i++);
      {
    	  System.out.println("Enter array elements "+(n+1));
    	  elt[n]=sc.nextInt();
      }
      System.out.println("Original elements are:");
      for(int i=0;i<n;i++)
      {
    	  System.out.println(elt[i]+" ");
      }
      System.out.println("Reverse elements are:");
      for(int i=n-1;i>=0;i--)
      {
    	  System.out.println(elt[i]+" ");
      

	  }
   }
}