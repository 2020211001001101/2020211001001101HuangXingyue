<%--
  Created by IntelliJ IDEA.
  User: 改改
  Date: 2022/5/18
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <title>This is MyJsp.jsp</title>
</head>
<body>
<form  accept-charset="UTF-8" method="post" action=<%=request.getContextPath()%>/myDear>
    <h3>this is MyJsp.jsp</h3>
   name: <input type="text" name="name" >
    <br />
    class: <input type="text" name="Class" />
    <br/>
    ID: <input type="text" name="id" />
    <br/>
    <input type="submit" name="submit" value="Send data to server"  />
</form>
</body>
</html>
