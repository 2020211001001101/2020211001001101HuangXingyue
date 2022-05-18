<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 改改
  Date: 2022/5/11
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Get header using EL</h2>
    Host:${header.host}<br>
    Accept:${header.Accept}<br>

<h2>get cookies using EL</h2>
Host:${cookie.JSESSIONID.value}<br>

JSESSIONID cookie value:${cookie.JSESSIONID.value}<br>
<<hr>

<h2>Get context init param value using EL Code</h2>
Driver:${initParam.driver}<br>
password:${initParam.password}<br>
<hr>

<h2>User pageContext</h2>
session id:${pageContext.session.id}<br>
request method:${pageContext.request.method}<br>
<hr>

<%--<h2>Use empty operator</h2>--%>
<%--${empty str}<br>--%>
<%--<% ArrayList<User> userList=new userList<User>(); %>--%>
<%--${empty userList}--%>

</body>
</html>
