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
@WebServlet(name = "AjouterUtilisateurServlet", urlPatterns = {"/ajouterutilisateur"})
public class AjouterUtilisateurServlet extends AutowireServlet {

    @Autowired
    private UtilisateurService us;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("ajouterutilisateur.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Utilisateur util = new Utilisateur();

        util.setUserName(req.getParameter("nom"));
        util.setUserMail(req.getParameter("mail"));
        util.setUserPassword(req.getParameter("motDePasse"));
        util.setEstJournaliste(true);

        us.creerUtilisateur(util);

        Utilisateur u = us.connexion(req.getParameter("mail"), req.getParameter("motDePasse"));

        req.getSession().setAttribute("idUtilisateur", u.getId());
        if (u.getEstJournaliste()) {
            req.getSession().setAttribute("role", "JOURNALISTE");
        }

        resp.sendRedirect("accueil");
    }

}
