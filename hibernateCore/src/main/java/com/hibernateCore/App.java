package com.hibernateCore;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entity.StudentEntity;

public class App 
{

	public static void main( String[] args)
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        StudentEntity student = new StudentEntity();
        String hql = "From StudentEntity";
//        String hql="Select Email from StudentEntity S";
          // String hql="From StudentEntity student where student.rollno=:rollno";
          // String hql="from StudentEntity student where student.Email and student.studentName";
//        Query q=session.createQuery("Update StudentEntity set studentName=:n where rollno=:i");
//        q.setParameter("n", "Emily");
//        q.setParameter("i", "1");
//        int status=q.executeUpdate();
//        System.out.println(status);
          Query query = session.createQuery(hql);
       // query.setParameter(0,"Email");
       //  query.setParameter(1,"studentName");
         // query.setParameter("rollno",1);
         List <StudentEntity>results = query.list();
        // for(StudentEntity s : results)
         //{
        	System.out.println(results);
         //}
        
   //  	StudentEntity student = new StudentEntity();
//    	student.setRollno(2);
//    	student.setStudentName("Samie");
//    	student.setAddress("America,Kansas");
//    	student.setEmail("Samie@gmail.com");
//    	student.setContact("samie@linkedin.com");
//    	session.saveOrUpdate(student);
     //   session.getTransaction().commit();
       // session.close();
       transaction.commit();
    }
}
