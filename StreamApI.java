package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApI
{

	public static void main(String[] args)
	{
		//create a list of Integers
		List<Integer> number=Arrays.asList(2,5,7,9,10);

		//create a list of String
		List<String> names=Arrays.asList("Aruna","Barathi","Archana","Nikita");
		
		//Filter
		List<String> result=names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("...............................");
		
		//sorted method
		List<String> show=names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
		System.out.println("...............................");
		
		//Map Method
		Stream<String> strm=Stream.of("sweety","mango","apple","banana");
		List<String> result1=strm.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(result1);
		
		System.out.println("...............................");
		
		//Min Method
		Stream<Integer> strm1=Stream.of(1,2,3,4,5,6);
		Optional<Integer> min=strm1.min((O1,O2)->O1.compareTo(O2));
		System.out.println("min ::"+min.get());
		
		System.out.println("...............................");
		
		    //Max Method
				Stream<Integer> strm2=Stream.of(1,2,3,4,5,6);
				Optional<Integer> max=strm2.max((O1,O2)->O1.compareTo(O2));
				System.out.println("max ::"+max.get());
				
				System.out.println("...............................");
				
				//ForEach
				Stream<Integer> strm3=Stream.of(4,6,9,20,34);
				strm3.forEach(ele->System.out.println(ele));
				
				System.out.println("...............................");
				
				//Count
				Stream<Integer> strm4=Stream.of(20,30,65,78,56);
				long count=strm4.count();
				System.out.println(count);
				
				System.out.println("...............................");
				
				//toArray
				Stream<Integer> strm5=Stream.of(12,3,45,34,78);
				Object[] array=strm5.toArray();
				for(Object a:array)
				{
					System.out.println(a);
				}
				
				System.out.println("...............................");
				
				//collect
				Stream<String> strm6=Stream.of("hello","how","are","you");
				List<String> list=strm6.map(word->word.toUpperCase()).collect(Collectors.toList());
				System.out.println(list);
				
		
	}
	

}
