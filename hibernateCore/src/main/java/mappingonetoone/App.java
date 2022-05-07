package mappingonetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{

	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		Department department=new Department();
		department.setDepartmentId(1);
		department.setDepartmentName("Library");
		
		
		Employee employee=new Employee();
		employee.setEmployeeId(101);
		employee.setEmployeeName("Barathi");
		employee.setEmployeeContact("9856748923");
		employee.setDepartment(department);
		
		department.setEmployee(employee);
		
		session.saveOrUpdate(department);
		session.saveOrUpdate(employee);
		
		transaction.commit();

	}

}
