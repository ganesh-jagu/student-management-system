package com.ganesh.studentmanagement.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil{
	
	private static SessionFactory sf = null;

	static {
		Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    sf= cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
	
	return sf;
	}
	
	public static void shutdown()
	{
		if(sf != null)
		{
			sf.close();
		}
		
	}
}
