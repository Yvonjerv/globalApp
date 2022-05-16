<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../views/jspresource.jsp" %>
<html>
<head>
    <title>Search program</title>
    <link rel="stylesheet" href="../res/css/style.css">


</head>
<body style="background-image: url(../res/img/search_bg.jpg);background-repeat: no-repeat;">

<%@include file="sysmenu.jsp" %>
<div class="main_container" style=" padding: 20px 50px; margin: 100px auto 50px; width: 75%;
background: rgb(242, 242, 242); ">

    <div class="degree">
        <a href="">ALL</a>
        <a href="">Foundation</a>
        <a href="">Bachelor</a>
        <a href="">Chinese</a>
        <a href="">Masters</a>
        <a href="">Doctor</a>
    </div>
    <h1>Search</h1>
    <div class="search_box">
        <input class="search_input" type="text" placeholder="Keywords" name="searchkey">
        <button name="submit" type="submit" value="Submit" class="search_btn">SEARCH</button>
    </div>
    <div class="alpha_search">
        <b> <a href="#A">A</a>
            <a href="#B">B</a>
            <a href="#C">C</a>
            <a href="#D">D</a>
            <a href="#E">E</a>
            <a href="#F">F</a>
            <a href="#G">G</a>
            <a href="#H">H</a>
            <a href="#I">I</a>
            <a href="#J">J</a>
            <a href="#K">K</a>
            <a href="#L">L</a>
            <a href="#M">M</a>
            <a href="#N">N</a>
            <a href="#O">O</a>
            <a href="#P">P</a>
            <a href="#Q">Q</a>
            <a href="#R">R</a>
            <a href="#S">S</a>
            <a href="#T">T</a>
            <a href="#U">U</a>
            <a href="#V">V</a>
            <a href="#W">W</a>
            <a href="#X">X</a>
            <a href="#Y">Y</a>
            <a href="#Z">Z</a></b>
    </div>

    <div>
        <table class="search_table layui-table" border="1">
            <thead>
            <td>Program Name</td>
            <td>Degree</td>
            <td>Language</td>
            <td>Department</td>
            <td>University</td>
            <td>Details</td>
            </thead>
            <tbody>
            <c:forEach items="${programs}" var="obj">
                <tr>
                    <td>${obj.majorname}</td>
                    <td>${obj.degreename} </td>
                    <td>${obj.language} </td>
                    <td>${obj.departmentname} </td>
                    <td>${obj.universityname} </td>
                    <td><a href="#" style="color: #ff8814">Details</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
