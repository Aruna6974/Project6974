package mappingonetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) 
	{

		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Faculty faculty1=new Faculty();
         faculty1.setFacultyId(1);
         faculty1.setFacultyName("Archana");
         
         Students student1=new Students();
         student1.setStudentId(101);
         student1.setStudentName("nikita");
         student1.setFaculty(faculty1);
         
         Students student2=new Students();
         student2.setStudentId(102);
         student2.setStudentName("barathi");
         student2.setFaculty(faculty1);
         
         List <Students> studentList=new ArrayList<Students>();
         studentList.add(student1);
         studentList.add(student2);
         faculty1.setStudents(studentList);
         
         session.saveOrUpdate(faculty1);
         session.saveOrUpdate(student1);
         session.saveOrUpdate(student2);
         
         transaction.commit();
         
          
         
	}

}
