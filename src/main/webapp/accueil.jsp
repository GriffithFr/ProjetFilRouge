<%-- 
    Document   : accueil
    Created on : 26 août 2019, 16:02:01
    Author     : mikael
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">        
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <title>Accueil</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" id="TitreSite" href=".\index.html">SCOOP TOUJOURS </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
                    aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarText">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="../Projet New/index.html">Accueil<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../Projet New/Journalistes.html">Journalistes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../Projet New/gestionCompteUser.html">Mon compte</a>
                    </li>
                </ul>

                <span class="navbar-text">
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
                        Connexion
                    </button>


                </span>
            </div>
        </nav>
        <br><br><br><br><br>

        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-9 mx-auto">

                    <div class="card-deck">
                        <c:forEach items="${articles}" var="articleVue">
                            <div class="col-4 mb-3" >
                                <div class="card text-center tailleCard" >
                                    <img src="<c:url value="/images/${articleVue.articleMainPhoto}"/>" class="card-img-top" width="auto" height="125px" alt="...">

                                        <div class="card-body">
                                            <h5 class="card-title">${articleVue.articleMainTitle}</h5>
                                        <h6 class="card-subtitle mb-2 text-sm text-muted"><fmt:formatDate value="${articleVue.articleDate}" pattern="dd/MM/yyyy" /></h6>
                                        <p class="card-text">${articleVue.articleIntroduction}</p>
                                    </div>

                                    <div class="card-footer">

                                        <span class="pastille badge badge-primary badge-pill">${articleVue.articleTags}</span> -

                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                    <hr>
                    <!-- Pager -->
                    <nav aria-label="Page navigation example">
                        <ul class="pagination examplenavigation">
                            <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item"><a class="page-link" href="#">Next</a></li>
                        </ul>
                    </nav>

                </div>
                <div class="panneauDroite col-lg-4 col-md-10">
                    <div class="row">
                        Catégorie
                        <br>
                        <br>
                    </div>
                    <div class="row">
                        <div class="list-group categories-droite d-flex w-100 justify-content-between" id="list-tab" role="tablist">
                            <a class="list-group-item list-group-item-action active categorie-droite" id="list-home-list"
                               data-toggle="list" href="#list-home" role="tab" aria-controls="home">Tout<span
                                    class="pastille badge badge-secondary badge-pill pastilleCategorie">14</span></a>
                            <a class="list-group-item list-group-item-action categorie-droite" id="list-profile-list"
                               data-toggle="list" href="#list-profile" role="tab" aria-controls="profile">Sport<span
                                    class="pastille badge badge-secondary badge-pill pastilleCategorie">7</span></a>
                            <a class="list-group-item list-group-item-action categorie-droite" id="list-messages-list"
                               data-toggle="list" href="#list-messages" role="tab" aria-controls="messages">Economie<span
                                    class="pastille badge badge-secondary badge-pill pastilleCategorie">2</span></a>
                            <a class="list-group-item list-group-item-action categorie-droite" id="list-settings-list"
                               data-toggle="list" href="#list-settings" role="tab"
                               aria-controls="settings">Environnement<span
                                    class="pastille badge badge-secondary badge-pill pastilleCategorie">5</span></a>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        Articles des abonnements
                        <br>
                        <br>
                    </div>
                    <div class="row">
                        <div class="list-group">
                            <a href="#" class="list-group-item list-group-item-action">
                                <div class="d-flex w-100 justify-content-between">
                                    <h5 class="mb-1">Article en rapport avec les abonnements</h5>
                                    <small>3 days ago</small>
                                </div>
                                <p class="mb-1">Cet article apparait dans cette zone car il est en rapport avec les
                                    abonnements que vous avez décider de suivre.</p>
                                <small>Donec id elit non mi porta.</small>
                            </a>
                            <a href="#" class="list-group-item list-group-item-action">
                                <div class="d-flex w-100 justify-content-between">
                                    <h5 class="mb-1">Article en rapport avec les abonnements</h5>
                                    <small class="text-muted">3 days ago</small>
                                </div>
                                <p class="mb-1">Cet article apparait dans cette zone car il est en rapport avec les
                                    abonnements que vous avez décider de suivre.</p>
                                <small class="text-muted">Donec id elit non mi porta.</small>
                            </a>
                            <a href="#" class="list-group-item list-group-item-action">
                                <div class="d-flex w-100 justify-content-between">
                                    <h5 class="mb-1">Article en rapport avec les abonnements</h5>
                                    <small class="text-muted">3 days ago</small>
                                </div>
                                <p class="mb-1">Cet article apparait dans cette zone car il est en rapport avec les
                                    abonnements que vous avez décider de suivre.</p>
                                <small class="text-muted">Donec id elit non mi porta.</small>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Page footer -->
        <footer class="page-footer font-small blue pt-4 bg-dark" >
            <div class="container-fluid text-center text-md-left">

                <div class="row">

                    <div class="col-md-2 mt-md-0 mt-3">
                        <h5 class="text-uppercase text-white">Projet News</h5>
                    </div>

                    <hr class="clearfix w-100 d-md-none pb-3">

                    <div class="col-md-2 mb-md-0 mb-3">
                        <h5 class="text-uppercase text-white">Liens</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="./index.html">Accueil</a>
                            </li>
                            <li>
                                <a href="./article.html">Article</a>
                            </li>
                            <li>
                                <a href="./register.html">S'inscrire</a>
                            </li>
                            <li>
                                <a href="./abonnements.html">Mon abonnement</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-md-2 mb-md-0 mb-4">
                        <h5 class="text-uppercase text-white">Compte</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="./index.html">Creer un compte</a>
                            </li>
                            <li>
                                <a href="./article.html">Se connecter</a>
                            </li>
                            <li>
                                <a href="./register.html">S'inscrire</a>
                            </li>
                            <li>
                                <a href="./abonnements.html">Mon abonnement</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-md-2 mb-md-0 mb-4">
                        <h5 class="text-uppercase text-white">Liens</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="./index.html">Accueil</a>
                            </li>
                            <li>
                                <a href="./article.html">Article</a>
                            </li>
                            <li>
                                <a href="./register.html">S'inscrire</a>
                            </li>
                            <li>
                                <a href="./abonnements.html">Mon abonnement</a>
                            </li>
                        </ul>
                    </div>

                </div>

            </div>
            <div class="footer-copyright text-center py-3 text-white">© 2019 Copyright:
                <a href=".\index.html" > Projetnews.fr</a>
            </div>
        </footer>

        <!--         Optional JavaScript 
                         jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    </body>
</html>
