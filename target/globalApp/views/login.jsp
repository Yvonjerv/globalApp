<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="jspresource.jsp"%>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- CSS -->
<%--    <link rel="stylesheet" href="../res/css/style.css" >--%>
    <link rel="stylesheet" href="../res/css/style.css" type="text/css">
    <title>Login</title>
    <style>
        input,
        textarea {
            width: 380px;}
    </style>
</head>

<body>
    <section class="login">
        <div class="login_left"> <div class="logo_container"><img src="../img/bg1.jpg" alt=""></div> </div>
        <div class="login_right">
            <div class="inner_div">
            <h2 class="title_head">Login to your <span>Account</span></h2>
            <p class="register_txt">Don't have an account? <a href="register.jsp">Create one here</a></p>

            <form action="../user/login">
                <div class="group">
                    <input type="text" required="required" name="username"/><span class="highlight"></span><span class="bar"></span>
                    <label>Username</label>
                  </div>

                  <div class="group ">
                    <input type="password" required="required" name="password"/><span class="highlight"></span><span class="bar"></span>
                    <label>Password</label>
                  </div>

                <div class="bottom_div">                  
                    <a href="forget-password.html" class="fgt_pwd">Forgot Password?</a>
                </div>
                <div class="submit_div">
                    <button name="submit" type="submit" value="Submit" class="btn button-md">Login</button>
                </div>
            </form>
            </div>

        </div>

    </section>
</body>
</html>