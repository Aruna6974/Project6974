package Stream;

import java.util.Optional;

public class OptionalClass 
{

	public static void main(String[] args) 
	{
		// Creating a String array
		String[] str=new String[5];
		
		//Setting  value for 3rd index
		str[3] = "Welcome to Edubridge";
		//Create an optional Object
		
		Optional<String> empty=Optional.empty();
		System.out.println(empty);
		
		//Optional.of
		Optional<String> value=Optional.of(str[3]);
		System.out.println(value);
		
		//Optional.ofNullable
		 String[] words=new String[10];
		Optional<String> checknull=Optional.ofNullable(words[9]);
		
		if(checknull.isPresent())
		{
			String word=words[5].toUpperCase();
			System.out.println(word);
		}
		else
		{
			System.out.println("My word is null");
		}
		
		//getmethod
		
		System.out.println(value.get());
		
		//hashCode
		
		System.out.println(value.hashCode());
		
		//ifPresent
		System.out.println(value.isPresent());
		
		Optional<String> statement=Optional.of("this is example program of ifpresent method.");
		statement.ifPresent(value1 -> System.out.println(value1.toUpperCase()));

	}

}
