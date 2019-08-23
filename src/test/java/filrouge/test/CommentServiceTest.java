/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.test;

import filrouge.entity.Comment;
import filrouge.service.CommentService;
import filrouge.spring.SpringConfig;
import org.junit.Test;
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
public class CommentServiceTest {

    @Autowired
    private CommentService cs;

    @Test
    public void creerCommentTestOK() {
        Comment c = new Comment();
        c.setCommentContain("Bonjour espece de sale nazi");
        cs.creerComment(c);
    }

    @Test(expected = RuntimeException.class)
    public void creerCommentTestKO() {
        Comment c = new Comment();
        c.setCommentContain("bite");
        cs.creerComment(c);
    }
}
