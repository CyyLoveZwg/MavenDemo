<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 2015/9/17
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>list user</title>
</head>
<body>
    <c:forEach items="${user}" var="item">
        ${item.id}--${item.name}
        <br>
    </c:forEach>
</body>
</html>
