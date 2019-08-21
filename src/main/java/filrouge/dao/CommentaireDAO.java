/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.dao;

import filrouge.entity.Comment;
import javax.persistence.EntityManager;

/**
 *
 * @author mclos
 */
public class CommentaireDAO {
    
    public void creerCommentaire(Comment c) {
        EntityManager em = ConnDAO.ouvertureEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        ConnDAO.fermetureEntityManager();
    }
    
    public void supprimerCommentaire (long id){
        EntityManager em = ConnDAO.ouvertureEntityManager();
        em.getTransaction().begin();
        Comment c = em.find(Comment.class, id);
        em.remove(c);
        em.getTransaction().commit();
        ConnDAO.fermetureEntityManager();
        
    }
}
