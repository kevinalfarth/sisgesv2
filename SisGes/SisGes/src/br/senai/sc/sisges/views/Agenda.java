/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisges.views;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "agenda", catalog = "sis_ges", schema = "")
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a")
    , @NamedQuery(name = "Agenda.findByDatCriAge", query = "SELECT a FROM Agenda a WHERE a.agendaPK.datCriAge = :datCriAge")
    , @NamedQuery(name = "Agenda.findByDatComAge", query = "SELECT a FROM Agenda a WHERE a.agendaPK.datComAge = :datComAge")
    , @NamedQuery(name = "Agenda.findByCodColAge", query = "SELECT a FROM Agenda a WHERE a.agendaPK.codColAge = :codColAge")
    , @NamedQuery(name = "Agenda.findByCodEquAge", query = "SELECT a FROM Agenda a WHERE a.agendaPK.codEquAge = :codEquAge")
    , @NamedQuery(name = "Agenda.findByTitAge", query = "SELECT a FROM Agenda a WHERE a.titAge = :titAge")
    , @NamedQuery(name = "Agenda.findByDesAge", query = "SELECT a FROM Agenda a WHERE a.desAge = :desAge")
    , @NamedQuery(name = "Agenda.findByIdCol", query = "SELECT a FROM Agenda a WHERE a.idCol = :idCol")
    , @NamedQuery(name = "Agenda.findByIdEqu", query = "SELECT a FROM Agenda a WHERE a.idEqu = :idEqu")})
public class Agenda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgendaPK agendaPK;
    @Column(name = "titAge")
    private String titAge;
    @Column(name = "desAge")
    private String desAge;
    @Column(name = "idCol")
    private Integer idCol;
    @Column(name = "idEqu")
    private Integer idEqu;

    public Agenda() {
    }

    public Agenda(AgendaPK agendaPK) {
        this.agendaPK = agendaPK;
    }

    public Agenda(String datCriAge, String datComAge, int codColAge, int codEquAge) {
        this.agendaPK = new AgendaPK(datCriAge, datComAge, codColAge, codEquAge);
    }

    public AgendaPK getAgendaPK() {
        return agendaPK;
    }

    public void setAgendaPK(AgendaPK agendaPK) {
        this.agendaPK = agendaPK;
    }

    public String getTitAge() {
        return titAge;
    }

    public void setTitAge(String titAge) {
        String oldTitAge = this.titAge;
        this.titAge = titAge;
        changeSupport.firePropertyChange("titAge", oldTitAge, titAge);
    }

    public String getDesAge() {
        return desAge;
    }

    public void setDesAge(String desAge) {
        String oldDesAge = this.desAge;
        this.desAge = desAge;
        changeSupport.firePropertyChange("desAge", oldDesAge, desAge);
    }

    public Integer getIdCol() {
        return idCol;
    }

    public void setIdCol(Integer idCol) {
        Integer oldIdCol = this.idCol;
        this.idCol = idCol;
        changeSupport.firePropertyChange("idCol", oldIdCol, idCol);
    }

    public Integer getIdEqu() {
        return idEqu;
    }

    public void setIdEqu(Integer idEqu) {
        Integer oldIdEqu = this.idEqu;
        this.idEqu = idEqu;
        changeSupport.firePropertyChange("idEqu", oldIdEqu, idEqu);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agendaPK != null ? agendaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.agendaPK == null && other.agendaPK != null) || (this.agendaPK != null && !this.agendaPK.equals(other.agendaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.senai.sc.sisges.views.Agenda[ agendaPK=" + agendaPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
