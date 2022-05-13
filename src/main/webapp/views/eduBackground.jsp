<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        input,
        textarea {
            width: 200px;}
        .tab_relative {
            width: 100%;
            border-collapse: collapse;
        }

        .tab_relative h4 {
            padding: 10px;
            font-size: 15px;
        }

        .btn_delete {
            background-color: #6b6b6b;
            color: white;
            padding:8px 20px;
            margin: 20px;
        }

        .btn_edit {
            background-color: #4c1864;
            color: white;
            padding: 8px 20px;
            margin: 20px;
        }

        .full_contain h4{
            font-size: 15px;
        }
        /*set a style for the buttons*/
        .save_btn {
            background-color: #4c1864;
            color: white;
            padding: 14px 20px;
            margin: 18px 0px 8px 0px;
            border: none;
            cursor: pointer;
            width: 100%;
        }

        /* set a hover effect for the button*/
        .save_btn:hover {
            opacity: 0.8;
        }

        /*centre the display image inside the container*/
        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
            position: relative;
        }

        /*set padding to the container*/
        .container {
            padding: 16px;
            display: flex;
            justify-content: center;
            align-content: center;
            flex-direction: column;

        }

        /*set the Modal background*/
        .modal {
            display: none;
            position: fixed;
            z-index: 1;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            overflow: auto;
            background-color: rgb(0, 0, 0);
            background-color: rgba(0, 0, 0, 0.4);
            padding-top: 180px;
            padding-right: 500px;
            padding-left: 500px;
        }

        /*style the model content box*/
        .modal-content {
            background-color: #fefefe;
            margin: 5% 100px 15% auto;
            border: 1px solid #888;
            width: 50%;

        }

        /*style the close button*/
        .close {
            position: absolute;
            right: 25px;
            top: 0;
            color: #000;
            font-size: 35px;
            font-weight: bold;
        }

        .close:hover,
        .close:focus {
            color: #4c1864;
            cursor: pointer;
        }

        /* add zoom animation*/
        .animate {
            -webkit-animation: animatezoom 0.6s;
            animation: animatezoom 0.6s
        }

        @-webkit-keyframes animatezoom {
            from {
                -webkit-transform: scale(0)
            }
            to {
                -webkit-transform: scale(1)
            }
        }

        @keyframes animatezoom {
            from {
                transform: scale(0)
            }
            to {
                transform: scale(1)
            }
        }

        @media screen and (max-width: 300px) {
            span.psw {
                display: block;
                float: none;
            }

        }
    </style>
    <link rel="stylesheet" href="../res/css/style.css">
</head>
<body>
<%@include file="sysmenu.jsp" %>
<div class="main_container" style="display: flex; align-content: flex-start; justify-content: flex-start">
    <%@include file="sidebar.jsp" %>
    <div style="width: 80%; margin: 50px; width: 65% "><h1
            style="font-size: 20px; color: #4c1864; text-transform: capitalize; margin-bottom: 10px">Education background </h1>


        <!-- Education  -->
        <div class="full_contain">
            <h1 class="liner"> Academics</h1>
