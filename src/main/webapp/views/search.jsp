<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../views/jspresource.jsp" %>
<html>
<head>
    <title>Search program</title>
    <link rel="stylesheet" href="../res/css/style.css">
    <style>
        .degree {
            display: flex;
            align-content: center;
            justify-content: center;
            flex-direction: row;

        }

        .degree a {
            padding: 10px 20px;
            background-color: #aaaaaa;
            color: white;
            margin: 20px 10px;
        }

        .degree a:hover {
            background-color: #4c1864;
            color: white;
        }

        .search_box {
            display: flex;
            align-content: center;
            justify-content: center;
            flex-direction: row;
            padding: 40px 25px;
            background-color: #CCCCCC;
        }

        .search_input {
            width: 85%;
            background-color: white;
            height: 50px;
            padding-left: 10px;
        }

        .search_btn {
            width: 10%;
            background-color: #ff8814;
            color: black;
            border-radius: 0px;
            border: none;
            height: 50px;
        }

        .alpha_search {
            display: block;
            position: relative;
            margin: 50px 0px;
            /*border: red 2px solid;*/

        }

        .alpha_search a {
            margin: 20px 0px 20px 0px;
            padding: 10px 15px;
            background-color: #ffffff;
            color: black;
            font-size: 20px;
        }

        .alpha_search a:hover {
            background-color: #4c1864;
            color: white;
        }

        .search_table {
            border-collapse: collapse;
            width: 100%;
        }

        .search_table thead {
            background-color: #fafafa;
            text-transform: uppercase;
            color: #4c1864;
            font-size: 20px;
            /*color: black;*/
        }

        .search_table tbody {
            background-color: white;
            color: black;
        }

        .search_table td {
            padding: 10px;
        }
    </style>
</head>
<body style="background-image: url(../res/img/search_bg.jpg);">

<%@include file="sysmenu.jsp" %>
<div class="main_container" style=" padding: 20px 50px; margin: 50px auto; width: 75%;
background: rgb(242, 242, 242); ">

    <div class="degree">
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
        <table class="search_table" border="1">
            <thead>
            <td>Program Name</td>
            <td>Degree</td>
            <td>Language</td>
            <td>Department</td>
            <td>University</td>
            <td>Detail</td>
            </thead>
            <tbody>
            <c:forEach items="${programs}" var="obj">
                <tr>
                    <td>${obj.majorname}</td>
                    <td>${obj.degreename} </td>
                    <td>${obj.language} </td>
                    <td>${obj.departmentname} </td>
                    <td>${obj.universityname} </td>
                    <td><a href="#">Details</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
