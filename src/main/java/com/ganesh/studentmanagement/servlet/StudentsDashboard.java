package com.ganesh.studentmanagement.servlet;

import java.io.IOException;

import com.ganesh.studentmanagement.entity.Dashboard;
import com.ganesh.studentmanagement.service.DashboardService;
import com.ganesh.studentmanagement.service.StudentService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class StudentsDashboard extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		DashboardService ds=new DashboardService();
		
		Dashboard dasboard=ds.DashboardData();
		
		request.setAttribute("dashboard", dasboard);
		RequestDispatcher rd=request.getRequestDispatcher("Dashboard.jsp");
		rd.forward(request, response);
		
	}
	

}
