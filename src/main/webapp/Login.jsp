<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
</head>
<body>
<h1> Login Here</h1>
<form action="login" method="post">
User Name: <input type="text" name="username"/>
Password: <input type="text" name="password"/>
<input type="submit"/>
</form>
${invalid}
</body>
</html>