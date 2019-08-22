/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.dao;

import filrouge.entity.Comment;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pauld
 */
public interface CommentaireDAOCrud extends CrudRepository<Comment, Long> {

    public List<Comment> findByArticleId(Long idArticle);

    public List<Comment> findByUtilisateurId(Long idUtilisateur);

}
