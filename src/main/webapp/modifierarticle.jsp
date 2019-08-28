<%-- 
    Document   : modifierarticle
    Created on : 26 août 2019, 22:07:46
    Author     : pauld
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-10 mx-auto">
                    <h2>Formulaire d'ajout d'un article</h2>
                    <hr>
                    <form method="POST" action="modifierarticle">
                        <div class="form-group row">
                            <label for="idArticle" class="col-sm-2 col-form-label">id de l'article</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="idArticle" name="idArticle" value="${articleAModifier.id}" readonly>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="titreArticle" class="col-sm-2 col-form-label">Titre de l'article</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="titreArticle" name="titreArticle" value="${articleAModifier.articleMainTitle}">
                            </div>
                        </div>
                        ​
                        ​
                        <!-- AJOUT DRAG AND DROP POUR LES TAGS -->
                        ​
                        ​
                        ​
                        <div class="form-group row">
                            <label for="photoTitre" class="col-sm-2 col-form-label">Photo Titre</label>
                            <div class="col-sm-10">
                                <input type="file" class="form-control-file" id="photoTitre" name="photoTitre">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="introduction" class="col-sm-2 col-form-label">Introduction</label>
                            <div class="col-sm-10">
                                <textarea class="form-control" id="introduction" rows="3" maxlength="500"></textarea>
                            </div>
                        </div>
                        <hr>
                        <div id="creation1">
                            <div class="form-group row">
                                <label for="inputText1" class="col-sm-2 col-form-label">Titre p1</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputText1" name="titreP1" value="${articleAModifier.articleTitle1}">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exampleFormControlTextarea1" class="col-sm-2 col-form-label">Contenu paragraphe 1</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" id="exampleFormControlTextarea1" name="contenuP1" rows="3">${articleAModifier.articleParagraph1}</textarea>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exampleFormControlFile1" class="col-sm-2 col-form-label">Photo p1</label>
                                <div class="col-sm-10">
                                    <input type="file" class="form-control-file" id="exampleFormControlFile1">
                                </div>
                            </div>
                            <hr>
                        </div>
                        ​
                        <div class="form-group row">
                            <div class="col-sm-10">
                                <button type="submit" class="btn btn-primary">Enregistrer</button>
                            </div>
                        </div>
                    </form>
                    ​
                   
                </div>
            </div>
        </div>
        
    </body>
</html>
