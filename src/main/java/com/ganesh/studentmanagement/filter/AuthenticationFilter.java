package com.ganesh.studentmanagement.filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter({"/register", "/deleteStudent", "/EditStudent", "/searchStudent", "/dashboard", "/showAllStudents"})
public class AuthenticationFilter extends HttpFilter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("Filter Intialized");
	}
	
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		HttpSession session=request.getSession(false);
		if(session == null || session.getAttribute("admin") == null)
		{
			response.sendRedirect("Login.jsp");
		}
		else
		{
			 chain.doFilter(request, response);
		}
		
	}
	
	@Override
	public void destroy()
	{
		System.out.println("FIlter Destroyed");
	}

}
