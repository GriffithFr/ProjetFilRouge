/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.servlet;

import filrouge.entity.Article;
import filrouge.service.ArticleService;
import filrouge.spring.AutowireServlet;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ModifierArticleServlet", urlPatterns = {"/modifierarticle"})
public class ModifierArticleServlet extends AutowireServlet {

    @Autowired
    private ArticleService as;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         Long id = Long.parseLong(req.getParameter("idAModifier"));
         
         Article art = as.rechercherArticleParId(id);
         
         req.setAttribute("articleAModifier", art);
         
         req.getRequestDispatcher("modifierarticle.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
        Article art = as.rechercherArticleParId(Long.parseLong(req.getParameter("idArticle")));
        
        art.setArticleMainTitle(req.getParameter("titreArticle"));
        art.setArticleTitle1(req.getParameter("titreP1"));
        art.setArticleParagraph1(req.getParameter("contenuP1"));
        
        as.modifierArticle(art);
        
        resp.sendRedirect("listearticle");
    }
    
    

}
