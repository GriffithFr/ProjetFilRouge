<%-- 
    Document   : menu
    Created on : 27 août 2019, 13:27:56
    Author     : pauld
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="">SITEDENEWS</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
                    aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarText">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="accueil">Accueil<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Features</a>
                    </li>

                    <c:if test="${role == 'JOURNALISTE'}">
                        <li class="nav-item">
                            <a class="nav-link" href="listearticle">Gerer les articles</a>
                        </li>
                    </c:if>
                </ul>
                <span class="navbar-text">
                    <!-- Button trigger modal -->
                    <c:if test="${empty idUtilisateur}">
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
                            Connexion
                        </button>
                    </c:if>
                    <c:if test="${not empty idUtilisateur}">
                        <a href="deconnexion" class="btn btn-danger active" role="button" aria-pressed="true">Déconnexion</a>
                    </c:if>


                </span>
            </div>
        </nav>

        <!-- Modal -->
        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog"
             aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalCenterTitle">Espace de connexion</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form method="POST" action="connexion">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Adresse Email</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" name="mail"
                                       aria-describedby="emailHelp" placeholder="Entrez votre adresse email">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Mot de passe</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" name="motDePasse"
                                       placeholder="Entrez votre mot de passe">
                            </div>
                            <button type="submit" class="btn btn-primary">Connexion</button>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <label for="creer"> Vous n'avez pas encore de compte ?</label>
                        <a href="ajouterutilisateur" class="btn btn-primary active" role="button" aria-pressed="true">Créer un compte</a>
                    </div>
                </div>
            </div>
        </div>



        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
