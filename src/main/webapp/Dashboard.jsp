<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
</head>
<body>
<h1> Student Dashboard</h1>
Total Students: ${dashboard.totalStudents} <br>
Total Courses: ${dashboard.totalCourses } <br>
----------------------------------------------------<br>
Java course: ${dashboard.javaStudents}<br>
Python Course: ${dashboard.pythonStudents}<br>
React Course: ${dashboard.reactStudents}<br>
Testing: ${dashboard.testingStudents}<br>

<a href="StudentRegister.jsp"> <button> Add </button></a>  
<a href="showAllStudents"> <button> View All Stundets </button> </a>	
</body>
</html>