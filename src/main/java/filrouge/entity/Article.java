/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Long getId() {
        return id;
    }
    
    
//     // MappedBy pour dire que la liste film pointe vers la liste réalisateur et qu'ils ont la table intermédiaire commune
//    @ManyToMany(mappedBy = "realisateurs")
//    private List<Film> films = new ArrayList<>();
    
    
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date articleDate;
    
    @Column(nullable = false)
    private String articleTags;
    
    @Column(nullable = false)
    private String articleMainTitle;
     
    @Column(nullable = false)
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
    
}
