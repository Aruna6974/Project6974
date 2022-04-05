package Wrapper;

public class WrapperClass {

	public static void main(String[] args) 
	{
		//Boxing
		int a=45;
		Integer b=35;
		System.out.println("Auto boxing:"+b);
		
		
		int p=90;
		Integer q=Integer.valueOf(p);
		System.out.println("Boxing :"+q);
		
		
		//Unboxing
		Integer score=34;
		int newerscore=score;
		System.out.println("Auto Unboxing : "+newerscore);
		
		
		Integer Result=78;
		int newerResult=Result.intValue();
		System.out.println("Unboxing : "+newerResult);
		

	}

}
