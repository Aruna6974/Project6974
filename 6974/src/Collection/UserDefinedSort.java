package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Teacher implements Comparable<Teacher>
{
    public String name;
    public int age;
    public Teacher(String name,int age)
    {
    	this.name=name;
    	this.age=age;
    }
    public int ComparableTo(Teacher Teacher1)
    {
    	return this.age - Teacher1.age;
    }
	@Override
	public int compareTo(Teacher o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class UserDefinedSort 
{

	public static void main(String[] args) {
      ArrayList<Teacher> t1=new ArrayList<Teacher>();
      t1.add(new Teacher("Swapna",28));
      t1.add(new Teacher("Suresh",30));
      t1.add(new Teacher("Swetha",45));
      
      Collections.sort(t1);
      for(Teacher t : t1)
      {
    	  System.out.println(t.name+ " "+t.age);
      }


	}

}
