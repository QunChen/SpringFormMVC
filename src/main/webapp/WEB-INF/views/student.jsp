<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
</head>
<body>
<form:form method="POST" role="form" action="/app/addStudent">
	 <div class="form-group">
    <form:label  path="name">Name</form:label>
    <form:input type="text" class="form-control"  placeholder="Enter name"  path="name" />
  </div>
  <div class="form-group">
    <form:label  path="email">Email address</form:label>
    <form:input type="email" class="form-control" placeholder="Enter email" path="email"/>
  </div>
  <div class="form-group">
    <form:label  path="password">Password</form:label>
    <form:input type="password" class="form-control" placeholder="Password"  path="password"/>
  </div>
  <div class="checkbox">
  <form:label path="isPR" for="checkbox1" >Check me if you are PR</form:label>
  <form:checkbox path="isPR" />
  </div>
  <input type="submit" class="btn btn-default" />Submit
</form:form>
</body>
</html>