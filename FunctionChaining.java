package JAVA8;

import java.util.function.Function;

public class FunctionChaining 
{

	public static void main(String[] args)
	{
		int amount=5;
		Function<Integer,Integer> sum=i->i+i; //5+5=10
		Function<Integer,Integer> mul=i->i*i;  //5*5=25
		 System.out.println(sum.apply(amount));
		 System.out.println(mul.apply(amount));
		 
		 System.out.println(sum.andThen(mul).apply(amount));
		                        //5(10)  ->  //10(100)
		 System.out.println(sum.compose(mul).apply(amount));
		 
		 

	}

}
