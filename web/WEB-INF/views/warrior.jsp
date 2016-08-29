<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Warrior</title>
</head>
<body>
<c:forEach items="${unit_list}" var="unit">
    <td>Id:  ${unit.getId()} </td>
    <td>Имя: ${unit.getName()} </td>
    <td>Боевой опыт: ${unit.getBaseSkills().getMainBattleExperience()} </td>
    </br>
</c:forEach>

<spring:form action="/addwarrior" modelAttribute="warrior" method="post" accept-charset="UTF-8">
    <p>Введите чёртово имя героя для записи в чёртову БД:</p>
        <spring:input type="text" name="id" path="id"/>
        <spring:input type="text" name="name" path="name"/>
    <p><spring:button name="add" value="add">Записать/Переименовать</spring:button>
        <spring:button name="remove" value="remove">Удалить</spring:button></p>
    <%--<p><spring:button><a href="<s:url value="/deletewarrior"/>">Удалить</a></spring:button></p>--%>
</spring:form>

<%--<spring:form action="/deletewarrior" modelAttribute="warrior" method="post" accept-charset="UTF-8">--%>
    <%--<p>Введите чёртово имя героя для записи в чёртову БД:</p>--%>
    <%--<spring:input type="text" name="id" path="id"/>--%>
    <%--<spring:input type="text" name="name" path="name"/>--%>
<%--</spring:form>--%>

</body>
</html>
