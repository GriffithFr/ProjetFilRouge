/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.dao;

import filrouge.entity.Utilisateur;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pauld
 */
public interface UtilisateurDAOCrud extends CrudRepository<Utilisateur, Long>{
    
    
}
