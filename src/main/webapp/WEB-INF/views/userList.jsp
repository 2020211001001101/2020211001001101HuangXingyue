<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.HuangXingyue.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 改改
  Date: 2022/4/5
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1> User List</h1>
<%
    Cookie[] allCookies=request.getCookies();
    for (Cookie c:allCookies){
        out.println("<br/>"+c.getName()+" --- "+c.getValue());
    }
%>
<%
    User user=(User)session.getAttribute("user");
//    System.out.println("get from userList.jsp :"+user.getUsername());
%>
<table border="1">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
        <td>email</td>
        <td>gender</td>
        <td>birthDate</td>
    </tr>

    <tr>
        <td><%=user.getID()%></td>
        <td><%=user.getUsername()%></td>
        <td><%=user.getPassword()%></td>
        <td><%=user.getEmail()%></td>
        <td><%=user.getGender()%></td>
        <td><%=user.getBirthdate()%></td>

    </tr>

</table>
<a href="updateUser">update</a>
<%@include file="footer.jsp"%>