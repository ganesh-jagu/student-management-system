package com.ganesh.studentmanagement.filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

@WebFilter("/register")
public class StudentFilter extends HttpFilter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("Filter Intialized");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		String sname=request.getParameter("sname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String course=request.getParameter("course");
		
		System.out.println(sname+email+mobile+course);
		
		if(sname==null || sname.trim().isEmpty())
		{
			String nameerror="name is equired";
			request.setAttribute("nameerror",nameerror);
			RequestDispatcher rd=request.getRequestDispatcher("StudentRegister.jsp");
			rd.forward(request, response);
		}
		else if(email==null || email.trim().isEmpty())
		{
				String emailerror="Email is equired";
				request.setAttribute("Emailerror",emailerror);
				RequestDispatcher rd=request.getRequestDispatcher("StudentRegister.jsp");
				rd.forward(request, response);
		}
		else if(mobile==null || mobile.trim().isEmpty())
		{
				String mobileerror="mobile number is equired";
				request.setAttribute("mobileerror",mobileerror);
				RequestDispatcher rd=request.getRequestDispatcher("StudentRegister.jsp");
				rd.forward(request, response);
		}
		else if(course==null || course.trim().isEmpty())
		{
				String courseerror="Course is equired";
				request.setAttribute("courseerror",courseerror);
				RequestDispatcher rd=request.getRequestDispatcher("StudentRegister.jsp");
				rd.forward(request, response);
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
