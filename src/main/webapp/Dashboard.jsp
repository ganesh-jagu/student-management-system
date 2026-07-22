<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	response.setHeader("cache-control","no-cache, no-store, must-revalidate");//Http:1.1 (Presently we are using this)
	response.setHeader("pragma","no-cache");// Http: 1.0
	response.setHeader("Expires","0"); // Proxies 

	if(session.getAttribute("admin")==null)
	{
		response.sendRedirect("Login.jsp");
	}
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
</head>
<body>
<h1 align="center"> Admin Dashboard   <a href="logout" align="right"><button align="center">Logout</button> </a> </h1>

${logouterror}
Total Students: ${dashboard.totalStudents} <br>
Total Courses: ${dashboard.totalCourses } <br>
----------------------------------------------------<br>
Java course: ${dashboard.javaStudents}<br>
Python Course: ${dashboard.pythonStudents}<br>
React Course: ${dashboard.reactStudents}<br>
Testing: ${dashboard.testingStudents}<br>

<a href="StudentRegister.jsp"> <button> Add </button></a>  
<a href="showAllStudents"> <button> View All Stundents </button> </a>	

<script>
window.addEventListener("pageshow", function (event) {
    if (event.persisted) {
        window.location.reload();
    }
});
</script>
</body>
</html>