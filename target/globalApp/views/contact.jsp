<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <style>

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
            style="font-size: 20px; color: #4c1864; text-transform: capitalize; margin-bottom: 10px">Contact </h1>


        <!-- Family members -->
        <div class="full_contain">
            <h1 class="liner"> Family members</h1>

            <hr/>
            <table class="tab_relative" border="1">
                <b>
                    <tr>
                        <td><h4>NAME</h4></td>
                        <td><h4>RELATIONSHIP </h4></td>
                        <td><h4>OCCUPATION</h4></td>
                        <td><h4>MOBILE</h4></td>
                        <td><h4>EMAIL</h4></td>
                        <td> <button onclick="document.getElementById('id01').style.display='block'"
                                     style=" border: none; background-color: #ff8814; color: white; padding: 5px 20px;margin-left: 20px; width: 100px;">Add
                        </button>
                        </td>
                    </tr>
                </b>
                <tr>
                    <td><h4>Yvette LastName</h4></td>
                    <td><h4>Mother </h4></td>
                    <td><h4>Accountant</h4></td>
                    <td><h4>+12983772828</h4></td>
                    <td><h4>yyy@gmail.com</h4></td>
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
                    <h2>Add new relative</h2>
                    <table style="width: 100%">
                        <tr>
                            <td><h5 class="f_label">Name</h5></td>
                            <td>
                                <input class="form_input" type="text" name="name"></td>
                            <td><h5 class="f_label">Relationship </h5></td>
                            <td>
                                <input class="form_input" type="text" name="relationship"></td>
                        </tr>
                        <tr>
                            <td><h5 class="f_label">Workplace</h5></td>
                            <td>
                                <input class="form_input" type="text" name="workplace">
                            </td>
                            <td><h5 class="f_label">Nationality</h5></td>
                            <td>
                                <input class="form_input" type="text" name="nationality"></td>
                        </tr>
                        <tr>
                            <td><h5 class="f_label">Occupation</h5></td>
                            <td>
                                <input class="form_input" type="text" name="occupation"></td>
                            <td><h5 class="f_label"> Mobile</h5></td>
                            <td>
                                <input class="form_input" type="text" name="mobile"></td>
                        </tr>
                        <tr>
                            <td><h5 class="f_label">Address</h5></td>
                            <td>
                                <input class="form_input" type="text" name="address"></td>
                            <td><h5 class="f_label">Email</h5></td>
                            <td>
                                <input class="form_input" type="text" name="email"></td>
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
            <h1 class="liner"> Financial Supporter</h1>
            <input style="display: none" type="text" name="relativeid_financial">
            <table>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Name</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="name_financial"></td>
                    <td class="lbl_td"><h4 class="f_label">Address</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="address_financial"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Relationship</h4></td>
                    <td><input class="form_input" type="text" name="relationship_financial"></td>

                    <td><h4 class="f_label">Workplace</h4></td>
                    <td><input class="form_input" type="text" name="workplace_financial"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Nationality</h4></td>
                    <td><input class="form_input" type="text" name="nationality_financial"></td>

                    <td><h4 class="f_label">Occupation</h4></td>
                    <td><input class="form_input" type="text" name="occupation_financial"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Mobile</h4></td>
                    <td><input class="form_input" type="text" name="mobile_financial"></td>

                    <td><h4 class="f_label">Email</h4></td>
                    <td><input class="form_input" type="text" name="email_financial"></td>
                </tr>

            </table>
            <input style="display: none" type="text" name="type" value="Financial Supporter">
        </div>

        <div class="full_contain">
            <h1 class="liner"> Guarantor in China</h1>
            <input style="display: none" type="text" name="relativeid_guarantor">
            <table>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Name</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="name_guarantor"></td>
                    <td class="lbl_td"><h4 class="f_label">Address</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="address_guarantor"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Relationship</h4></td>
                    <td><input class="form_input" type="text" name="relationship_guarantor"></td>

                    <td><h4 class="f_label">Workplace</h4></td>
                    <td><input class="form_input" type="text" name="workplace_guarantor"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Nationality</h4></td>
                    <td><input class="form_input" type="text" name="nationality_guarantor"></td>

                    <td><h4 class="f_label">Occupation</h4></td>
                    <td><input class="form_input" type="text" name="occupation_guarantor"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Mobile</h4></td>
                    <td><input class="form_input" type="text" name="mobile_guarantor"></td>

                    <td><h4 class="f_label">Email</h4></td>
                    <td><input class="form_input" type="text" name="email_guarantor"></td>
                </tr>

            </table>
            <input style="display: none" type="text" name="type" value="Guarantor in China">
        </div>

        <div class="full_contain">
            <h1 class="liner"> Home Country Address</h1>
            <input style="display: none" type="text" name="relativeid_home">
            <table>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Name</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="name_home"></td>
                    <td class="lbl_td"><h4 class="f_label">Address</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="address_home"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Relationship</h4></td>
                    <td><input class="form_input" type="text" name="relationship_home"></td>

                    <td><h4 class="f_label">Workplace</h4></td>
                    <td><input class="form_input" type="text" name="workplace_home"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Nationality</h4></td>
                    <td><input class="form_input" type="text" name="nationality_home"></td>

                    <td><h4 class="f_label">Occupation</h4></td>
                    <td><input class="form_input" type="text" name="occupation_home"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Mobile</h4></td>
                    <td><input class="form_input" type="text" name="mobile_home"></td>

                    <td><h4 class="f_label">Email</h4></td>
                    <td><input class="form_input" type="text" name="email_home"></td>
                </tr>

            </table>
            <input style="display: none" type="text" name="type" value="Home Country Address">
        </div>

        <div class="full_contain">
            <h1 class="liner"> Delivery Address</h1>   <input style="display: none" type="text"
                                                              name="relativeid_delivery">
            <table>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Name</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="name_delivery"></td>
                    <td class="lbl_td"><h4 class="f_label">Address</h4></td>
                    <td class="input_td"><input class="form_input" type="text" name="address_delivery"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h4 class="f_label">Relationship</h4></td>
                    <td><input class="form_input" type="text" name="relationship_delivery"></td>

                    <td><h4 class="f_label">Workplace</h4></td>
                    <td><input class="form_input" type="text" name="workplace_delivery"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Nationality</h4></td>
                    <td><input class="form_input" type="text" name="nationality_delivery"></td>

                    <td><h4 class="f_label">Occupation</h4></td>
                    <td><input class="form_input" type="text" name="occupation_delivery"></td>
                </tr>
                <tr>
                    <td><h4 class="f_label">Mobile</h4></td>
                    <td><input class="form_input" type="text" name="mobile_delivery"></td>

                    <td><h4 class="f_label">Email</h4></td>
                    <td><input class="form_input" type="text" name="email_delivery"></td>
                </tr>

            </table>
            <input style="display: none" type="text" name="type" value="Delivery Address">
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
