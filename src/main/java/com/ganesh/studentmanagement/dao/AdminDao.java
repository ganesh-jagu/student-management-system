package com.ganesh.studentmanagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ganesh.studentmanagement.entity.Admin;
import com.ganesh.studentmanagement.util.HibernateUtil;

public class AdminDao {
	// Admin login
	public Admin AdminLogin(Admin admin)
	{
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			String hql="From Admin a where a.username= :username and a.password= :password";
			Query query=session.createQuery(hql);
			query.setParameter("username", admin.getUsername());
			query.setParameter("password", admin.getPassword());
			Admin result=(Admin) query.getSingleResult();
			return result;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}


	}
	
}