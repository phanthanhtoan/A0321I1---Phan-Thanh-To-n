<%--
  Created by IntelliJ IDEA.
  User: PTT
  Date: 29/10/2021
  Time: 7:18 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>${productName} </h1>
    <h1><%=request.getAttribute("productName")%></h1>
    <h1>${amount} </h1>
    <h1>${result}</h1>

</body>
</html>
