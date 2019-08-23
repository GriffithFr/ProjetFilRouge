/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.test;

import filrouge.entity.Utilisateur;
import filrouge.service.UtilisateurService;
import filrouge.spring.SpringConfig;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mclos
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Rollback(false)
@Transactional
public class UtilisateurServiceTest {

    @Autowired
    private UtilisateurService us;

    @Test
    public void creerUtilisateurOK() {
        Utilisateur u = new Utilisateur();
        u.setUserName("Paul");
        u.setUserMail("paul@paul.mail");
        u.setUserPassword("Bonjour12+");
        us.creerUtilisateur(u);
    }

    @Test(expected = RuntimeException.class)
    public void creerUtilisateurKO() {
        Utilisateur u = new Utilisateur();
        u.setUserName("Paul");
        u.setUserMail("paul@paul.mail");
        u.setUserPassword("1235");
        us.creerUtilisateur(u);
    }
    
    @Test
    public void identifiantValide(){
        Utilisateur u = new Utilisateur();
        u.setUserName("Mickael");
        u.setUserMail("mickael@mickael.mail");
        u.setUserPassword("Bonjour12+");
        us.creerUtilisateur(u);
        
        String mail = "mickael@mickael.mail";
        String motDePasse = "Bonjour12+";
        
        System.out.println(us.connexion(mail, motDePasse));
        
    }

}
