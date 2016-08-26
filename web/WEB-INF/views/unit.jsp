<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Unit</title>
</head>
<body>
<c:forEach items="${unit_list}" var="unit">
    <td>${unit.getId()} </td>
    <td>${unit.getSkilName()} </td>
    <td>${unit.getSkillValue()} </td>
    </br>
</c:forEach>


<%--<spring:form method="post" commandName="unitadd" action="/addunit">--%>
<%--<spring:form method="post" modelAttribute="unitadd" action="/addunit">--%>

    <%--Name: <spring:input  path="name" /><br/>--%>
    <%--Age: <spring:input path="age"/><br/>--%>
    <%--Type: <spring:input path="type"/> <br/>--%>
    <%--<spring:button>Записать</spring:button>--%>

<%--</spring:form>--%>
</body>
</html>
