<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../jspresource.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div style="width:85%;height:30px;margin:10px auto">
    <form action="../university/getuniversities">
        Position：<input class="" type="text" name="position"></input>
        &nbsp; Hotel Name：<input class="" type="text" name="universityname"></input>
        <button class="" type="submit">Query</button>
    </form>
</div>
<!-- Begin to an university information -->
<c:forEach items="${unilist}" var="obj">
<p>${obj.univerisityKey}</p>
<p>${obj.universitydesc}</p>
<p>${obj.universityname}</p>
</c:forEach>
</body>
</html>
