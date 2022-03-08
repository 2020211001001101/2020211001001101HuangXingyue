<%--
  Created by IntelliJ IDEA.
  User: 改改
  Date: 2022/3/8
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New User Registration!</title>
    <style type="text/css">
        body{
            background-color:darksalmon;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .all{
            /*height: 750px;*/
            display: flex;
            flex-direction:column;
        }
        .box{
            display: flex;
            flex-direction: column;
        }
        #Username,#Password,#Email,#Date{
            /*background-color: darksalmon;*/
            display: flex;
            align-items: center;
            box-sizing: border-box;
            /*text-align: center;*/
            margin-bottom: 10px;
            /*margin-top: 10px;*/
            height: 40px;
            width: 300px;
        }
        #man,#woman{
            /*margin-top: 0;*/
            margin-left: 40px;
        }
        .change::placeholder {
            color: red;
        }
    </style>

</head>
<body>
<div class="all">
    <form class="box" onsubmit="return check()">
         <input type="text" placeholder="Username" id="Username" required/>
         <input type="password" placeholder="Password" id="Password" required />
         <input type="email" placeholder="Email" id="Email" required/>
      <div>
         <text>Gender</text>
         <input id="man" type="radio" checked="checked" name="1"/>Man
         <input id="woman" type="radio" name="1" />Woman
      </div>
         <input type="date" id="Date" style="margin-top: 10px" required/>
         <input type="submit" value="Register" id="register" style="text-align: center;height: 40px;
            width: 300px;" />
    </form>
</div>
<script>
    function check() {
        var pwd = document.getElementById('Password')
        if (pwd.value.length < 8) {
            pwd.value = "";
            pwd.className="change"
            pwd.placeholder = "length must be at least 8 characters!"
            return false;
        }
        else {
            return true
        }
    }
</script>
</body>
</html>
