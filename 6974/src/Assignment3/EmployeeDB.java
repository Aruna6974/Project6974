package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB 
{
	List<Employee1> employeeDb=new ArrayList<>();
	
	public boolean addEmployee(Employee1 e)
	{
		return employeeDb.add(e);
	}
	public boolean deleteEmployee(int empId)
	{
		boolean isRemoved=false;
		
		Iterator<Employee1> it=employeeDb.iterator();
		
		while(it.hasNext())
		{
			Employee1 emp=it.next();
			if(emp.getEmpId()==empId)
			{
				isRemoved=true;
				it.remove();
			}
		}
		return isRemoved;
	}
	  public String showPlaySlip(int EmpId)
	  {
		  String PaySlip = "Invalid employee1 id";
		  
		  for(Employee1 e : employeeDb)
		  {
			  if(e.getEmpId()==EmpId)
			  {
				  PaySlip="PaySlip for employee1 id "+ EmpId + "is"+ e.Empsalary();
				  }
		  }
		  return PaySlip;
	  }
	  public Employee1[] listAll()
	  {
		  Employee1[] empArray = new Employee1[employeeDb.size()];
		  for(int i=0;i<employeeDb.size();i++)
		  {
			  empArray[i]=employeeDb.get(i);
		  }
		return empArray;
	  }


}
