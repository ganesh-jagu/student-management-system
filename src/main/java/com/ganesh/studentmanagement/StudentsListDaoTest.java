package com.ganesh.studentmanagement;

import java.util.List;

import com.ganesh.studentmanagement.dao.StudentDao;
import com.ganesh.studentmanagement.entity.Student;

public class StudentsListDaoTest {
	public static void main(String args[])
	{
		StudentDao sd=new StudentDao();
		System.out.println("List of Student are ");
		List<Student>list=sd.getAllStudents();
		for(Student li:list)
		{	
			System.out.println("ID:"+li.getSid());
			System.out.println("Name:"+li.getSname());
			System.out.println("Email:"+li.getEmail());
			System.out.println("Mobile:"+li.getMobile());
			System.out.println("Course:"+li.getCourse());
		
		}
	}

}
