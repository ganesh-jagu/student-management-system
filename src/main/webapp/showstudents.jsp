<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
</head>
<body>
<h3 align="center">List of students</h3>
<form action="searchStudent" method="get">
 <h4 align="center"> Search: <input type="text" name="keyword" placeholder="serch by name, id, email, student, course"/> <input type="submit" value="Search"/> </h4>

<c:if test="${empty studentlist}">
<h4 align="center"> No Results Found  <br> <br>
<a href="showAllStudents" align="center"><button align="center">View all Students</button></a>
</h4>
</c:if>
<c:if test="${not empty studentlist}">
</form>
<table border="1" align="center" >
<tr> 
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Course</th>
<th>Actions</th>
 </tr>
 
<c:forEach items="${studentlist}" var="stu">
<tr>
<td>${stu.sid}</td>
<td>${stu.sname}</td>
<td>${stu.email}</td>
<td>${stu.mobile}</td>
<td>${stu.course}</td>
<td> <a href="EditStudent?sid=${stu.sid}">Edit</a>
<td> <a href="deleteStudent?sid=${stu.sid}" onclick="return confirm('are you sure to delete the student?')">Delete</a>
</tr>
</c:forEach>
</c:if>
</table>
</body>
</html>
