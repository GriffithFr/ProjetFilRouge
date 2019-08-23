/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.service;

import filrouge.dao.CommentaireDAOCrud;
import filrouge.entity.Comment;
import filrouge.entity.Utilisateur;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mclos
 */
@Service
@Transactional
public class CommentService {

    @Autowired
    private CommentaireDAOCrud daoCom;

    private static Pattern comPtrn = Pattern.compile("\\bbite\\b");
    ;
    
      public void supprimerComment(Comment c) {
        daoCom.delete(c);
    }

    public void rechercherCommentParArticle(Long id) {
        daoCom.findOne(id);
    }
      
     public void rechercherCommentParUtilisateur(Long id) {
        daoCom.findOne(id);
    }
     
    public static boolean validateComment(String censure) {

        Matcher mtch = comPtrn.matcher(censure);
        if (mtch.matches()) {
            return true;
        }
        return false;
    }

    public void creerComment(Comment c) {
        // code metier
        String censure = c.getCommentContain();
        Boolean valide = validateComment(censure);

        if (valide) {
            //dao
            throw new RuntimeException("Pas d insulte SVP");

        } else {
            daoCom.save(c);
        }

    }

}
