<%--
  Created by IntelliJ IDEA.
  User: Anton
  Date: 14.02.2016
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration</title>
</head>
<body>
  <h2>Registration Form</h2>

    <form:form method="POST" modelAttribute="client" name="registerForm">
      <form:input path="id_client" id="id_client" type="hidden"/>

        <table>
          <tr>
            <td><label for="name_firm">Name firm: </label></td>
            <td><form:input path="name_firm" id="name_firm"/></td>
            <td><form:errors cssClass="error" path="name_firm" /> </td>
          </tr>
          <tr>
            <td><label for="first_name">Fisrst name: </label></td>
            <td><form:input path="first_name" id="first_name"/></td>
            <td><form:errors cssClass="error" path="first_name"/> </td>
          </tr>
          <tr>
            <td><label for="last_name">Last name: </label></td>
            <td><form:input path="last_name" id="last_name"/></td>
            <td><form:errors cssClass="error" path="last_name"/> </td>
          </tr>
          <tr>
            <td><label for="email_client">email: </label></td>
            <td><form:input path="email_client" id="email_client"/></td>
            <td><form:errors cssClass="error" path="email_client"/> </td>
          </tr>
          <tr>
            <td><label for="address_client">Address: </label></td>
            <td><form:input path="address_client" id="address_client"/></td>
            <td><form:errors cssClass="error" path="address_client"/> </td>
          </tr>
          <tr>
            <td><label for="client_password">Password: </label></td>
            <td><form:input path="client_password" type="password" id="client_password"/></td>
            <td><form:errors cssClass="error" path="client_password"/> </td>
          </tr>

          <tr>
            <td colspan="3">


                <input type="submit" value="Register" ng-disabled="registerForm.$invalid"/>


            </td>
          </tr>
        </table>


    </form:form>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
</body>
</html>
