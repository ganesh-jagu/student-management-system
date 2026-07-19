package com.ganesh.studentmanagement.service;

import com.ganesh.studentmanagement.dao.DashboardDao;
import com.ganesh.studentmanagement.entity.Dashboard;

public class DashboardService {
	
	public Dashboard DashboardData()
	{
		Dashboard db=new Dashboard();
		DashboardDao dao=new DashboardDao();
		
		long totalstundents = dao.getTotalStudents();
		long totalCourses=4;
		long javaStudents=dao.getStudentsByCourse("Java");
		long pythonStudents=dao.getStudentsByCourse("Python");
		long reactStudents=dao.getStudentsByCourse("React");
		long testStudents=dao.getStudentsByCourse("Testing");
		
		db.setTotalStudents(totalstundents);
		db.setTotalCourses(totalCourses);
		db.setJavaStudents(javaStudents);
		db.setPythonStudents(pythonStudents);
		db.setReactStudents(reactStudents);
		db.setTestingStudents(testStudents);
		
		return db;
	}	
}
