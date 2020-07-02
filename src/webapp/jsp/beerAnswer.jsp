<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<html>
<head>
<title>Beer advice page</title>

</head>
<body>
<h1 align="center">Wyslane rzeczy</h1>

${person}
<br>
${person.name}
${person.beerType}
${person.beer}
<%--zamiennie można użyć ${username} ${beertype}--%>
<%--
<%
    out.print(request.getAttribute("username"));
%>
<br>
<%
    out.print(request.getAttribute("beertype"));
%>
--%>
</body>
</html>