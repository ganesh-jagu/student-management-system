package com.ganesh.studentmanagement.service;
import com.ganesh.studentmanagement.entity.Student;

import java.util.List;

import com.ganesh.studentmanagement.dao.StudentDao;

public class StudentService {
	
	// Search student
	public List<Student> searchStudent(String keyword)
	{
		System.out.println(keyword);
		StudentDao sd=new StudentDao();
		return sd.searchStudent(keyword);
	}
	
	// Save Student by unique email
	public boolean saveStudent(Student student)
	{
		StudentDao sd=new StudentDao();
		Student status=sd.getStudentByEmail(student.getEmail());
		
		if(status == null)
		{
			boolean result=sd.saveStudent(student);
			return result;
		}
		else
		{
			return false;
		}
	}
}
