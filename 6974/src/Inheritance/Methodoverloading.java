package Inheritance;

public class Methodoverloading 
{
      
	public void area(int side)
	{
		System.out.println("Side of Square is "+side);
		int result=side*side;
		System.out.println("Area of Square is "+result);
		System.out.println("..............................\n");
		
	}
	public void area (int length,int width)
	{
		System.out.println("Length of the rectangle is "+length);
		System.out.println("Width of the rectangle is "+width);
		int area=length*width;
		System.out.println("Area of the rectangle is "+area);
		System.out.println(".....................................\n");
	}
	public void area(double pi,int r)
	{
		System.out.println("Radius of the circle is "+r);
		double area=pi*r;
		System.out.println("Area of the circle is "+area);
		System.out.println("................................\n");
	}
	public static void main(String[] args) 
	{
       Methodoverloading obj=new Methodoverloading();
       obj.area(20); //Area of the Square    
       obj.area(10,40);
       obj.area(3.14,8);
       System.out.println(".............................\n");

	}

}
