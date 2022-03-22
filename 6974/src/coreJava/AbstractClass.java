package coreJava;
abstract class Company
{
	abstract void info1();
	
	void info2()
	{
		System.out.println("I am non abstract method ");
	}
}
class Employee extends Company
{
	
  @Override
	void info1() 
	{
		System.out.println("I am abstract method in Company Class and implements in Employee Child");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.info1();
        e.info2();
	}

}
