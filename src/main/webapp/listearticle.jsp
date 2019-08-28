<%-- 
    Document   : listearticle
    Created on : 26 août 2019, 15:24:25
    Author     : pauld
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="/menu.jsp" />
        
        <div class="container">
            <div class="row">
                <div class="col-lg-10 col-md-10 mx-auto">
                    <h2>Liste des articles</h2>
                    <hr>
                    <a href="ajouterarticle" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Ajouter un article</a>
                    <hr>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Titre</th>
                                <th scope="col">Date</th>
                                <th scope="col">Auteur</th>
                                <th colspan="2" scope="colgroup">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listeArticles}" var="article">
                                <tr>
                                    <th scope="row">${article.id}</th>
                                    <td>${article.articleMainTitle}</td>
                                    <td><fmt:formatDate value="${article.articleDate}" pattern="dd-MM-yyyy"/></td>
                                    <td>${article.utilisateur.userName}</td>
                                    <td><a href="modifierarticle?idAModifier=${article.id}" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">Editer</a></td>
                                    <td><a href="supprimerarticle?idASupprimer=${article.id}" class="btn btn-danger btn-sm active" role="button" aria-pressed="true">Supprimer</a></td>
                                </tr>

                            </c:forEach>
                        </tbody>
                    </table>
                    
                </div>
            </div>
        </div>
    </body>
</html>
