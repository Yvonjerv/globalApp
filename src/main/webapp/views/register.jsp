<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../views/jspresource.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- CSS -->
    <link href="../res/css/style.css" rel="stylesheet">


    <title>Register</title>
</head>

<body>
    <section class="login">
        <div class="login_left"> <div class="logo_container"><img src="../img/bg1.jpg" alt=""></div> </div>
        <div class="login_right">
            <div class="inner_div">
                <h2 class="title_head">Manager Sign Up <span>Now</span></h2>
                <p class="register_txt">Login Your Account <a href="login.jsp">Click here</a></p>
            <form action="../manager/register">
                <div class="group">
                    <input type="text" required="required" name="username" /><span class="highlight"></span><span class="bar"></span>
                    <label>Username</label>
                  </div>

                  <div class="group">
                    <input type="password" required="required" name="password" /><span class="highlight"></span><span class="bar"></span>
                    <label>Password</label>
                  </div>

                  <div class="group">
                    <input type="password" required="required" name="confirmPassword"/><span class="highlight"></span><span class="bar"></span>
                    <label>Confirm Password</label>
                  </div>
                <div class="bottom_div">                  
                    <a href="forget-password.html" class="fgt_pwd">Forgot Password?</a>
                </div>
                <div class="submit_div">
                    <button name="submit" type="submit" value="REGISTER" class="btn button-md">Sign up</button>
                </div>
            </form>
            </div>
        </div>
        </div>

    </section>
</body>
</html>