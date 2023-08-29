<%--
  Created by IntelliJ IDEA.
  User: kamar
  Date: 29/08/2023
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--tags from spring--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spring a web</title>
</head>
<body>

<form:form method="post" modelAttribute="user">
    <fieldset>
        <form:label path="name" >name</form:label>
        <form:input path="name" type="text" required="required"/>
        <input class="btn btn-success" type="submit" value="submit">
    </fieldset>
</form:form>

</body>
</html>
