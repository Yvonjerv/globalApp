<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>开始使用layui</title>
    <link rel="stylesheet" href="../res/layui/css/layui.css">

    <style>
        @import url("https://use.typekit.net/gxw1pct.css");

        body {
            font-family: 'Poppins', Rubik, sans-serif;
        }

        .orange {
            background-color: #ff8814;
        }

        @media screen and (max-width: 768px) {

            .layui-layout-admin .layui-layout-left,
            .layui-layout-admin .layui-body,
            .layui-layout-admin .layui-footer {
                left: 0;
            }

            .layui-layout-admin .layui-side {
                left: -300px;
            }
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg "
     style="background-color: #4c1864; color: white; margin-bottom: 0px; height: 60px; ">
    <!-- 你的HTML代码 -->

    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="layui-nav layui-layout-right" style="background-color: #4c1864;" lay-bar="disabled">
                <li class="layui-nav-item"><a href="../views/dashboard.jsp">Dashboard</a> </li>
                <li class="layui-nav-item"><a href="">My Colleges<span
                        class="layui-badge-dot orange"></span></a> </li>
                <li class="layui-nav-item"><a href="../programs/getprograms">Program Search</a> </li>
                <li class="layui-nav-item"><a href="../personalinfo/getpersonalinfo">Global App</a> </li>
                <li class="layui-nav-item"><a href="messages.jsp">Messages<span class="layui-badge orange">9</span></a>
                </li>
                <li class="layui-nav-item layui-hide layui-show-md-inline-block" lay-unselet="">
                    <a href=""><img src="../res/img/photo.jpg"  tppabs="http://t.n/RCzsdCq"
                        class="layui-nav-img"></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">Profile</a></dd>
                        <dd><a href="javascript:;">Settings</a></dd>
                        <hr>
                        <dd style="text-align: center;"><a href="javascript:;">logout</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
</nav>
<script src="../res/layui/layui.js"></script>
<script>
    layui.use(['element', 'layer', 'util'], function() {
        var element = layui.element,
            layer = layui.layer,
            util = layui.util,
            $ = layui.$;


        util.event('lay-header-event', {

            // menuLeft: function(othis) {
            //     layer.msg('展开左侧菜单的操作', {
            //         icon: 0
            //     });
            // },
            menuRight: function() {
                layer.open({
                    type: 1,
                    title: '更多',
                    content: '<div style="padding: 15px;">处理右侧面板的操作</div>',
                    area: ['260px', '100%'],
                    offset: 'rt',
                    anim: 5,
                    shadeClose: true,
                    scrollbar: false
                });
            }
        });

    });
</script>
</body>
</html>
