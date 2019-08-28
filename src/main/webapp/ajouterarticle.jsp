<%-- 
    Document   : ajouterarticle
    Created on : 26 août 2019, 15:33:41
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
                    <form method="POST" action="ajouterarticle">
                        <div class="form-group row">
                            <label for="titreArticle" class="col-sm-2 col-form-label">Titre de l'article</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="titreArticle" name="titreArticle">
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
                                    <input type="text" class="form-control" id="inputText1" name="titreP1" placeholder="Titre du premier paragraphe">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exampleFormControlTextarea1" class="col-sm-2 col-form-label">Contenu paragraphe 1</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" id="exampleFormControlTextarea1" name="contenuP1" rows="3"></textarea>
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
                        <div id="creation2" style="display: none;">
                            <div class="form-group row">
                                <label for="inputText2" class="col-sm-2 col-form-label">Titre p2</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputText2" placeholder="Titre du deuxième paragraphe">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exampleFormControlTextarea2" class="col-sm-2 col-form-label">Titre p2</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" id="exampleFormControlTextarea2" rows="3"></textarea>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exampleFormControlFile2" class="col-sm-2 col-form-label">Photo p2</label>
                                <div class="col-sm-10">
                                    <input type="file" class="form-control-file" id="exampleFormControlFile1">
                                </div>
                            </div>
                            <hr>
                        </div>
                        ​
                        <div id="creation3" style="display: none;">
                            <div class="form-group row">
                                <label for="inputText3" class="col-sm-2 col-form-label">Titre p3</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputText3" placeholder="Titre du troisième paragraphe">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exampleFormControlTextarea3" class="col-sm-2 col-form-label">Titre p3</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" id="exampleFormControlTextarea3" rows="3"></textarea>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exampleFormControlFile3" class="col-sm-2 col-form-label">Photo p3</label>
                                <div class="col-sm-10">
                                    <input type="file" class="form-control-file" id="exampleFormControlFile1">
                                </div>
                            </div>
                            <hr>
                        </div>
                        ​
                        ​
                        <div class="form-group row">
                            <div class="col-sm-10">
                                <button type="submit" class="btn btn-primary">Enregistrer</button>
                            </div>
                        </div>
                    </form>
                    ​
                    <label for="selectNbrP">Selectionnez le nombre de paragraphes</label>
                    <select class="form-control" id="selectNbrP" style="width: 200px; display: inline-block;">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                    </select>
                    <button onclick="nbrParagraphe()">Validez </button>
                </div>
            </div>
        </div>
        <script>
            function nbrParagraphe() {
                var nbr = document.getElementById("selectNbrP").value;
                if (nbr == 1) {
                    document.getElementById("creation1").style.display = "block";
                    document.getElementById("creation2").style.display = "none";
                    document.getElementById("creation3").style.display = "none";
                } else if (nbr == 2) {
                    document.getElementById("creation1").style.display = "block";
                    document.getElementById("creation2").style.display = "block";
                    document.getElementById("creation3").style.display = "none";
                } else if (nbr == 3) {
                    document.getElementById("creation1").style.display = "block";
                    document.getElementById("creation2").style.display = "block";
                    document.getElementById("creation3").style.display = "block";
                }

            }
        </script>
    </body>
</html>
