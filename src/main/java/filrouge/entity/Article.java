/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mclos
 */
@Entity
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    
    
 
    
    @OneToMany(mappedBy = "article")
    private List<Comment> comments = new ArrayList<>();
    
    @ManyToOne
    private Utilisateur utilisateur;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date articleDate;
    
    private String articleTags;
    
    @Column(nullable = false)
    private String articleMainTitle;
     
    private String articleMainPhoto;

    @Column(nullable = false)
    private String articleTitle1;
    
    @Column(nullable = false)
    private String articleParagraph1;

    private String articlePhoto1;

    private String articleTitle2;
    
    private String articleParagraph2;

    private String articlePhoto2;
    
    private String articleTitle3;
    
    private String articleParagraph3;

    private String articlePhoto3;
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "filrouge.entity.Article[ id=" + id + " ]";
    }


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }

    public String getArticleMainTitle() {
        return articleMainTitle;
    }

    public void setArticleMainTitle(String articleMainTitle) {
        this.articleMainTitle = articleMainTitle;
    }

    public String getArticleMainPhoto() {
        return articleMainPhoto;
    }

    public void setArticleMainPhoto(String articleMainPhoto) {
        this.articleMainPhoto = articleMainPhoto;
    }

    public String getArticleTitle1() {
        return articleTitle1;
    }

    public void setArticleTitle1(String articleTitle1) {
        this.articleTitle1 = articleTitle1;
    }

    public String getArticleParagraph1() {
        return articleParagraph1;
    }

    public void setArticleParagraph1(String articleParagraph1) {
        this.articleParagraph1 = articleParagraph1;
    }

    public String getArticlePhoto1() {
        return articlePhoto1;
    }

    public void setArticlePhoto1(String articlePhoto1) {
        this.articlePhoto1 = articlePhoto1;
    }

    public String getArticleTitle2() {
        return articleTitle2;
    }

    public void setArticleTitle2(String articleTitle2) {
        this.articleTitle2 = articleTitle2;
    }

    public String getArticleParagraph2() {
        return articleParagraph2;
    }

    public void setArticleParagraph2(String articleParagraph2) {
        this.articleParagraph2 = articleParagraph2;
    }

    public String getArticlePhoto2() {
        return articlePhoto2;
    }

    public void setArticlePhoto2(String articlePhoto2) {
        this.articlePhoto2 = articlePhoto2;
    }

    public String getArticleTitle3() {
        return articleTitle3;
    }

    public void setArticleTitle3(String articleTitle3) {
        this.articleTitle3 = articleTitle3;
    }

    public String getArticleParagraph3() {
        return articleParagraph3;
    }

    public void setArticleParagraph3(String articleParagraph3) {
        this.articleParagraph3 = articleParagraph3;
    }

    public String getArticlePhoto3() {
        return articlePhoto3;
    }

    public void setArticlePhoto3(String articlePhoto3) {
        this.articlePhoto3 = articlePhoto3;
    }
    
}
