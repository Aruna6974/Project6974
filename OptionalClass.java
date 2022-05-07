package JAVA8;

import java.util.Optional;

public class OptionalClass
{

	public static void main(String[] args)
	{
		//creating a string array
		String[] str=new String[5];
		
		//setting value of 3rd index
		str[3] ="Welcome to Edubridge";
		
		//creating an optional Object
		Optional<String> empty=Optional.empty();
		System.out.println(empty);
		
		//Optional.of
		Optional<String> value=Optional.of(str[3]);
		System.out.println(value);
		
		//Optional.ofNullable
		String[] words=new String[10];
		Optional<String> checknull=Optional.ofNullable(words[8]);
		
		if(checknull.isPresent())
		{
			String word=words[4].toUpperCase();
			System.out.println(word);
		}
		else
		{
			System.out.println("My Word is null");
		}
		
		//getMethod
		System.out.println(value.get());
		
		//hasCode
		System.out.println(value.hashCode());
		
		//ifPresent
		System.out.println(value.isPresent());
		
		
		Optional<String> statement=Optional.of(null);
		statement.ifPresent(value1->System.out.println(value1.toUpperCase()));

	}

}
