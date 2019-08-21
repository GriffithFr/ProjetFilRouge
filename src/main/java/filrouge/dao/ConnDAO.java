/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mclos
 */
public class ConnDAO {

    private static final EntityManagerFactory em;

    static {
        em = Persistence.createEntityManagerFactory("PU");
    }
    
    
    public static EntityManager ouvertureEntityManager() {
        return em.createEntityManager();
    }
    
    public static void fermetureEntityManager(){
//        em.close();
    }
}
