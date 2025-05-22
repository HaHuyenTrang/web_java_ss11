<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h2>Register Account</h2>

<form:form modelAttribute="account" method="post">
    <table>
        <tr>
            <td>Username:</td>
            <td><form:input path="username"/></td>
            <td><form:errors path="username" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><form:password path="password"/></td>
            <td><form:errors path="password" cssClass="error"/></td>
        </tr>
    </table>
    <input type="submit" value="Register"/>
</form:form>

</body>
</html>
