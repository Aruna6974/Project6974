package Constructor;

public class Rectangle
{
	Rectangle(int length,int breadth)
	{
		System.out.println("Length is: "+length);
		System.out.println("Breadth is: "+breadth);
		int area=length*breadth;
		System.out.println("Area is: "+area);
     }
	Rectangle(int a)
	{
		System.out.println("value of a is: "+a);
	}
	Rectangle()
	{
		System.out.println("This is a Constructor...........");
	}

	public static void main(String[] args) 
	{
		
       Rectangle obj=new Rectangle(20,40);
       Rectangle obj1=new Rectangle(50);
       Rectangle obj2=new Rectangle();
	}

}
