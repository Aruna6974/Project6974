
//FEATURES----------------------------------------------------

//1. Java 8 Filter Example: Counting Empty String
 //  List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

//2.Count String whose length is more than three

//3. Count number of String which starts with "a"
//4.Java 8 Collectors Example: Remove all empty Strings from List

//5. Create a List with String more than 2 characters

//6. Convert String to uppercase and Join them with coma

//7.Create a List of the square of all distinct numbers

//8. Get count, min, max, sum, and the average for numbers
//List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);


package Java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {


	public static void main(String[] args) 
	{
		List<String> strList=Arrays.asList("abcde","","bcd","","defg","jk");
		
		//Filter
		long l1= strList.stream().filter(s->s.isEmpty()).count();
		System.out.println(l1);
		
		 
		//Count String Whose length is more than three
		long count= strList.stream().filter(s->s.length()>3).count();
		System.out.println(count);
		
		//count no.of Strings which starts with "a"
		long count1=strList.stream().filter(s->s.startsWith("a")).count();
		System.out.println(count1);
		
		//Remove all empty Strings from List
		long count2=strList.stream().filter(s->!s.isEmpty()).count();
		System.out.println(count2);
		
		//create a List with String more than 2 Characters
		List<String> count3= strList.stream().filter(s->s.length()>2).collect(Collectors.toList());
		System.out.println(count3);
		
		//convert String with UpperCase and join with them coma
		List<String> count4=strList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(count4);
		
		//create a List of the Square of all the distinct numbers
		List<Integer> numbers=Arrays.asList(3,2,4,5,6,7,8);
		
		List<Integer> count5=numbers.stream().map(s->s*s).distinct().collect(Collectors.toList());
		System.out.println(count5);
		
		// Get count, min, max, sum, and the average for numbers
		
		 List<Integer> numbers1 = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		 IntSummaryStatistics count6 = numbers1.stream() .mapToInt((s) -> s) .summaryStatistics();
          System.out.println(count6);

	}

}
