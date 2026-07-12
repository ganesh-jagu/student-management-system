package com.ganesh.studentmanagement.service;
import com.ganesh.studentmanagement.entity.Student;

import java.util.List;

import com.ganesh.studentmanagement.dao.StudentDao;

public class StudentService {
	
	StudentDao sd=new StudentDao();
	public List<Student> searchStudent(String keyword)
	{
		System.out.println(keyword);
		return sd.searchStudent(keyword);
	}

}
