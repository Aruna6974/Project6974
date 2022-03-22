package coreJava;
interface Parent
{
	void parentinfo1();
	void Parentinfo2();
}
	 class Child implements Parent
{

		@Override
		public void parentinfo1() 
		{
		System.out.println("Parent info1 method");	
		}

		@Override
		public void Parentinfo2()
		{
			System.out.println("Parent info2 method");
			
		}
}
public class Interface {

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.parentinfo1();
		c.Parentinfo2();
		
	}

}
