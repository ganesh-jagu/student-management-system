package com.ganesh.studentmanagement.servlet;

import java.io.IOException;

import com.ganesh.studentmanagement.entity.Admin;
import com.ganesh.studentmanagement.service.AdminService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Admin admin=new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		
		AdminService service=new AdminService();
		Admin result=service.Adminlogin(admin);
		if(result != null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("admin", result);
			response.sendRedirect("dashboard");
		}
		else
		{
			request.setAttribute("invalid", "invalid username or password");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	
	}
}