<i><p>Start from high school till now, include the study experience in China</p></i>
            <hr/>
            <table class="tab_relative layui-table" border="1">
                <b>
                    <tr>
                        <td><h4> FROM </h4></td>
                        <td><h4>TO  </h4></td>
                        <td><h4>INSTITUTION</h4></td>
                        <td><h4>FIELD </h4></td>
                        <td><h4>DEGREE</h4></td>
                        <td> <button onclick="document.getElementById('id01').style.display='block'"
                                     style=" border: none; background-color: #ff8814; color: white; padding: 5px 20px;margin-left: 20px; width: 100px;">Add
                        </button>
                        </td>
                    </tr>
                </b>
                <tr>
                    <td><h4>2018-07-13</h4></td>
                    <td><h4>2022-11-05 </h4></td>
                    <td><h4>YTBU</h4></td>
                    <td><h4>CST</h4></td>
                    <td><h4>BACHELOR</h4></td>
                    <td><a href="link" class="btn_edit"> Edit </a>
                        <a href="link" class="btn_delete"> Delete </a>
                    </td>
                </tr>
            </table>
        </div>
        <div id="id01" class="modal">

            <form class="modal-content animate" action="/action_page.php">
                <div class="imgcontainer">
            <span onclick="document.getElementById('id01').style.display='none'" class="close"
                  title="Close Modal">×</span>
                </div>

                <div class="container">
                    <h2>Add new Study</h2>
                    <table style="width: 100%">
                        <tr>
                            <td><h5 class="f_label">From date </h5></td>
                            <td>
                                <input class="form_input" type="date" name="fromdate"></td>
                            <td><h5 class="f_label"> To date</h5></td>
                            <td>
                                <input class="form_input" type="date" name="todate"></td>
                        </tr>
                        <tr>
                            <td><h5 class="f_label">Country</h5></td>
                            <td>
                                <input class="form_input" type="text" name="country">
                            </td>
                            <td><h5 class="f_label">Institution</h5></td>
                            <td>
                                <input class="form_input" type="text" name="institution"></td>
                        </tr>
                        <tr>
                            <td><h5 class="f_label">Field</h5></td>
                            <td>
                                <input class="form_input" type="text" name="field"></td>
                            <td><h5 class="f_label">Degree </h5></td>
                            <td>
                                <input class="form_input" type="text" name="degree"></td>
                        </tr>

                        <tr style="display: none">
                            <td></td>
                            <td></td>
                        </tr>
                    </table>
                    <button class="save_btn" type="submit">Save</button>
                </div>
            </form>
        </div>

        <div class="full_contain">
            <h1 class="liner"> English proficiency</h1>
            <input style="display: none" type="text" name="englishprofid">
            <table>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Level </h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="level"></td>
                    <td class="lbl_td"><h4 class="f_label">TOEFL</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="toefl"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">GRE</h4></td>
                    <td><input class="form_input" type="text" name="gre"></td>

                    <td><h4 class="f_label">IETLS</h4></td>
                    <td><input class="form_input" type="text" name="ietls"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">GMAT</h4></td>
                    <td><input class="form_input" type="text" name="gmat"></td>

                    <td><h4 class="f_label">DUOLINGO</h4></td>
                    <td><input class="form_input" type="text" name="duolingo"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Other</h4></td>
                    <td><input class="form_input" type="text" name="other"></td>

                    <td></td>
                    <td></td>
                </tr>

            </table>

        </div>

        <div class="full_contain">
            <h1 class="liner"> Chinese Proficiency</h1>
            <input style="display: none" type="text" name="chineseprofid">
            <table>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">HSK level</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="hsklevel"></td>
                    <td class="lbl_td"><h4 class="f_label">HSK score</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="hskscore"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">HSK test date</h4></td>
                    <td><input class="form_input" type="date" name="hskdate"></td>

                    <td><h4 class="f_label">HSK tickedno</h4></td>
                    <td><input class="form_input" type="text" name="hsktickedno"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">HSKK level</h4></td>
                    <td><input class="form_input" type="text" name="hskklevel"></td>

                    <td><h4 class="f_label">HSKK score</h4></td>
                    <td><input class="form_input" type="text" name="hskkscore"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">HSKK date</h4></td>
                    <td><input class="form_input" type="date" name="hskkdate"></td>

                    <td></td>
                    <td></td>
                </tr>

            </table>

        </div>


        <table>
            <tr>
                <td class="lbl_td"></td>
                <td class="input_td">
                    <div class="submit_div">
                        <button name="cancel" style="background-color: #585858; color: white" type="cancel"
                                value="cancel" class="btn button-md">CANCEL
                        </button>
                    </div>
                </td>
                <td>
                    <div class="submit_div" style="padding: 0px;">
                        <button name="submit" type="submit" value="Submit" class="btn button-md">SAVE</button>
                    </div>
                </td>
                <td></td>
            </tr>
        </table>
    </div>
</div>
<script>
    var modal = document.getElementById('id01');
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
</script>
</body>

</html>
