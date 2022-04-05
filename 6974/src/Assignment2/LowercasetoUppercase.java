package Assignment2;

import java.util.Scanner;

public class LowercasetoUppercase {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=" ";
		
		System.out.println("Enter any String: ");
		str=sc.nextLine();
		
		
		String lowerCaseString=" ";
		String upperCaseString=" ";
		
		
		lowerCaseString=str.toLowerCase();
		upperCaseString=str.toUpperCase();
		
		
		System.out.println("Original String:"+str);
		System.out.println("Lower Case String: "+lowerCaseString);
		System.out.println("Upper Case String: "+upperCaseString);
		

	}

}
