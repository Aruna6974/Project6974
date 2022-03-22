package Inheritance;
class Sem1
{
	public Sem1()
	{
		System.out.println("Sem1 constructor ");
	}
	int comp,eng,sci;
	 void input()
	{
		comp=80;
		eng=90;
		sci=50;
	}
	public void output()
	{
		System.out.println("Result of Semester-1 \n\n");
		System.out.println("Marks in Computer "+comp);
		System.out.println("Marks in English "+eng);
		System.out.println("Marks in Science "+sci);
		 
		System.out.println("...........................\n\n");
	}
}
class Sem2 extends Sem1
{
	public Sem2()
	{
		System.out.println("Sem2 constructor ");
	}
	int math,soc,C;
	void input2()
	{
		math=70;
		soc=80;
		C=100;
	}
	public void output2()
	{
		System.out.println("Result of Semester-2 \n\n");
		System.out.println("Marks in Mathematics "+math);
		System.out.println("Marks in Social "+soc);
		System.out.println("Marks in C-Language "+C);
		 
		System.out.println("...........................\n\n");
	}
}
class Sem3 extends Sem2
{
	public Sem3()
	{
		System.out.println("Sem3 constructor ");
	}
	int Se,dbms,java;
	void input3()
	{
		Se=80;
		dbms=90;
		java=70;
	}
	public void output3()
	{
		System.out.println("Result of Semester-3 \n\n");
		System.out.println("Marks in Software Engineering "+Se);
		System.out.println("Marks in DBMS "+dbms);
		System.out.println("Marks in Java "+java);
		 
		System.out.println("...........................\n\n");
	}
}
public class SingleInheritance 
{

	public static void main(String[] args) 
	{
	  Sem3 obj=new Sem3();
	  
	  obj.input();
	  obj.input2();
	  obj.input3();
	  obj.output();
	  obj.output2();
	  obj.output3();

	}

}
