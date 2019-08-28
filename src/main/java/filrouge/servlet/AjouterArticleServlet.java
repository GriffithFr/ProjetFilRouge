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
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author pauld
 */
@WebServlet(name = "AjouterArticleServlet", urlPatterns = {"/ajouterarticle"})
public class AjouterArticleServlet extends AutowireServlet {

    @Autowired
    private ArticleService as;
    
    @Autowired
    private UtilisateurService us;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajouterarticle.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Article art = new Article();

        art.setArticleMainTitle(req.getParameter("titreArticle"));
        art.setArticleTitle1(req.getParameter("titreP1"));
        art.setArticleParagraph1(req.getParameter("contenuP1"));
        art.setArticleDate(new Date());
        
        Long id = (Long) req.getSession().getAttribute("idUtilisateur");
        Utilisateur util = us.rechercherUtilisateurParId(id);
        art.setUtilisateur(util);
        
        as.creerArticle(art);
        
        resp.sendRedirect("listearticle");

    }

}
