<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.*, service.*, impl.*, controller.*"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <link href="../res/css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../res/layui/css/layui.css">
    <script src="../res/layui/layui.js"></script>
    <title>GlobalApp</title>
    <!-- Font Awesome JS -->
    <script src="https://kit.fontawesome.com/de3aa4aaa4.js" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.15.4/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.15.4/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

    <script>

        layui.use(['element', 'layer', 'util'], function() {
            var element = layui.element,
                layer = layui.layer,
                util = layui.util,
                $ = layui.$;
        });
    </script>
</head>