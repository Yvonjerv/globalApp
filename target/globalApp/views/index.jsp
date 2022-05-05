<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="jspresource.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${programs}" var="obj">
    <p>${obj.progamname}</p>
</c:forEach>
</body>
</html>
