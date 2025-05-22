<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/23/2025
  Time: 12:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>User Form</title></head>
<body>
<h2>Enter User Info</h2>
<form:form method="POST" modelAttribute="user" action="/submit">
    Name: <form:input path="name"/> <form:errors path="name"/><br/>
    Email: <form:input path="email"/> <form:errors path="email"/><br/>
    Phone: <form:input path="phone"/> <form:errors path="phone"/><br/>
    Password: <form:password path="password"/> <form:errors path="password"/><br/>
    Status: <form:checkbox path="status"/><br/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
