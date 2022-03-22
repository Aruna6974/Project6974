package Static;
class Student
{
	int rollno;
	String name;
	static String college="JBS";
	
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class TestStaticVariable 
{

	public static void main(String[] args) 
	{
		Student s1=new Student(123,"suraj");
		Student s2=new Student(200,"ankith");
		
		Student.college="BBDIT";
		
		s1.display();
		s2.display();

	}

}
