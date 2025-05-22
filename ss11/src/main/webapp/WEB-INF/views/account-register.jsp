<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/23/2025
  Time: 12:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account Registration</title>
</head>
<body>
<h2>Register Account</h2>

<form:form modelAttribute="account" method="post" action="/register">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email" cssClass="error"/></td>
        </tr>
<%--        <tr>--%>
<%--            <td>Phone:</td>--%>
<%--            <td><form:input path="phone"/></td>--%>
<%--&lt;%&ndash;            <td><form:errors path="phone" cssClass="error"/></td>&ndash;%&gt;--%>
<%--        </tr>--%>
        <tr>
            <td>Password:</td>
            <td><form:password path="password"/></td>
            <td><form:errors path="password" cssClass="error"/></td>
        </tr>
<%--        <tr>--%>
<%--            <td>Status:</td>--%>
<%--            <td><form:checkbox path="status"/></td>--%>
<%--            <td><form:errors path="status" cssClass="error"/></td>--%>
<%--        </tr>--%>
        <tr>
            <td colspan="2"><input type="submit" value="Register"/></td>
        </tr>

    </table>
</form:form>
</body>
</html>
