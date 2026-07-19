package com.ganesh.studentmanagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ganesh.studentmanagement.entity.Student;
import com.ganesh.studentmanagement.util.HibernateUtil;

public class StudentDao {
	// check the email is exist or not
	public Student getStudentByEmail(String email)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		try {
			String hql="from Student s where s.email= :email";
			Query query=session.createQuery(hql);
			query.setParameter("email", email);
			Student result=(Student) query.getSingleResult();
	
		return result;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			session.close();
		}
		
	}
	// save student
	public boolean saveStudent(Student student)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		try {			
		session.persist(student);		
		tr.commit();
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		finally {
			session.close();
		}
		
	}
	// All students display
	public List getAllStudents()
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		String hql="from Student";
		Query query= session.createQuery(hql); 
		List<Student> list=query.list();
		
		return list;
	}
	// Single student get
	public Student getStudentById(int sid)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		try {
		Student stu=session.get(Student.class, sid);
		return stu;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
	}
	// Update Student
	public Student updateStudent(Student student)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		try {
			Student result=session.merge(student);
			tr.commit();
			return result;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			tr.rollback();
			return null;
		}
		finally
		{
			session.close();
		}
			
	}
	
	// Delete Student
	public boolean deleteStudent(Student stu)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		try {
					session.remove(stu);
					tr.commit();
					return true;
				}
			catch(Exception e)
			{
				e.printStackTrace();
				tr.rollback();
				return false;
			}
			finally
			{
				session.close();
			}
		}
		
	// Search students
	public List<Student> searchStudent(String keyword)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		try {
		String hql="from Student s where s.sname LIKE :keyword or s.email LIKE :keyword or s.mobile LIKE :keyword or s.course LIKE :keyword";
		Query query=session.createQuery(hql);
		query.setParameter("keyword","%"+keyword+"%");
		List<Student> searchStudent=query.list();
		return searchStudent;
		}	
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
		
	}
		
	}
	
