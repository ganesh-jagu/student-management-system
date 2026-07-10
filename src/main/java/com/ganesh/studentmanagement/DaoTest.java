package com.ganesh.studentmanagement;

import com.ganesh.studentmanagement.dao.StudentDao;
import com.ganesh.studentmanagement.entity.Student;

public class DaoTest {
	public static void main(String args[])
	{
		Student stu1= new Student();
		stu1.setSname("Test");
		stu1.setEmail("test@mail.com");
		stu1.setMobile("8125204347");
		stu1.setCource("Test Cource");
		
		StudentDao sdt= new StudentDao();
		
		boolean result= sdt.saveStudent(stu1);
		if(result==true)
		{
			System.out.println("Connection success");
		}
		else
		{
			System.out.println("Connection Fail");
		}
	}
	

}
