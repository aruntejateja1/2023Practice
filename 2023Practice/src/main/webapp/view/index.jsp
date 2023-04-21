<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>Login Page</h3>
<h4 style="color:red"> ${error}</h4>

<h1>2023PracticeSpringBoot</h1>

<%-- <form action="loginUser" method="post">
Name:<input type="text" name="uName"><br>
Password:<input type="password" name="uPassword"><br>
<input type="submit" value="login">
</form> --%>

<form:form modelAttribute="user" action="loginUser" method="post" >
Name: <form:input path="name" /><br>
Password:<form:password path="password"/><br>
<input type="submit" value="login">
</form:form>

<%-- 
<form:form action="loginUser" method="post" modelAttribute="user">
 Name: <form:input path="name"/><br>
 Password: <form:password path="password"/><br>
 <input type="submit" value="login">

</form:form> --%>
</center>
</html>