/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisges.views;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "equipe", catalog = "sis_ges", schema = "")
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM Equipe e")
    , @NamedQuery(name = "Equipe.findByIdEqu", query = "SELECT e FROM Equipe e WHERE e.idEqu = :idEqu")
    , @NamedQuery(name = "Equipe.findByNomEqu", query = "SELECT e FROM Equipe e WHERE e.nomEqu = :nomEqu")
    , @NamedQuery(name = "Equipe.findByDesEqu", query = "SELECT e FROM Equipe e WHERE e.desEqu = :desEqu")})
public class Equipe implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEqu")
    private Integer idEqu;
    @Column(name = "nomEqu")
    private String nomEqu;
    @Column(name = "desEqu")
    private String desEqu;

    public Equipe() {
    }

    public Equipe(Integer idEqu) {
        this.idEqu = idEqu;
    }

    public Integer getIdEqu() {
        return idEqu;
    }

    public void setIdEqu(Integer idEqu) {
        Integer oldIdEqu = this.idEqu;
        this.idEqu = idEqu;
        changeSupport.firePropertyChange("idEqu", oldIdEqu, idEqu);
    }

    public String getNomEqu() {
        return nomEqu;
    }

    public void setNomEqu(String nomEqu) {
        String oldNomEqu = this.nomEqu;
        this.nomEqu = nomEqu;
        changeSupport.firePropertyChange("nomEqu", oldNomEqu, nomEqu);
    }

    public String getDesEqu() {
        return desEqu;
    }

    public void setDesEqu(String desEqu) {
        String oldDesEqu = this.desEqu;
        this.desEqu = desEqu;
        changeSupport.firePropertyChange("desEqu", oldDesEqu, desEqu);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEqu != null ? idEqu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.idEqu == null && other.idEqu != null) || (this.idEqu != null && !this.idEqu.equals(other.idEqu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.senai.sc.sisges.views.Equipe[ idEqu=" + idEqu + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
