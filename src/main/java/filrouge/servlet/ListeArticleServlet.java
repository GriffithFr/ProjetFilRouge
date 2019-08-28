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
import java.util.List;
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
@WebServlet(name = "ListeArticleServlet", urlPatterns = {"/listearticle"})
public class ListeArticleServlet extends AutowireServlet {

    @Autowired
    private ArticleService as;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        List<Article> tousLesArticles = as.rechercherTousLesArticles();
        
        req.setAttribute("listeArticles", tousLesArticles);
        
        req.getRequestDispatcher("listearticle.jsp").forward(req, resp);
        
    }
}
