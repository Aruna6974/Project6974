package String;

public class CompareToCompare 
{

	public static void main(String[] args) 
	{
		String s1="Surya";
		String s2="Surya";
		String s3="Kavya";
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3)); // 1 (because s1>s3)
		System.out.println(s1.compareTo(s1)); // -1 (because s3<s1)		

	}

}
