<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/15/2021
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<%--Todo 1: Use <jsp:useBean> to create a Login bean instance in request scope --%>
<jsp:useBean id="Login" class="com.HuangXingyue.lab2.Login" scope="request"></jsp:useBean>
    <%--Todo 2: Use <jsp:setProperty> to set  beans' property username and password--%>
<jsp:setProperty name="Login" property="username" value="<%=request.getParameter(\"username\")%>"></jsp:setProperty>
<jsp:setProperty name="Login" property="password" value="<%=request.getParameter(\"password\")%>"></jsp:setProperty>
<%
   //todo 3: use if check username is admin and ppassword is admin
    if (Login.getUsername().equals("admin")&&Login.getPassword().equals("admin")){
        HttpSession loginsession = request.getSession();
        session.setAttribute("login",Login);

%>
    <%--todo 4: use jsp:forward to welcome.jsp page--%>
<jsp:forward page="welcome.jsp"></jsp:forward>
<%--    todo 5: else part{ --%>

<%
// todo 6: print username or password error message

    }else {
        PrintWriter writer = response.getWriter();
        writer.println("username or password is  error!");



%>
    <%--todo 7: use jsp:include login.jsp page --%>
<jsp:include page="login.jsp"></jsp:include>
    <%--todo 8: close else --%>
<%
    }
%>
</body>
</html>