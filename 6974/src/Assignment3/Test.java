package Assignment3;

public class Test {

	public static void main(String[] args) 
	{
/*		Create an Employee class with the related attributes and
 *	    behaviours. Create one more class EmployeeDB which has the
 *  	following methods. a. boolean addEmployee(Employee e) b.
 *		boolean deleteEmployee(int eCode) c. String showPaySlip(int
 *		eCode) d. Employee[] listAll() Use an ArrayList which will be
*		used to store the emplyees and use enumeration/iterator to
*		process the employees.
*/	
	
	//	Write a Test Program to test that allfunctionalities are operational.
		EmployeeDB empDb=new EmployeeDB();
	
		Employee1 emp1=new Employee1(100,"Asha","124 street,India", 30000.0);
		Employee1 emp2=new Employee1(103,"Tharunika","243 street,India", 25000.0);
	    Employee1 emp3=new Employee1(105,"Anurag","342 street,India", 35000.0);
		Employee1 emp4=new Employee1(108,"Usha","123 street,India", 20000.0);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);
		
		for(Employee1 emp : empDb.listAll())
		{
			System.out.println(emp.GetEmployee1Details());
			System.out.println();
			empDb.deleteEmployee(3);
			
		}
		

	}

}
