<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" >
  </head>
  <body>
  <div id="main">
    <h1 id="header">WARRIOR</h1>
    <p>Hello world!</p>
  <a href="/auth/list"><p>Хочешь узнать всех героев по имени? А ведь это могут не только лишь все, мало кто это может!</p></a>
  <p>${crypt}</p>

  <%--<c:url value="/login" var="loginProcessingUrl"/>--%>
    <%--<form action="${loginProcessingUrl}" method="post">--%>
      <%--<fieldset>--%>
        <%--<legend>Please Login</legend>--%>
        <%--<!-- use param.error assuming FormLoginConfigurer#failureUrl contains the query parameter error -->--%>
        <%--<c:if test="${param.error != null}">--%>
          <%--<div>--%>
            <%--Failed to login.--%>
            <%--<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">--%>
              <%--Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />--%>
            <%--</c:if>--%>
          <%--</div>--%>
        <%--</c:if>--%>
        <%--<!-- the configured LogoutConfigurer#logoutSuccessUrl is /login?logout and contains the query param logout -->--%>
        <%--<c:if test="${param.logout != null}">--%>
          <%--<div>--%>
            <%--You have been logged out.--%>
          <%--</div>--%>
        <%--</c:if>--%>
        <%--<p>--%>
          <%--<label for="username">Username</label>--%>
          <%--<input type="text" id="username" name="username"/>--%>
        <%--</p>--%>
        <%--<p>--%>
          <%--<label for="password">Password</label>--%>
          <%--<input type="password" id="password" name="password"/>--%>
        <%--</p>--%>
        <%--<!-- if using RememberMeConfigurer make sure remember-me matches RememberMeConfigurer#rememberMeParameter -->--%>
        <%--<p>--%>
          <%--<label for="remember-me">Remember Me?</label>--%>
          <%--<input type="checkbox" id="remember-me" name="remember-me"/>--%>
        <%--</p>--%>
        <%--<div>--%>
          <%--<button type="submit" class="btn">Log in</button>--%>
        <%--</div>--%>
      <%--</fieldset>--%>
    <%--</form>--%>

  </div>
  </body>
</html>
