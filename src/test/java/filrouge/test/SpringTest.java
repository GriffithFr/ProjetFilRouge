/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.test;

import filrouge.dao.ArticleDAOCrud;
import filrouge.dao.CommentaireDAOCrud;
import filrouge.dao.UtilisateurDAOCrud;
import filrouge.entity.Article;
import filrouge.entity.Comment;
import filrouge.entity.Utilisateur;
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
 * @author pauld
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Rollback(false)
public class SpringTest {

    @Autowired
    private UtilisateurDAOCrud daoU;

    @Autowired
    private CommentaireDAOCrud daoC;

    @Autowired
    private ArticleDAOCrud daoA;

    
    @Test
    @Transactional
    public void creerUtilisateurOK() {

        Utilisateur u = new Utilisateur();
        u.setUserName("Paul");
        u.setUserMail("paul@paul.mail");
        u.setUserPassword("1234");
        daoU.save(u);

    }

    
    @Test
    @Transactional
    public void creerCommentaireOK() {

        Utilisateur u = new Utilisateur();
        u.setUserName("UComment");
        u.setUserMail("comment@comment.mail");
        u.setUserPassword("1234");
        daoU.save(u);
        
        Article a = new Article();
        a.setArticleTags("COMENNTAIRE tag, tag, tag");
        a.setArticleMainPhoto("COMENNTAIRE urlmainphoto.png");
        a.setArticleMainTitle("COMENNTAIRE titre principal article");
        a.setArticleTitle1("COMENNTAIRE titre paragraphe 1");
        a.setArticleParagraph1("COMENNTAIRE contenu paragraphe 1");
        daoA.save(a);
        
        Comment c = new Comment();
        c.setUtilisateur(u);
        c.setArticle(a);
        c.setCommentContain("contenu commenaire");
        
        daoC.save(c);

    }

    @Test
    @Transactional
    public void creerArticleOK() {

        Article a = new Article();
        a.setArticleTags("tag, tag, tag");
        a.setArticleMainPhoto("urlmainphoto.png");
        a.setArticleMainTitle("titre principal article");
        a.setArticleTitle1("titre paragraphe 1");
        a.setArticleParagraph1("contenu paragraphe 1");
        daoA.save(a);

    }



}
