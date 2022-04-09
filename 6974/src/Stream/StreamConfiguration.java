package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConfiguration 
{

	public static void main(String[] args) 
	{
		//create a list of Integers
		List<Integer> number=Arrays.asList(2,3,4,5);
		
		//create a list of String
		List<String> names=Arrays.asList("Reflection","Collection","Stream");
		
		//demonstrate the filter
		List<String> result=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("......................................");
		
		//demonstrate the sorted method
		List<String> show=names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
		System.out.println(".........................................");
		
		//demonstrate the MAP method
		Stream<String> s1=Stream.of("sweety","apple","mango","banana");
		List<String> result2=s1.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(result2);
		
		System.out.println("...............................");
		
		//MIN method
		Stream<Integer> s2=Stream.of(1,2,3,4,5);
		Optional<Integer> min=s2.min((O1,O2)-> O1.compareTo(O2));
		System.out.println("min ::"+min.get());
		
		System.out.println(".........................");
		
		//MAX method
		Stream<Integer> s3=Stream.of(1,2,3,4,5,6,7);
		Optional<Integer> max=s3.max((O1,O2)-> O1.compareTo(O2));
		System.out.println("max :: "+max.get());
		
		System.out.println(".......................");
		
		//forEach
		Stream<Integer> s4=Stream.of(6,7,8,9,3);
		s4.forEach(ele->System.out.println(ele));
		
		System.out.println("..........................");
		
		//count()
		Stream<Integer> s5=Stream.of(20,30,45,12,34);
		long count=s5.count();
		System.out.println(count);
		
		System.out.println("...........................");
		
		//toArray()
		Stream<Integer> s6=Stream.of(12,10,20,30);
		Object[] array=s6.toArray();
		for(Object a : array)
		{
			System.out.println(a);
		}
		
		System.out.println("....................");
		
		//Collect
		Stream<String> words=Stream.of("hello","how","are","you");
		List<String> words1=words.map(word->word.toUpperCase()).collect(Collectors.toList());
		System.out.println(words1);

	}

}
