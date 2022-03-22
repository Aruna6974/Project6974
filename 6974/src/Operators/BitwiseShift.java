package Operators;

public class BitwiseShift {

	public static void main(String[] args) 
	{
		int a = 34;
		int b =-20;
		System.out.println("Signed Right shift 34 devide by 2= "+ (a>>1));
		System.out.println("Signed Right shift -20 devide by 2= "+ (b>>1));
		System.out.println("Signed Left shift 34 multiply by 2= "+ (a<<1));
		System.out.println("Signed Left shift -20 multiply by 2= "+(b<<1));
		System.out.println("Unsigned Right shift of 34 = " + (a>>>1));
		System.out.println("Unsigned Right shift of -20 = " + (b>>>1));

	}

}
