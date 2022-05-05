<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>GlobalApp</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="../res/css/profile.css">

    <!-- Font Awesome JS -->
    <script src="https://kit.fontawesome.com/de3aa4aaa4.js" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

</head>

<body>
<nav class="navbar navbar-expand-lg " style="background-color: #4c1864; color: white; margin-bottom: 0px; height: 50px">
    <div class="container-fluid">

        <button type="button" id="sidebarCollapse" style="background-color: #4c1864; border: none; border-radius: 0;" class="btn btn-info">
            <i class="fas fa-align-left"></i>
            <!--                        <span>Toggle Sidebar</span>-->
        </button>
        <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <i class="fas fa-align-justify"></i>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="nav navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Dashboard</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">My Colleges</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Global App</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">College Search</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sign Out</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
</body>

</html>