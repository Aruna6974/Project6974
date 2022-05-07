package com.hibernateCore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Customer;

public class CustomerApp 
{

	public static void main(String[] args)
	{
           Configuration configuration=new Configuration();
           configuration.configure();
           SessionFactory sessionFactory=configuration.buildSessionFactory();
           Session session=sessionFactory.openSession();
           Transaction transaction=session.beginTransaction();
           Customer customer=new Customer();
//           customer.setCustomerId(1);
//           customer.setCustomerName("Aruna");
//           customer.setCustomerAddress("Hyderabad");
//           Customer customer1=new Customer();
//           customer1.setCustomerId(2);
//           customer1.setCustomerName("Mani");
//           customer1.setCustomerAddress("Mall");
           
//           session.saveOrUpdate(customer);
//           session.saveOrUpdate(customer1);
           
           Customer customerget=(Customer)session.get(Customer.class,1);
           System.out.println(customerget);
           Customer customerload=(Customer)session.load(Customer.class,2);
           System.out.println(customerload);
           transaction.commit();
           
	}

}
