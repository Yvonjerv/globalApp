<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="jspresource.jsp"%>

<html>
<head>
    <title>Programs</title>
</head>

<body>
    <c:forEach items="${programs}" var="obj">
        <p>${obj.progamname}</p>
    </c:forEach>
</body>
</html>