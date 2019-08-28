<%-- 
    Document   : homepage
    Created on : 26 août 2019, 12:01:13
    Author     : pauld
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        ${msg}
        <hr>
        <c:forEach items="${ test }" var="utilisateur" varStatus="status">
            Utilisateur N°${ status.count }: ${utilisateur.id}<br>
        </c:forEach>
        <hr>
        <hr>
        <c:forEach items="${ pays }" var="paysAct">
            Pays actuel : ${paysAct}<br>
        </c:forEach>
    </body>
</html>
