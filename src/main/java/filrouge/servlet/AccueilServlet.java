/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.servlet;

import filrouge.spring.AutowireServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pauld
 */

@WebServlet(name = "AccueilServlet", urlPatterns = {"/accueil"})
public class AccueilServlet extends AutowireServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        System.out.println("id " + req.getSession().getAttribute("idUtilisateur"));
        System.out.println("role " + req.getSession().getAttribute("role"));
        req.getRequestDispatcher("accueil.jsp").forward(req, resp);
        
    }

    

}
