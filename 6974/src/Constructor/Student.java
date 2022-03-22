package Constructor;

public class Student 
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		Student s1=new Student(100,"Suraj");
		
		Student s2=new Student(85,"Teja");
		
		s1.display();
		s2.display();

	}

}
