package JAVA8;

import java.util.stream.Stream;

public class StreamDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("START- Integer Stream");
		
		Stream<Integer> stringstream=Stream.of(1,2,3,4,5,6);
		stringstream.forEach(abcd->System.out.println(abcd));
		System.out.println("END-Integer Strem");

	}

}
