package Assignment;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) 
	{
       int a[]=new int[5];
       int n,count=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter elements in Array");
       for(int i=0;i<a.length;i++)
       {
    	  a[i]=sc.nextInt();       
       }
       System.out.println("Array elements ");
       for(int i=0;i<a.length;i++)
       {
    	   System.out.println(a[i]+" ");
       }
       System.out.println("Enter search Elements ");
       n=sc.nextInt();
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]==n)
    	   {
    		   count++;
    	   }
       }
       if(count>0)
    	   System.out.println("Item found" +count+"times");
       else
    	   System.out.println("Item not found");

	}

}
