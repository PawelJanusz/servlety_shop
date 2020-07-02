<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<html>
<head>



</head>
<body>
<h1>
    Pierwszy projekt JSP
    <%-- <% %> znaczniki służą do pisania kodu w Javie --%>
    <%
    for (int i=0; i<101; i++)
        out.print(i + " ");
    %>



</h1>

</body>


</html>