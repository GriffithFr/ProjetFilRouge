/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.dao;

import filrouge.entity.Article;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pauld
 */
public interface ArticleDAOCrud extends CrudRepository<Article, Long>{
    
    public List<Article> findByArticleTags(String tag);
    
    public List<Article> findByUtilisateurId(Long idUtilisateur);
    
}
