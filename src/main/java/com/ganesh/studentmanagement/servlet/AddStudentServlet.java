package com.ganesh.studentmanagement.servlet;

import java.io.IOException;

import com.ganesh.studentmanagement.dao.StudentDao;
import com.ganesh.studentmanagement.entity.Student;
import com.ganesh.studentmanagement.service.StudentService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class AddStudentServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String sname=request.getParameter("sname");
		String email=request.getParameter("email");
		String course=request.getParameter("course");
		String mobile=request.getParameter("mobile");
		
		System.out.println(sname);
		System.out.println(email);
		System.out.println(course);
		System.out.println(mobile);
		
		Student student = new Student();
		student.setSname(sname);
		student.setEmail(email);
		student.setCourse(course);
		student.setMobile(mobile);
		
		StudentService service=new StudentService();
		boolean result=service.saveStudent(student);
//		StudentDao dao=new StudentDao();
//		boolean result=dao.saveStudent(student);
		
		if(result)
		{
			System.out.println("Success");
			request.setAttribute("student", student);
			RequestDispatcher rd=request.getRequestDispatcher("SuccessPage.jsp");	
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("emailexist","Email Allredy Exist try with differnt email");
			RequestDispatcher rd=request.getRequestDispatcher("StudentRegister.jsp");	
			rd.forward(request, response);
			System.out.println("email allredy exist");
		}
		
	}
}

