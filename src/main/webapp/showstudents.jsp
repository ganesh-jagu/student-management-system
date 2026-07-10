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
</tr>
</c:forEach>
</table>
</body>
</html>
