package String;

public class StringEqual {

	public static void main(String[] args) 
	{
		String s1="Hello Dear";
		String s2="Hello Dear";
		String s3=new String("Hello Dear");
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 refer to identical strings");
		}
		else
		{
			System.out.println("s1 and s2 refer to non-identical strings.");
		}
		if(s1==s2)
		{
			System.out.println("s1 and s2 refer to the same string.");
		}
		else
		{
			System.out.println("s1 and s2 refer to different strings.");
		}
		if(s1.equals(s3))
		{
			System.out.println("s1 and s3 refer to identical strings.");
		}
		else
		{
			System.out.println("s1 and s3 refer to non-identical strings.");
		}
		if(s1==s3)
		{
			System.out.println("s1 and s3 refer to the same string.");
		}
		else
		{
			System.out.println("s1 and s3 refer to different strings.");
		}

	}

}
