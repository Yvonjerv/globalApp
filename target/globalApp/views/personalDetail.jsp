<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="jspresource.jsp" %>
<html>
<head>
    <title>Personal Details</title>
    <link rel="stylesheet" href="../res/css/style.css">
    <script type="text/javascript" src="../res/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="../res/js/ajaxfileupload.js"></script>
    <script type="text/javascript">
        $(function () {
            /*After the upload button is clicked, the
            file control is invoked to open the file selector.
            */
            $("#choicePhoto").click(function () {
                $("#fileToUpload").click();
            });
            /*When a file is selected, the change method of the
            file control is started
             */
            $("#fileToUpload").change(function (e) {
                $.ajaxFileUpload({
                    url: 'fileuploadservlet.do',
                    type: "post",
                    secureuri: false,
                    fileElementId: 'fileToUpload',
                    dataType: 'text',//return data's type
                    data: null,
                    success: function (data) {
                        alert("file upload successfully"); //display messge
                        var dataNew = "../global_img/" + data
                        $('#upload').attr("src", dataNew)
                        $("#photourl").val(data);
                    },
                    error: function (data, status, e) {
                        alert("file upload failed");//display messge
                    }
                });
            });
        });
    </script>
    <style>
        input,
        textarea {
            width: 200px;}
    </style>
