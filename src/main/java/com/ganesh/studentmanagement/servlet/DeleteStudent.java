package com.ganesh.studentmanagement.servlet;

import java.io.IOException;

import com.ganesh.studentmanagement.dao.StudentDao;
import com.ganesh.studentmanagement.entity.Student;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteStudent")
public class DeleteStudent extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int sid= Integer.parseInt(request.getParameter("sid"));
		System.out.println(sid);
		StudentDao sd=new StudentDao();
		Student stu=sd.getStudentById(sid);
		
		if(stu != null)
		{
			System.out.println("ID:"+stu.getSid()+"Name"+stu.getSname()+"Email"+stu.getEmail()+"Mobile"+stu.getMobile()+"Cource"+stu.getCourse());

		boolean result=sd.deleteStudent(stu);
		if (result==true)
		{
			response.sendRedirect("showAllStudents");			
		}
		else
		{
			System.out.println("Deletion failed");
		}
		}
	}
	
}
