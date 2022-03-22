package String;

public class StringManipulation 
{


	public static void main(String[] args) 
	{
		StringBuffer str=new StringBuffer("Object language");
		System.out.println("Original String:"+str);
		
		//obtaining string length
		
		System.out.println("Length of String "+str.length());
		
		//Accessing character in string
		
		for(int i=0;i<str.length();i++)
		{
			int p=i+1;
			
			System.out.println("Characters at position : "+p+"is"+str.charAt(i));
		}
		
		//inserting a string in the middle
		
		String str2=new String(str.toString());
		int pos=str2.indexOf("Language");
		
		str.insert(pos,"Oriented");
		
		System.out.println("Modified string :"+str);
		
		//modifying character
		
		str.setCharAt(6, '-');
		
		System.out.println("String Now :"+str);
		
		//Appending a string at the end
		
		str.append("Improve Security");
		System.out.println("Append String:"+str);
		

	}



}
