<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Form Số Điện Thoại</title></head>
<body>
<h2>Form Nhập Số Điện Thoại</h2>

<form:form modelAttribute="phone" method="post">
    Tên: <form:input path="name"/><br/>
    <form:errors path="name" cssClass="error"/><br/>

    Số điện thoại: <form:input path="phoneNumber"/><br/>
    <form:errors path="phoneNumber" cssClass="error"/><br/>

    <input type="submit" value="Gửi"/>
</form:form>

</body>
</html>
