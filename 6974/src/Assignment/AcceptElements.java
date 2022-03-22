package Assignment;

import java.util.Scanner;

public class AcceptElements 
{

	public static void main(String[] args) 
	{
		int n; int sum =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements you want in array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
           System.out.println("sum:"+sum);
	}

}
