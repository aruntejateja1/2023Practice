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

<h3 style="color:red" >${error}</h3>
<h1>Register Page</h1>

<form:form action="Register2" method="post" modelAttribute="employee">
EmployeeID: <form:input path="id"/> <form:errors path="id" style="color:red"></form:errors><br>
EmployeeName:<form:input path="name"/><form:errors path="name" style="color:red"></form:errors><br>
EmployeeSalary:<form:input path="salary" max="25000"/><form:errors path="salary" style="color:red"></form:errors><br>
<input type="submit" value="register">

</form:form>
</body>
</html>