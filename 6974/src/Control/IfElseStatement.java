package Control;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) 
	{
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks=in.nextInt();
		
		if(marks>=30)
		{
			System.out.println("you are pass.");
		}
		else
		{
			System.out.println("you are fail.");
		}

	}

}
