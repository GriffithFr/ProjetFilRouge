/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.servlet;

import filrouge.entity.Article;
import filrouge.entity.Utilisateur;
import filrouge.service.ArticleService;
import filrouge.service.UtilisateurService;
import filrouge.spring.AutowireServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mikael
 */
@WebServlet(name = "AccueilServlet", urlPatterns = {"/accueil"})
public class AccueilServlet extends AutowireServlet {

    @Autowired
    private ArticleService as;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Article> art = as.rechercherTousLesArticles();
//        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM-yyyy");
      
        req.setAttribute("articles", art);

        req.getRequestDispatcher("accueil.jsp").forward(req, resp);
    }

}
