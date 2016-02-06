<%--
  Created by IntelliJ IDEA.
  User: Anton
  Date: 30.01.2016
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv = "Content-Type" content="text/html; charset = UTF-8">
    <title>Clint registration form</title>
    <link href="<c:url value='/static/css/bootstrap' />" rel="stylesheet"/>
    <link href="<c:url value='/static/css/registration' />" rel="stylesheet"/>
</head>
<body>
    <div class="generic-container">
        <div class="header">Registration form</div>
        <form:form method="POST" modelAttribute="client" cssClass="form-horozontal">
            <form:input path="id_client" type="hidden" id="id"/>

            <div class="row">
                <div class="form-group col-md-12">
                    <label class="col-md-3 control-lable" for="first_name"> First Name </label>
                    <div class="col-md-7">
                        <form:input path="first_name" id="first_name" type="text" class="form-control input-sm"/>
                        <div class="has-error">
                            <form:errors path="first_name" class="help-inline"/>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="form-group col-md-12">
                    <label class="col-md-3 control-lable" for="last_name"> Last Name </label>
                    <div class="col-md-7">
                        <form:input path="last_name" id="last_name" type="text" class="form-control input-sm"/>
                        <div class="has-error">
                            <form:errors path="last_name" class="help-inline"/>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="form-group col-md-12">
                    <label class="col-md-3 control-lable" for="name_firm"> Name Firm </label>
                    <div class="col-md-7">
                        <form:input path="name_firm" id="name_firm" type="text" class="form-control input-sm"/>
                        <div class="has-error">
                            <form:errors path="name_firm" class="help-inline"/>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="form-group col-md-12">
                    <label class="col-md-3 control-lable" for="email_client"> e-mail </label>
                    <div class="col-md-7">
                        <form:input path="email_client" id="email_client" type="text" class="form-control input-sm"/>
                        <div class="has-error">
                            <form:errors path="email_client" class="help-inline"/>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="form-group col-md-12">
                    <label class="col-md-3 control-lable" for="client_password"> Password </label>
                    <div class="col-md-7">
                        <form:input path="client_password" id="client_password" type="password" class="form-control input-sm"/>
                        <div class="has-error">
                            <form:errors path="client_password" class="help-inline"/>
                        </div>
                    </div>
                </div>
            </div>



            <%-- Register or Cancel buttons --%>
            <div class="row">
                <div class="form-actions floatRight">
                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a

                                href="<c:url value='//registration' />">Cancel</a>
                        </c:when>
                        <c:otherwise>
                            <input type="submit" value="Register" class="btn btn-primary btn-sm"/> or <a

                                href="<c:url value='//registration' />">Cancel</a>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>
        </form:form>
    </div>

</body>
</html>
