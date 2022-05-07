package JAVA8;

import java.util.function.Predicate;

public class PredicateDemo1
{

	public static void main(String[] args)
	{
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		Predicate<Integer>  even=(X->(X%2==0));
		Predicate<Integer> grt=Y->Y>5;
		
		for(int i:num)
		{
			if(grt.or(even).test(i))
			{
				System.out.println(i);
			}
		}

	}

}
