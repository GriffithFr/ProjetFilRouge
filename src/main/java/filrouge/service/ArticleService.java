/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.service;

import filrouge.dao.ArticleDAOCrud;
import filrouge.entity.Article;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mclos
 */
@Service
@Transactional
public class ArticleService {

    @Autowired
    private ArticleDAOCrud daoArt;

    public void creerArticle(Article a) {
        // code metier
        daoArt.save(a);
    }

    public void modifierArticle(Article a) {
        // code metier
        daoArt.save(a);
    }

    public void supprimerArticle(Article a) {
        // code metier
        daoArt.delete(a);
    }

    public List<Article> rechercherTousLesArticles() {

        return daoArt.findAll();
    }

    public List<Article> rechercherArticleParTags(String tag) {

        return daoArt.findByArticleTags(tag);
    }

    public List<Article> rechercherArticleParUtilisateur(Long id) {
        return daoArt.findByUtilisateurId(id);
    }
    
     public Article rechercherArticleParId(Long id) {
        return daoArt.findOne(id);
    }
    
    
}
