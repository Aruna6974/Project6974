package mappingmanytomany;

import java.util.ArrayList;
import java.util.List;

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
		
		Doctor doctor=new Doctor();
		doctor.setDoctorId(1);
		doctor.setDoctorName("barathi");
		
		
		Doctor doctor1=new Doctor();
		doctor1.setDoctorId(2);
		doctor1.setDoctorName("nikita");
		
		
		List<Doctor> doctorList=new ArrayList<Doctor>();
		doctorList.add(doctor);
		doctorList.add(doctor1);
		
		Patient patient=new Patient();
		patient.setPatientId(101);
		patient.setPatientName("Aruna");
		patient.setDoctors(doctorList);
		
		Patient patient1=new Patient();
		patient1.setPatientId(102);
		patient1.setPatientName("Archana");
		patient1.setDoctors(doctorList);
		
		
		List<Patient> patientList=new ArrayList<Patient>();
		patientList.add(patient);
		patientList.add(patient1);
		
		doctor.setPatient(patientList);
		doctor1.setPatient(patientList);
		
		session.saveOrUpdate(doctor);
		session.saveOrUpdate(doctor1);
		
		 session.saveOrUpdate(patient); 
		 session.saveOrUpdate(patient1);
		 
        
        transaction.commit();
	    

	}

}
