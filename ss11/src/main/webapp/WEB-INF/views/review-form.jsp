<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Đánh giá sản phẩm</title></head>
<body>
<h2>Form Đánh Giá Sản Phẩm</h2>

<form:form method="post" modelAttribute="review">

  Tên: <form:input path="name"/><br/>
  <form:errors path="name" cssClass="error"/><br/>

  Email: <form:input path="email"/><br/>
  <form:errors path="email" cssClass="error"/><br/>

  Đánh giá (1 - 5): <form:input path="rating" type="number"/><br/>
  <form:errors path="rating" cssClass="error"/><br/>

  Bình luận: <form:textarea path="comment" rows="5" cols="40"/><br/>
  <form:errors path="comment" cssClass="error"/><br/>

  <input type="submit" value="Gửi đánh giá"/>
</form:form>

</body>
</html>
