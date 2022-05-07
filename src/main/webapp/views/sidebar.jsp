<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <script defer src="https://use.fontawesome.com/releases/v5.15.4/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.15.4/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

</head>
<body>

<div class="wrapper" style="height: 100%;  position: sticky; top: 0;">
    <!-- Sidebar  -->
    <nav id="sidebar">
        <div class="sidebar-header">
            <h3>Profile</h3>
            <strong>G.A</strong>
        </div>

        <ul class="list-unstyled components">

            <li>
                <a href="#">
                    <i class="fa fa-user"></i>&nbsp;&nbsp;&nbsp;
                    Personal Info
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="fa fa-graduation-cap"></i>&nbsp;&nbsp;&nbsp;
                    Academics
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="fa fa-briefcase"></i>&nbsp;&nbsp;&nbsp;
                    Work Experience
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="fa fa-address-book"></i>&nbsp;&nbsp;&nbsp;
                    Contact Info
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="fa fa-user-friends"></i>&nbsp;&nbsp;&nbsp;
                    Recommenders
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="fa fa-circle-notch"></i>&nbsp;&nbsp;&nbsp;
                    Others
                </a>
            </li>
        </ul>

    </nav>


</div>

<!-- jQuery CDN - Slim version (=without AJAX) -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<!-- Popper.JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<!-- Bootstrap JS -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

<script type="text/javascript">
    $(document).ready(function () {
        $('#sidebarCollapse').on('click', function () {
            $('#sidebar').toggleClass('active');
        });
    });
</script>

</body>
</html>
