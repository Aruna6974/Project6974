package com.hibernateCore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.StudentEntityExample;

public class StudentApp {

	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernateCore");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		StudentEntityExample student=new StudentEntityExample();
		
		
//		  student.setStudentId(1); 
//		  student.setStudentName("Mani");
//		  student.setStudentage(23);
//		 
//		 
		
		StudentEntityExample student1=new StudentEntityExample();
		
//		  student1.setStudentId(2);
//		  student1.setStudentName("Lakshmi");
//		  student1.setStudentage(22);
		 
		
		StudentEntityExample student2=new StudentEntityExample();
		
//		  student2.setStudentId(3); 
//		  student2.setStudentName("Mounisha");
//		  student2.setStudentage(24);
//		  
//		  em.persist(student);
//		  em.persist(student1);
//		  em.persist(student2);
//		 
		
		
		/*
		 * Query query =em.
		 * createQuery("Update StudentEntityExample set studentId=:a , studentName=:b,studentage=:c"
		 * ); query.setParameter("a", 1); query.setParameter("b", "Mani");
		 * query.setParameter("c", 25); int status=query.executeUpdate();
		 * System.out.println(status);
		 */
		
		  Query
		  query=em.createQuery("Delete From StudentEntityExample WHERE studentId=1");
		  query.executeUpdate();
		
		em.getTransaction().commit();
		emf.close();
		em.close();

	}

}
