package Control;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) 
	{
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks=in.nextInt();
		
		if(marks>=40)
		{
			System.out.println("you are pass.");
		}

	}

}
