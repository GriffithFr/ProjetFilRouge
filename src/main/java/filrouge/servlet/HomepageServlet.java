/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.servlet;

import filrouge.entity.Utilisateur;
import filrouge.service.ArticleService;
import filrouge.service.UtilisateurService;
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
@WebServlet(name = "HomepageServlet", urlPatterns = {"/homepage"})
public class HomepageServlet extends AutowireServlet {

    @Autowired
    private UtilisateurService us;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String [] mesPays = {"France", "Espagne", "Suisse"};
        
        req.setAttribute("msg", "Message vers la JSP");
        req.setAttribute("pays", mesPays);
        
        // Appel services au besoin
        Utilisateur u = new Utilisateur();
        u.setUserName("Tom");
        u.setUserMail("paul@paul.mail");
        u.setUserPassword("Bonjour12+");
        us.creerUtilisateur(u);
        
        List<Utilisateur> test = us.rechercherTousLesUtilisateur();
        
        req.setAttribute("test", test);

        // Renvoi vers une bue (JSP)
        req.getRequestDispatcher("homepage.jsp").forward(req, resp);
    }

}
