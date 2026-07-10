package com.ganesh.studentmanagement.servlet;

import java.io.IOException;

import com.ganesh.studentmanagement.dao.StudentDao;
import com.ganesh.studentmanagement.entity.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EditStudent")
public class EditStudentServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int sid=Integer.parseInt(request.getParameter("sid"));
		
		StudentDao sd=new StudentDao();
		Student stu=sd.getStudentById(sid);
		
		request.setAttribute("studentdetails", stu);
		RequestDispatcher rd=request.getRequestDispatcher("EditStudent.jsp");
		rd.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int sid=Integer.parseInt(request.getParameter("sid"));
		String sname=request.getParameter("sname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String course=request.getParameter("course");
		
		Student student=new Student();
		student.setSid(sid);
		student.setSname(sname);
		student.setEmail(email);
		student.setMobile(mobile);
		student.setCourse(course);
		
		StudentDao sd=new StudentDao();
		Student stu=sd.updateStudent(student);
		
		if(stu != null)
		{
			System.out.println(stu.getSid()+stu.getSname()+stu.getEmail()+stu.getMobile()+stu.getCourse());
			
			response.sendRedirect("showAllStudents");
		}
		else
		{
			System.out.println("Student Not Updated");
		}
		
	}

}
