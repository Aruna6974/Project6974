package String;

public class Equalsmethod 
{

	public static void main(String[] args) 
	{
		String s1="Surya";
		String s2="Surya";
		String s3=new String("Surya");
		String s4="Kavya";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
	}

}
