package Control;
import java.util.Scanner;
public class ElseIfLadderStatement {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enterday between 0 to 6 day = ");
		int day = s.nextInt();
		if(day==0)
		{
			System.out.println("\n sunday");
		}
		else if(day==1)
		{
			System.out.println("\n monday");
		}
		else if(day==2)
		{
			System.out.println("\n tuesday");
		}
		else if(day==3)
		{
			System.out.println("\n wednesday");
		}
		else if(day==4)
		{
			System.out.println("\n thursday");
		}
		else if(day==5)
		{
			System.out.println("\n friday");
		}
		else if(day==6)
		{
			System.out.println("\n saturday");
		}
		else 
		{
			System.out.println("\n wrong input");
		}

	}

}
