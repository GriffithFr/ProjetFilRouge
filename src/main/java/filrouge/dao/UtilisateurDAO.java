/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.dao;

import filrouge.entity.Utilisateur;
import javax.persistence.EntityManager;

/**
 *
 * @author mclos
 */
public class UtilisateurDAO {

    public void creerUtilisateur(Utilisateur u) {

        EntityManager em = ConnDAO.ouvertureEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        ConnDAO.fermetureEntityManager();
    }

    public void modifierUtilisateur(Utilisateur u) {

        EntityManager em = ConnDAO.ouvertureEntityManager();
        em.getTransaction().begin();
        em.merge(u);
        em.getTransaction().commit();
        ConnDAO.fermetureEntityManager();
    }

    public void supprimerUtilisateur(long id) {

        EntityManager em = ConnDAO.ouvertureEntityManager();

        em.getTransaction().begin();
        Utilisateur u = em.find(Utilisateur.class, id);
        em.remove(u);
        em.getTransaction().commit();
        ConnDAO.fermetureEntityManager();
    }

    public Utilisateur rechercherUtilisateurParId(Long id) {
        EntityManager em = ConnDAO.ouvertureEntityManager();

        Utilisateur u = em.find(Utilisateur.class, (long) id);
        ConnDAO.fermetureEntityManager();
        return u;
    }
}

///        Film f=em.find(Film.class, (long)1);
//        em.getTransaction().begin();
////        Pour supprimer l'objet selection dans la BD
//        em.remove(f);
//          em.getTransaction().commit();
