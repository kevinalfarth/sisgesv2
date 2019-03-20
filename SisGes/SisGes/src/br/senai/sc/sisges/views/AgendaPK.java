/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisges.views;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Aluno
 */
@Embeddable
public class AgendaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "datCriAge")
    private String datCriAge;
    @Basic(optional = false)
    @Column(name = "datComAge")
    private String datComAge;
    @Basic(optional = false)
    @Column(name = "codColAge")
    private int codColAge;
    @Basic(optional = false)
    @Column(name = "codEquAge")
    private int codEquAge;

    public AgendaPK() {
    }

    public AgendaPK(String datCriAge, String datComAge, int codColAge, int codEquAge) {
        this.datCriAge = datCriAge;
        this.datComAge = datComAge;
        this.codColAge = codColAge;
        this.codEquAge = codEquAge;
    }

    public String getDatCriAge() {
        return datCriAge;
    }

    public void setDatCriAge(String datCriAge) {
        this.datCriAge = datCriAge;
    }

    public String getDatComAge() {
        return datComAge;
    }

    public void setDatComAge(String datComAge) {
        this.datComAge = datComAge;
    }

    public int getCodColAge() {
        return codColAge;
    }

    public void setCodColAge(int codColAge) {
        this.codColAge = codColAge;
    }

    public int getCodEquAge() {
        return codEquAge;
    }

    public void setCodEquAge(int codEquAge) {
        this.codEquAge = codEquAge;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datCriAge != null ? datCriAge.hashCode() : 0);
        hash += (datComAge != null ? datComAge.hashCode() : 0);
        hash += (int) codColAge;
        hash += (int) codEquAge;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgendaPK)) {
            return false;
        }
        AgendaPK other = (AgendaPK) object;
        if ((this.datCriAge == null && other.datCriAge != null) || (this.datCriAge != null && !this.datCriAge.equals(other.datCriAge))) {
            return false;
        }
        if ((this.datComAge == null && other.datComAge != null) || (this.datComAge != null && !this.datComAge.equals(other.datComAge))) {
            return false;
        }
        if (this.codColAge != other.codColAge) {
            return false;
        }
        if (this.codEquAge != other.codEquAge) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.senai.sc.sisges.views.AgendaPK[ datCriAge=" + datCriAge + ", datComAge=" + datComAge + ", codColAge=" + codColAge + ", codEquAge=" + codEquAge + " ]";
    }
    
}
