<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Avenger
  Date: 2017/11/9
  Time: 下午7:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>

    <h1>Welcome to Spittr</h1>
    <h2>Register</h2>
    <form method="post" action="/spittr/register">
        <p>First Name:<input type="text" name="firstName" /></p>
        <br/>
        <p>Last Name:<input type="text" name="lastName" /></p>
        <br/>
        <p>User Name: <input type="text" name="userName" /></p>
        <br/>
        <p>Password Name: <input type="text" name="password" /></p>
        <br/>
        <input type="submit" value="Register" />
    </form>



    <a href="<c:url value="/index" />">index</a>
    <a href="<c:url value="/home" />">home</a>
</body>
</html>
