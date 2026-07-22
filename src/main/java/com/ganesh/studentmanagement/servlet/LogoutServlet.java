package com.ganesh.studentmanagement.servlet;

import java.io.IOException;

import com.ganesh.studentmanagement.entity.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		HttpSession session=request.getSession();
		session.removeAttribute("admin");
		if(session.getAttribute("admin")==null)
		{
			System.out.println("Session Removed");
			response.sendRedirect("Login.jsp");
		}
		else
		{
			System.out.println("Logou failed");
			request.setAttribute("logouterror", "Logout is failed please try after some time");
			RequestDispatcher rd=request.getRequestDispatcher("dashboard");
			rd.forward(request, response);
		}
		
		
	}
}
