<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentManagement</title>
</head>
<body>
<h2> Student Details</h2>
<c:set value="${studentdetails}" var="stu"/>
<form action="EditStudent" method="post">
Student ID: ${stu.sid} <input type="hidden" name="sid" value="${stu.sid}"/><br>
Student Name: <input type="text" name="sname" value="${stu.sname}"/><br>
Student Email: <input type="text" name="email" value="${stu.email}"/><br>
Student Mobile: <input type="text" name="mobile" value="${stu.mobile}"/> <br>
Course : <input type="text" name="course" value="${stu.course}"/><br>
<input type="submit">  
</form>
</body>
</html>