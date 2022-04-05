package Assignment2;
import java.util.Scanner;
public class PalindromeString 
{

	public static void main(String[] args) 
	{
		String reverse="";
		
		System.out.println("Enter the input String.");
		Scanner sc=new Scanner(System.in);
       String Original= sc.nextLine();
		
		for(int i=0;i<Original.length();i++)
		{
		
			reverse=reverse+Original.charAt(i);
		}
		if(Original.equals(reverse))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome.");
		}

	}

}
