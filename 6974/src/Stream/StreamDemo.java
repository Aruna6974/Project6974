package Stream;

import java.util.stream.Stream;

public class StreamDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("START- String Stream");
		
		Stream<String> Stringstream=Stream.of("A","B","C","D","E","F");
		Stringstream.forEach(abcd -> System.out.println(abcd));
		
		System.out.println("END- String Stream");

	}

}
