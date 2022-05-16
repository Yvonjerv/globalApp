<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../views/jspresource.jsp" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../res/css/style.css">
    <!-- Font Awesome JS -->
    <script src="https://kit.fontawesome.com/de3aa4aaa4.js" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.15.4/js/solid.js"
            integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ"
            crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.15.4/js/fontawesome.js"
            integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY"
            crossorigin="anonymous"></script>

    <style>
        .apply {
            display: flex;
            justify-content: space-between;
            align-items: flex-start;
            padding: 20px 40px;
            height: 130px;
            background: #ffffff;
            background-image: url("../res/img/ytbu_logo.jpg");
            background-repeat: no-repeat;
            border-bottom: #c6c6c6 10px solid;
        }

        .apply_left {
            display: flex;
            justify-content: space-between;
            align-items: flex-start;
            flex-direction: column;
        }

        .apply_left h2 {
            color: #4c1864;
            font-size: 30px;
            font-weight: 700;
            margin-bottom: 20px;
        }

        .apply_left h3 {
            margin-bottom: 20px;
        }
        .apply_left h3 > i {
            background-color: darkred;
            color: white;
            padding: 3px 10px 2px;
        }

        .apply_left .fa {
            color: #ff8814;
        }

        .apply_right a {
            margin-left: 20px;
            font-size: 20px;
        }

        .apply_right {
            display: flex;
            align-items: flex-start;
            flex-direction: row;
            width: 200px;
        }
    </style>
</head>

<body style="background-image: url(../res/img/university.jpg);background-repeat: no-repeat;">
<%@include file="sysmenu.jsp" %>

<div class="main_container" style=" padding: 20px 50px; margin: 100px auto 50px; width: 65%;
background: rgb(242, 242, 242); ">
    <h1 style="margin: 20px 0px;">Dashboard</h1>
    <hr>
    <div class="full_contain apply">
        <div class="apply_left">
            <h2>Yunnan Technology and Business University</h2>
            <h3>Msc. Computer science</h3>
            <h3>February-2022 - <i> Deadline </i></h3>
            <a href=""> <i class="fa fa-pen"></i>&nbsp;&nbsp;Check my application</a>
        </div>

        <div class="apply_right">
            <img style="opacity: 50%;  margin-right:30px;" height="120px" src="../res/img/ytbu_logo.jpg"> <a href=""> <i
                class="fa fa-info-circle"></i></a>
            <a href=""><i class="fa fa-times"></i> </a>
        </div>
    </div>

    <div class="full_contain apply">
        <div class="apply_left">
            <h2>Yunnan University</h2>
            <h3>Msc. Computer Application</h3>
            <h3>June-2022 - <i> Waiting for Academic Review </i></h3>
            <a href=""> <i class="fa fa-pen"></i>&nbsp;&nbsp;Check my application</a>
        </div>

        <div class="apply_right">
            <img style="opacity: 50%;  margin-right:30px;" height="120px" src="../res/img/yunnanlogo.jpg">
            <a href=""> <i class="fa fa-info-circle"></i></a>
            <a href=""><i class="fa fa-times"></i> </a>
        </div>
    </div>

    <div class="full_contain apply">
        <div class="apply_left">
            <h2>Northwestern Polytechnical University</h2>
            <h3>Msc. Computer science</h3>
            <h3>February-2022 - <i> Fill in </i></h3>
            <a href=""> <i class="fa fa-pen"></i>&nbsp;&nbsp;Check my application</a>
        </div>

        <div class="apply_right">
            <img style="opacity: 50%;  margin-right:30px;" height="120px" src="../res/img/nwpu.jpg">
            <a href=""> <i class="fa fa-info-circle"></i></a>
            <a href=""><i class="fa fa-times"></i> </a>
        </div>
    </div>
</div>
</body>
</html>
