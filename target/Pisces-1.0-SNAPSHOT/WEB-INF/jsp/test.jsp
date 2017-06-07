<%--
  Created by IntelliJ IDEA.
  User: yuh
  Date: 17/06/07
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach items="${test}" var="it">
        <li>${it}</li>
    </c:forEach>
</ul>
</body>
</html>
