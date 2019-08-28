/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.service;

import filrouge.dao.UtilisateurDAOCrud;
import filrouge.entity.Utilisateur;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author pauld
 */
@Service
@Transactional
public class UtilisateurService {

    @Autowired
    private UtilisateurDAOCrud daoU;

    private static Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%+]).{6,15})");

    public static boolean validatePassword(String motDePasse) {

        Matcher mtch = pswNamePtrn.matcher(motDePasse);
        if (mtch.matches()) {
            return true;
        }
        return false;
    }

    public void creerUtilisateur(Utilisateur u) {
        // code metier
        String pwd = u.getUserPassword();
        Boolean valide = validatePassword(pwd);
        //Boolean valide = true;

        if (valide) {
            //dao
            daoU.save(u);
        } else {
            throw new RuntimeException("Mot de passe incorrect");
        }

    }

    public void modifierUtilisateur(Utilisateur u) {
        // code metier
        String pwd = u.getUserPassword();
        Boolean valide = validatePassword(pwd);

        if (valide) {
            //dao
            daoU.save(u);
        } else {
            throw new RuntimeException("Mot de passe incorrect");
        }

    }

    public void supprimerUtilisateur(Utilisateur u) {
        daoU.delete(u);
    }

    public Utilisateur rechercherUtilisateurParId(Long id) {
        return daoU.findOne(id);
    }

    public Utilisateur connexion(String mail, String password) {
        return daoU.findByUserMailAndUserPassword(mail, password);
    }
    
    public List<Utilisateur> rechercherTousLesUtilisateur() {

        return daoU.findAll();
    }
}
