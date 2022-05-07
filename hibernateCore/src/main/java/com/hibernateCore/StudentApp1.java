package com.hibernateCore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.StudentEntity2;

public class StudentApp1 {

	public static void main(String[] args)
	{
		EntityManagerFactory entitymanager=Persistence.createEntityManagerFactory("hibernateCore");
		EntityManager entity=entitymanager.createEntityManager();
		entity.getTransaction().begin();
		
		StudentEntity2 student=new StudentEntity2();
//		student.setStudentId(1);
//		student.setStudentName("Barathi");
//		student.setStudentAge(21);
		
		StudentEntity2 student1=new StudentEntity2();
//		student1.setStudentId(2);
//		student1.setStudentName("Archana");
//		student1.setStudentAge(22);
		
		StudentEntity2 student2=new StudentEntity2();
//		student2.setStudentId(3);
//		student2.setStudentName("nikitha");
//		student2.setStudentAge(23);
//		
//		entity.persist(student);
//		entity.persist(student1);
//		entity.persist(student2);
		
//		Query query=entity.createQuery("Update StudentEntity2 set studentName=:a where studentId=:id");
//		query.setParameter("a", "Aruna");
//		query.setParameter("id", 3);
//		int status=query.executeUpdate();
//		System.out.println(status);
		
		Query query=entity.createQuery("Delete From StudentEntity2 WHERE studentId=3");
		query.executeUpdate();
		entity.getTransaction().commit();

	}

}
