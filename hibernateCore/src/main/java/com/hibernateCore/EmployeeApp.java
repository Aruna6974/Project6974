package com.hibernateCore;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import entity.EmployeeFile;

public class EmployeeApp 
{

	public static void main(String[] args) 
	{
         Configuration configuration=new Configuration();
         configuration.configure("hibernate.cfg.xml");
         SessionFactory sessionFactory=configuration.buildSessionFactory();
         Session session=sessionFactory.openSession();
         Transaction transaction=session.beginTransaction();
         
         EmployeeFile employee=new EmployeeFile();
         employee.setEmpId(100);
         employee.setEmpName("Aruna");
         employee.setEmpAddress("Hyderabad");
         employee.setEmpPosition("Manager");
         employee.setEmpSalary(20000);
         
         EmployeeFile employee1=new EmployeeFile();
         employee1.setEmpId(101);
         employee1.setEmpName("Barathi");
         employee1.setEmpAddress("Chennai");
         employee1.setEmpPosition("Accountant");
         employee1.setEmpSalary(25000);
         
         EmployeeFile employee2=new EmployeeFile();
         employee2.setEmpId(102);
         employee2.setEmpName("Archana");
         employee2.setEmpAddress("Chennai");
         employee2.setEmpPosition("Senior Manager");
         employee2.setEmpSalary(30000);
         
         EmployeeFile employee3=new EmployeeFile();
         employee3.setEmpId(103);
         employee3.setEmpName("Nikita");
         employee3.setEmpAddress("Pune");
         employee3.setEmpPosition("Accountant");
         employee3.setEmpSalary(25000);
         
         EmployeeFile employee4=new EmployeeFile();
         employee4.setEmpId(104);
         employee4.setEmpName("Mani");
         employee4.setEmpAddress("Hyderabad");
         employee4.setEmpPosition("Assistant Manager");
         employee4.setEmpSalary(20000);
         
//         session.saveOrUpdate(employee);
//         session.saveOrUpdate(employee1);
//         session.saveOrUpdate(employee2);
//         session.saveOrUpdate(employee3);
//         session.saveOrUpdate(employee4);
         
        Criteria crietria=session.createCriteria(EmployeeFile.class);
//        crietria.setProjection(Projections.avg("empSalary"));
//           crietria.setProjection(Projections.countDistinct("empName"));
//            crietria.setProjection(Projections.max("empSalary"));
        crietria.setProjection(Projections.min("empSalary"));
//        crietria.setProjection(Projections.rowCount());
//        crietria.setProjection(Projections.property("empName"));
//        crietria.addOrder(Order.asc("empPosition"));
//        crietria.add(Restrictions.gt("empSalary",20000));
//        crietria.setFirstResult(2);
//        crietria.setMaxResults(5);
        List list=crietria.list();
        
        for(Object obj : list)
        {
        	 System.out.println(obj);
        }
        
        
       
//         transaction.commit();
         
         
	}

}
