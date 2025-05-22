<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/23/2025
  Time: 12:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng ký</title>
</head>
<body>
<h2>Form Đăng Ký</h2>

<form:form modelAttribute="admin" method="post" action="/register">
    <div>
        Tên: <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </div>

    <div>
        Email: <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </div>

    <div>
        Mật khẩu: <form:password path="password"/>
        <form:errors path="password" cssClass="error"/>
    </div>

    <div>
        <input type="submit" value="Đăng ký"/>
    </div>
</form:form>

<style>
    .error { color: red; font-style: italic; }
</style>
</body>
</html>
