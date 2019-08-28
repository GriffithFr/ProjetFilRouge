<%-- 
    Document   : ajouterutilisateur
    Created on : 27 août 2019, 15:27:38
    Author     : pauld
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <div class="col-lg-8 col-md-10 mx-auto">
                    <h2>Forumulaire d'inscription</h2>
                    <hr>
                    <form method="POST" action="ajouterutilisateur">
                        <div class="form-group row">
                            <label for="inputText1" class="col-sm-2 col-form-label">Nom</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText1" name="nom"
                                       placeholder="Entrez votre nom">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="exampleInputEmail1"  class="col-sm-2 col-form-label">Adresse Email</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" id="exampleInputEmail1" name="mail" aria-describedby="emailHelp"
                                       placeholder="Entrez votre adresse email">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="exampleInputPassword1"  class="col-sm-2 col-form-label">Mot de passe</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="exampleInputPassword1" name="motDePasse"
                                       placeholder="Entrez votre mot de passe">
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">S'incrire</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
