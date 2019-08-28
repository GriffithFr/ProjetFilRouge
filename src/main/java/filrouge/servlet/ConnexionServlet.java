/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.servlet;

import filrouge.entity.Utilisateur;
import filrouge.service.UtilisateurService;
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
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/connexion"})
public class ConnexionServlet extends AutowireServlet {

    @Autowired
    private UtilisateurService us;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mail = req.getParameter("mail");
        String motDePasse = req.getParameter("motDePasse");

        Utilisateur util = us.connexion(mail, motDePasse);
        System.out.println(util);
        if (util != null) {
            req.getSession().setAttribute("idUtilisateur", util.getId());
            if(util.getEstJournaliste()){
                req.getSession().setAttribute("role", "JOURNALISTE");
            }
        }
        
        resp.sendRedirect("accueil");
    }

}
