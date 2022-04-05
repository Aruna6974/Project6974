//Create an ArrayList of Employee( id,name,address,sal) objects
//and search for particular Employee object based on id number

package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 public class Employee2
{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee2(int id,String name,String address,Double salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	@Override
	public String toString()
	{
		return "Employee[id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + " ]";
     }


public class ListArrayList1 
{

	public  void main(String[] args) 
	{
		List<Employee2> list=new ArrayList<>();
		
		list.add(new Employee2(100,"Asha","124 street,India", 30000.0));
		list.add(new Employee2(103,"Tharunika","243 street,India", 25000.0));
		list.add(new Employee2(105,"Anurag","342 street,India", 35000.0));
		list.add(new Employee2(108,"Usha","123 street,India", 20000.0));
		
		Iterator<Employee2> it=list.iterator();
		int searchId=108;
		while(it.hasNext())
		{
			Employee2 emp=it.next();
			if(emp.getId() == searchId)
				System.out.println(emp);
			
		}
		
	}


 }
}