package com.ganesh.studentmanagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ganesh.studentmanagement.util.HibernateUtil;

public class ConnectionTest {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
		Session session=sessionfactory.openSession();
		
		if(session.isOpen())
		{
			System.out.println("Connection Successfull...");
		}
		else
		{
			System.out.println("not connected");
		}
		
		session.close();
		HibernateUtil.shutdown();
	}

}
