<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
</head>
<body>
<h2> Registration form</h2>
<form action="register" method="post">
Name: <input type="text" name="sname"/>
<c:if test="${not empty nameerror}">
${nameerror}
</c:if><br>
Email: <input type="text" name="email"/>
<c:if test="${not empty Emailerror}">
${Emailerror}
</c:if><br>
Mobile: <input type="text" name="mobile"/> 
<c:if test="${not empty mobileerror}">
${mobileerror}
</c:if><br>
Course: <select name="course">
    <option value="">-- Select Course --</option>
    <option value="Java">Java</option>
    <option value="Python">Python</option>
    <option value="React">React</option>
    <option value="Testing">Testing</option>
</select> 

<br><input type="submit"/>
</form>

${emailexist}
</body>
</html>