</head>
</head>
<body>
<%@include file="sysmenu.jsp" %>
<div class="main_container" style="display: flex; align-content: flex-start; justify-content: flex-start">
    <%@include file="sidebar.jsp" %>
    <div style="width: 80%; margin: 50px; width: 65% "><h1
            style="font-size: 20px; color: #4c1864; text-transform: capitalize; margin-bottom: 10px">Personal
        Information</h1>
        <form action="/personalinfo/editpersonalinfo">
            <div class="full_contain">
                <h1 class="liner"> Details</h1>

                <table>

                    <tr>
                        <td rowspan="9"><img src="../res/img/photo.jpg"
                                             style="height: 280px; width: 200px;border: #4c1864 2px solid; overflow: hidden; margin: auto 20px;"/>
                            <br>
                            <input class="btn_upload" type="button" value="UPLOAD" id="choicePhoto"
                                   style="width: 70%; background-color: #4c1864; color: white; margin: 30px; "></td>
                        <td class="lbl_td"><h5 class="f_label">First name</h5></td>
                        <td class="input_td"><input class="form_input" type="text" name="firstname" value="${pers.firstname}"></td>

                        <td class="lbl_td"><h5 class="f_label" >Last name</h5></td>
                        <td><input class="form_input" type="text" value="${pers.lastname}" name="lastname"></td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Chinese name</h5></td>
                        <td><input class="form_input" type="text" name="chinesename" value="${pers.chinesename}"></td>

                        <td><h5 class="f_label">Gender</h5></td>
                        <td style=" color: #000000; width: 140px; display: flex; flex-direction: row; justify-content: flex-start">
                            <input style="margin: 0px; padding: 0px;" type="radio" id="choice1" checked name="contact" value="male">
                            <h5  style="margin: 0px; padding: 0px;" >Male  </h5>
                            <input  style="margin: 0px; padding: 0px;" type="radio" id="choice2" name="contact" value="female">
                            <h5  style="margin: 0px; padding: 0px;" >Female  </h5>
                        </td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Religion</h5></td>
                        <td><select name="religion" class="form_input" style="padding: 10px; width: 200px;">
                            <option value="">-- select one --</option>
                            <option value="African Traditional & Diasporic">African Traditional & Diasporic</option>
                            <option value="Agnostic">Agnostic</option>
                            <option value="Atheist">Atheist</option>
                            <option value="Baha'i">Baha'i</option>
                            <option value="Buddhism">Buddhism</option>
                            <option value="Cao Dai">Cao Dai</option>
                            <option value="Chinese traditional religion">Chinese traditional religion</option>
                            <option value="Christianity">Christianity</option>
                            <option value="Hinduism">Hinduism</option>
                            <option value="Islam">Islam</option>
                            <option value="Jainism">Jainism</option>
                            <option value="Juche">Juche</option>
                            <option value="Judaism">Judaism</option>
                            <option value="Neo-Paganism">Neo-Paganism</option>
                            <option value="Nonreligious">Nonreligious</option>
                            <option value="Rastafarianism">Rastafarianism</option>
                            <option value="Secular">Secular</option>
                            <option value="Shinto">Shinto</option>
                            <option value="Sikhism">Sikhism</option>
                            <option value="Spiritism">Spiritism</option>
                            <option value="Tenrikyo">Tenrikyo</option>
                            <option value="Unitarian-Universalism">Unitarian-Universalism</option>
                            <option value="Zoroastrianism">Zoroastrianism</option>
                            <option value="primal-indigenous">primal-indigenous</option>
                            <option value="Other">Other</option>
                        </select></td>

                        <td><h5 class="f_label">Marital Status</h5></td>
                        <td><select name="marital" class="form_input" style="padding: 10px; width: 200px;">
                            <option value="">-- select one --</option>
                            <option value="Single">Single</option>
                            <option value="Married">Married</option>
                            <option value="Divorce">Divorce</option>
                            <option value="Widow">Widow</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Nationality</h5></td>
                        <td><select name="nationality" class="form_input" style="padding: 10px; width: 200px;">
                            <option value="">-- select one --</option>
                            <c:forEach items="${countries}" var="obj">
                                <option value="${obj.countryname}">${obj.countryname}</option>
                            </c:forEach>


                        </select></td>

                        <td><h5 class="f_label">Date of birth</h5></td>
                        <td><input class="form_input" type="date" name="dateofbirth" value="${pers.dateofbirth}"></td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Birthplace</h5></td>
                        <td><input class="form_input" type="text" name="birthplace" value="${pers.birthplace}"></td>

                        <td><h5 class="f_label">Birth country</h5></td>
                        <td><select name="birthcountry" class="form_input" style="padding: 10px; width: 200px;">
                            <option value="">-- select one --</option>
                            <c:forEach items="${countries}" var="obj">
                                <option value="${obj.countryname}">${obj.countryname}</option>
                            </c:forEach>
                        </select></td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Native language</h5></td>
                        <td><select name="nativelang" class="form_input" style="padding: 10px; width: 200px;">
                            <option value="">-- select one --</option>
                            <c:forEach items="${languages}" var="obj">
                                <option value="${obj.language}">${obj.language}</option>
                            </c:forEach>
                        </select></td>

                        <td><h5 class="f_label">Highest degree</h5></td>
                        <td><input class="form_input" type="text" name="highestdegree" value="${pers.highestdegree}"></td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Institution</h5></td>
                        <td><input class="form_input" type="text" name="institution" value="${pers.institution}" ></td>

                        <td><h5 class="f_label">Occupation</h5></td>
                        <td><input class="form_input" type="text" name="occupation" value="${pers.occupation}"></td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Health status</h5></td>
                        <td><input class="form_input" type="text" name="healthstatus" value="${pers.healthstatus}"></td>

                        <td><h5 class="f_label">Hobby</h5></td>
                        <td><input class="form_input" type="text" name="hobby" value="${pers.hobby}"></td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Photourl</h5></td>
                        <td><input class="form_input" type="text" name="photourl" value="${pers.photourl}"></td>

                        <td style="display: none"><h5 class="f_label">Userid</h5></td>
                        <td style="display: none"><input class="form_input" type="text" name="pers" value="${pers.personid}">${pers.personid}</td>
                    </tr>

                </table>
            </div>
            <div class="full_contain" style="margin-top: 50px">
                <h1 class="liner"> Current Location</h1>
                <table>
                    <tr>
                        <td class="lbl_td"><h5 class="f_label">In China</h5></td>
                        <td style=" color: #000000; width: 140px; display: flex; flex-direction: row; justify-content: flex-start">
                            <input style="margin: 0px; padding: 0px;" type="radio" id="inchinaYes" checked name="inchina" value="yes">
                            <h5  style="margin: 0px; padding: 0px;" >Yes  </h5>
                            <input  style="margin: 0px; padding: 0px;" type="radio" id="inchinaNo" name="inchina" value="no">
                            <h5  style="margin: 0px; padding: 0px;" >No  </h5>
                        </td>
                        <td><h5 class="f_label">Current school/Org.</h5></td>
                        <td><input class="form_input" type="text" name="institution" value="${pers.institution}"></td>
                    </tr>
                    <tr>
                        <td><h5 class="f_label">Visa Type</h5></td>
                        <td><select name="visatype" class="form_input" style="padding: 10px; width: 200px;">
                            <option value="">-- select one --</option>
                            <option value="X1 Visa">X1短期 X1 Visa</option>
                            <option value="X2 Visa">X2短期 X2 Visa</option>
                            <option value="Residence Permit">居留许可 Residence Permit</option>
                            <option value="Other">其它 Other</option>


                        </select></td>
                        <td><h5 class="f_label">Expiration date </h5></td>
                        <td><input class="form_input" type="date" name="expirationdate"></td>
                    </tr>
                </table>
            </div>

            <table>
                <tr>
                    <td class="lbl_td"></td>
                    <td class="input_td">
                        <div class="submit_div">
                            <button style="background-color: #585858; color: white" name="cancel" type="cancel"
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
        </form>
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
