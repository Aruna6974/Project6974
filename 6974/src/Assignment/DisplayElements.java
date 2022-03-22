package Assignment;

import java.util.Scanner;

public class DisplayElements 
{

	public static void main(String[] args) 
	{
		
        int i,Number;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter number of elements in an array:");
        Number=sc.nextInt();
        
        int[]Array=new int[Number];
        
        System.out.println("please enter"+Number+"elements of an Array:");
        for(int i1=0;i1<Number;i1++)
        {
        	Array[i1]=sc.nextInt();        
        }
	      System.out.println("\n  Elements in this Array are  ");
	      for(int j=0;j<Number;j++)
	      {
	    	  System.out.println(Array[j]+"\t");
	      }

    }
}
