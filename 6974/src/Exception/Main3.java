package Exception;
import java.io.InputStreamReader;

import java.io.BufferedReader;
public class Main3 
{

	public static void main(String[] args) 
	{
		InputStreamReader inr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(inr);
		
		
		try
		{
			System.out.println("Enter any value ");
			String name=br.readLine();
			int num1=Integer.parseInt(name);
			
			System.out.println("Number is "+num1);
			System.out.println("Enter any Float value");
			
			Float f=Float.parseFloat(br.readLine());
			System.out.println("Float type is "+f);
			
		}
		
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
