<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Form Đăng Ký</title>
    <style>
        .error { color: red; font-style: italic; }
    </style>
</head>
<body>
<h2>Form Đăng Ký</h2>

<form:form modelAttribute="account" method="post">
    Tên: <form:input path="name"/><br/>
    <form:errors path="name" cssClass="error"/><br/>

    Email: <form:input path="email"/><br/>
    <form:errors path="email" cssClass="error"/><br/>

    Vai trò:
    <form:select path="role">
        <form:option value="" label="-- Chọn vai trò --"/>
        <form:option value="user" label="Người dùng"/>
        <form:option value="admin" label="Quản trị viên"/>
    </form:select><br/>
    <form:errors path="role" cssClass="error"/><br/>

    <div id="department-row">
        Phòng ban (chỉ áp dụng cho Admin): <form:input path="department"/><br/>
        <form:errors path="department" cssClass="error"/><br/>
    </div>

    <input type="submit" value="Đăng ký"/>
</form:form>

<!-- Hiển thị lỗi từ ConstraintViolation -->
<c:if test="${not empty errors}">
    <ul style="color:red; font-weight: bold;">
        <c:forEach items="${errors}" var="err">
            <li>${err.propertyPath} - ${err.message}</li>
        </c:forEach>
    </ul>
</c:if>

<!-- JS: Ẩn hiện trường Phòng ban -->
<script>
    function toggleDepartment() {
        const role = document.querySelector("[name='role']").value;
        const deptRow = document.getElementById("department-row");
        deptRow.style.display = (role === 'admin') ? 'block' : 'none';
    }
    document.addEventListener("DOMContentLoaded", toggleDepartment);
    document.querySelector("[name='role']").addEventListener('change', toggleDepartment);
</script>

</body>
</html>
