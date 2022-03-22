package String;

public class CompareEqual 
{

	public static void main(String[] args) 
	{
		String s1="Surya";
		String s2="Surya";
		String s3=new String("Surya");
		System.out.println(s1==s2);  //true (because both refer to same instance)
		System.out.println(s1==s3);  //false(because s3 refers to instance created in non pool)
	}

}
