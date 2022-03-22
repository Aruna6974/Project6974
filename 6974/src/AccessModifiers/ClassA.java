package AccessModifiers;

public class ClassA 
{
	public void display()
	{
		System.out.println("SoftwareTestingHelp ! !");
	}
}
class B
{
	public static void main(String[] args) 
	{
		A obj = new A ();
		obj.display( );
		

	} 

}
