package com.ganesh.studentmanagement.servlet;

import java.io.IOException;
import java.util.List;

import com.ganesh.studentmanagement.entity.Student;
import com.ganesh.studentmanagement.service.StudentService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/searchStudent")
public class SearchStudent extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String keyword=request.getParameter("keyword");
		System.out.println("Seacrched Keyword is"+keyword);
		
		StudentService service=new StudentService();
		List<Student> searchSetudents=service.searchStudent(keyword);
		if(searchSetudents != null)
		{
			System.out.println("search success");
			request.setAttribute("studentlist", searchSetudents);
			RequestDispatcher rd=request.getRequestDispatcher("showstudents.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("no results found");
		}
	}

}
