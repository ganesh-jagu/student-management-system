package com.ganesh.studentmanagement.servlet;

import java.io.IOException;
import java.util.List;

import com.ganesh.studentmanagement.dao.StudentDao;
import com.ganesh.studentmanagement.entity.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/showAllStudents")
public class ViewStudents extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		StudentDao sd= new StudentDao();
		List<Student>list=sd.getAllStudents();
		request.setAttribute("studentlist", list);
		RequestDispatcher rd=request.getRequestDispatcher("showstudents.jsp");
		rd.forward(request, response);
		
	}

}
