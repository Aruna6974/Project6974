package Assignment2;

public class RemovingDuplicates {

	public static void main(String[] args) 
	{
      String str1="Welcome";
      System.out.println("The given string is: " +str1);
      System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
	}
	private static String removeDuplicateChars(String sourcestr)
	{
		char[] arr1=sourcestr.toCharArray();
		String targetStr = " ";
		for(char value: arr1)
		{
			if(targetStr.indexOf(value) == -1)
			{
				targetStr += value;
			}
		}
		return targetStr;
		
	}


}
