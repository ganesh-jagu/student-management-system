package com.ganesh.studentmanagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ganesh.studentmanagement.entity.Student;
import com.ganesh.studentmanagement.util.HibernateUtil;

public class DashboardDao {
	public long getTotalStudents()
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		try {
			String hql="select count(s.sid) from Student s";
			Query query=session.createQuery(hql);
			long totalStudents=(long) query.getSingleResult();
			return totalStudents;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		finally {
			session.close();
		}
	}
	public long getStudentsByCourse(String course)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		try {
			String hql="select count(s.course) from Student s where s.course= :course";
			Query query=session.createQuery(hql);
			query.setParameter("course", course);
			long courseCount=query.getResultCount();
			return courseCount;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			session.close();
		}
	}

}
