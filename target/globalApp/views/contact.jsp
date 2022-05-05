<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../views/jspresource.jsp"%>
<html>
<head>
    <title>Contact Details</title>
    <link rel="stylesheet" href="../res/css/style.css">
</head>
</head>
<body>
<%@include file="sysmenu.jsp"%>
<div class="main_container" style="display: flex; align-content: flex-start; justify-content: flex-start">
    <%@include file="sidebar.jsp"%>
    <div style="width: 80%; margin: 50px; width: 65% "> <h1 style="font-size: 20px; color: #4c1864; text-transform: capitalize; margin-bottom: 10px">Contacts</h1>
        <div class="full_contain">
            <h1 class="liner"> Financial Supporter</h1>
            <input style="display: none" type="text" name="relativeid_financial">
            <table>
                <tr>
                    <td class="lbl_td"><h5 class="f_label" >Name</h5></td>
                    <td class="input_td" ><input class="form_input" type="text" name="name_financial"></td>
                    <td class="lbl_td"><h5 class="f_label" >Address</h5></td>
                    <td class="input_td" ><input class="form_input" type="text" name="address_financial"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h5 class="f_label" >Relationship</h5></td>
                    <td><input class="form_input" type="text" name="relationship_financial"></td>

                    <td><h5 class="f_label">Workplace</h5></td>
                    <td><input class="form_input" type="text" name="workplace_financial"></td>
                </tr>
                <tr>
                    <td><h5 class="f_label">Nationality</h5></td>
                    <td><input class="form_input" type="text" name="nationality_financial"></td>

                    <td><h5 class="f_label">Occupation</h5></td>
                    <td><input class="form_input" type="text" name="occupation_financial"></td>
                </tr>
                <tr>
                    <td><h5 class="f_label">Mobile</h5></td>
                    <td><input class="form_input" type="text" name="mobile_financial"></td>

                    <td><h5 class="f_label">Email</h5></td>
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
                    <td class="lbl_td"><h5 class="f_label" >Name</h5></td>
                    <td class="input_td" ><input class="form_input" type="text" name="name_guarantor"></td>
                    <td class="lbl_td"><h5 class="f_label" >Address</h5></td>
                    <td class="input_td" ><input class="form_input" type="text" name="address_guarantor"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h5 class="f_label" >Relationship</h5></td>
                    <td><input class="form_input" type="text" name="relationship_guarantor"></td>

                    <td><h5 class="f_label">Workplace</h5></td>
                    <td><input class="form_input" type="text" name="workplace_guarantor"></td>
                </tr>
                <tr>
                    <td><h5 class="f_label">Nationality</h5></td>
                    <td><input class="form_input" type="text" name="nationality_guarantor"></td>

                    <td><h5 class="f_label">Occupation</h5></td>
                    <td><input class="form_input" type="text" name="occupation_guarantor"></td>
                </tr>
                <tr>
                    <td><h5 class="f_label">Mobile</h5></td>
                    <td><input class="form_input" type="text" name="mobile_guarantor"></td>

                    <td><h5 class="f_label">Email</h5></td>
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
                    <td class="lbl_td"><h5 class="f_label" >Name</h5></td>
                    <td class="input_td" ><input class="form_input" type="text" name="name_home"></td>
                    <td class="lbl_td"><h5 class="f_label" >Address</h5></td>
                    <td class="input_td" ><input class="form_input" type="text" name="address_home"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h5 class="f_label" >Relationship</h5></td>
                    <td><input class="form_input" type="text" name="relationship_home"></td>

                    <td><h5 class="f_label">Workplace</h5></td>
                    <td><input class="form_input" type="text" name="workplace_home"></td>
                </tr>
                <tr>
                    <td><h5 class="f_label">Nationality</h5></td>
                    <td><input class="form_input" type="text" name="nationality_home"></td>

                    <td><h5 class="f_label">Occupation</h5></td>
                    <td><input class="form_input" type="text" name="occupation_home"></td>
                </tr>
                <tr>
                    <td><h5 class="f_label">Mobile</h5></td>
                    <td><input class="form_input" type="text" name="mobile_home"></td>

                    <td><h5 class="f_label">Email</h5></td>
                    <td><input class="form_input" type="text" name="email_home"></td>
                </tr>

            </table>
            <input style="display: none" type="text" name="type" value="Home Country Address">
        </div>

        <div class="full_contain">
            <h1 class="liner"> Delivery  Address</h1>   <input style="display: none" type="text" name="relativeid_delivery">
            <table>
                <tr>
                    <td class="lbl_td"><h5 class="f_label" >Name</h5></td>
                    <td class="input_td" ><input class="form_input" type="text" name="name_delivery"></td>
                    <td class="lbl_td"><h5 class="f_label" >Address</h5></td>
                    <td class="input_td" ><input class="form_input" type="text" name="address_delivery"></td>
                </tr>
                <tr>
                    <td class="lbl_td"><h5 class="f_label" >Relationship</h5></td>
                    <td><input class="form_input" type="text" name="relationship_delivery"></td>

                    <td><h5 class="f_label">Workplace</h5></td>
                    <td><input class="form_input" type="text" name="workplace_delivery"></td>
                </tr>
                <tr>
                    <td><h5 class="f_label">Nationality</h5></td>
                    <td><input class="form_input" type="text" name="nationality_delivery"></td>

                    <td><h5 class="f_label">Occupation</h5></td>
                    <td><input class="form_input" type="text" name="occupation_delivery"></td>
                </tr>
                <tr>
                    <td><h5 class="f_label">Mobile</h5></td>
                    <td><input class="form_input" type="text" name="mobile_delivery"></td>

                    <td><h5 class="f_label">Email</h5></td>
                    <td><input class="form_input" type="text" name="email_delivery"></td>
                </tr>

            </table>
            <input style="display: none" type="text" name="type" value="Delivery Address">
        </div>
        <table>
                <tr>
                    <td class="lbl_td"> </td>
                    <td  class="input_td"> <div class="submit_div">
                        <button name="cancel" style="background-color: #585858; color: white" type="cancel" value="cancel" class="btn button-md">CANCEL</button>
                    </div></td>
                    <td> <div class="submit_div" style="padding: 0px;">
                        <button name="submit" type="submit" value="Submit" class="btn button-md">SAVE</button>
                    </div></td>
                    <td > </td>
                </tr>
            </table>

    </div>
</div>
</body>
</html>
