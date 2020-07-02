<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<html>
<head>



</head>
<body>
<h1>

    <%-- <% %> znaczniki służą do pisania kodu w Javie --%>
    <%
        out.print(request.getAttribute("cars"));
    %>



</h1>

</body>


</html>