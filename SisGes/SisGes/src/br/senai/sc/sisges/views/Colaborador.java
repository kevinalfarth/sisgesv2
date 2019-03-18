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
@Table(name = "colaborador", catalog = "sis_ges", schema = "")
@NamedQueries({
    @NamedQuery(name = "Colaborador.findAll", query = "SELECT c FROM Colaborador c")
    , @NamedQuery(name = "Colaborador.findByIdCol", query = "SELECT c FROM Colaborador c WHERE c.idCol = :idCol")
    , @NamedQuery(name = "Colaborador.findByNomCol", query = "SELECT c FROM Colaborador c WHERE c.nomCol = :nomCol")
    , @NamedQuery(name = "Colaborador.findByEndCol", query = "SELECT c FROM Colaborador c WHERE c.endCol = :endCol")
    , @NamedQuery(name = "Colaborador.findByNumCol", query = "SELECT c FROM Colaborador c WHERE c.numCol = :numCol")
    , @NamedQuery(name = "Colaborador.findByBaiCol", query = "SELECT c FROM Colaborador c WHERE c.baiCol = :baiCol")
    , @NamedQuery(name = "Colaborador.findByCepCol", query = "SELECT c FROM Colaborador c WHERE c.cepCol = :cepCol")
    , @NamedQuery(name = "Colaborador.findByComCol", query = "SELECT c FROM Colaborador c WHERE c.comCol = :comCol")
    , @NamedQuery(name = "Colaborador.findByCpfCol", query = "SELECT c FROM Colaborador c WHERE c.cpfCol = :cpfCol")
    , @NamedQuery(name = "Colaborador.findByCelCol", query = "SELECT c FROM Colaborador c WHERE c.celCol = :celCol")
    , @NamedQuery(name = "Colaborador.findByTipoCol", query = "SELECT c FROM Colaborador c WHERE c.tipoCol = :tipoCol")
    , @NamedQuery(name = "Colaborador.findByUsuCol", query = "SELECT c FROM Colaborador c WHERE c.usuCol = :usuCol")
    , @NamedQuery(name = "Colaborador.findBySenCol", query = "SELECT c FROM Colaborador c WHERE c.senCol = :senCol")
    , @NamedQuery(name = "Colaborador.findByUltAcCol", query = "SELECT c FROM Colaborador c WHERE c.ultAcCol = :ultAcCol")
    , @NamedQuery(name = "Colaborador.findByEquCol", query = "SELECT c FROM Colaborador c WHERE c.equCol = :equCol")
    , @NamedQuery(name = "Colaborador.findByDddCol", query = "SELECT c FROM Colaborador c WHERE c.dddCol = :dddCol")
    , @NamedQuery(name = "Colaborador.findByEquipeidEqui", query = "SELECT c FROM Colaborador c WHERE c.equipeidEqui = :equipeidEqui")})
public class Colaborador implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCol")
    private Integer idCol;
    @Column(name = "nomCol")
    private String nomCol;
    @Column(name = "endCol")
    private String endCol;
    @Column(name = "numCol")
    private Integer numCol;
    @Column(name = "baiCol")
    private String baiCol;
    @Column(name = "cepCol")
    private String cepCol;
    @Column(name = "comCol")
    private String comCol;
    @Column(name = "cpfCol")
    private String cpfCol;
    @Column(name = "celCol")
    private Integer celCol;
    @Column(name = "tipoCol")
    private String tipoCol;
    @Column(name = "usuCol")
    private String usuCol;
    @Column(name = "senCol")
    private String senCol;
    @Column(name = "ultAcCol")
    private String ultAcCol;
    @Column(name = "equCol")
    private String equCol;
    @Column(name = "dddCol")
    private Integer dddCol;
    @Column(name = "Equipe_idEqui")
    private Integer equipeidEqui;

    public Colaborador() {
    }

    public Colaborador(Integer idCol) {
        this.idCol = idCol;
    }

    public Integer getIdCol() {
        return idCol;
    }

    public void setIdCol(Integer idCol) {
        Integer oldIdCol = this.idCol;
        this.idCol = idCol;
        changeSupport.firePropertyChange("idCol", oldIdCol, idCol);
    }

    public String getNomCol() {
        return nomCol;
    }

    public void setNomCol(String nomCol) {
        String oldNomCol = this.nomCol;
        this.nomCol = nomCol;
        changeSupport.firePropertyChange("nomCol", oldNomCol, nomCol);
    }

    public String getEndCol() {
        return endCol;
    }

    public void setEndCol(String endCol) {
        String oldEndCol = this.endCol;
        this.endCol = endCol;
        changeSupport.firePropertyChange("endCol", oldEndCol, endCol);
    }

    public Integer getNumCol() {
        return numCol;
    }

    public void setNumCol(Integer numCol) {
        Integer oldNumCol = this.numCol;
        this.numCol = numCol;
        changeSupport.firePropertyChange("numCol", oldNumCol, numCol);
    }

    public String getBaiCol() {
        return baiCol;
    }

    public void setBaiCol(String baiCol) {
        String oldBaiCol = this.baiCol;
        this.baiCol = baiCol;
        changeSupport.firePropertyChange("baiCol", oldBaiCol, baiCol);
    }

    public String getCepCol() {
        return cepCol;
    }

    public void setCepCol(String cepCol) {
        String oldCepCol = this.cepCol;
        this.cepCol = cepCol;
        changeSupport.firePropertyChange("cepCol", oldCepCol, cepCol);
    }

    public String getComCol() {
        return comCol;
    }

    public void setComCol(String comCol) {
        String oldComCol = this.comCol;
        this.comCol = comCol;
        changeSupport.firePropertyChange("comCol", oldComCol, comCol);
    }

    public String getCpfCol() {
        return cpfCol;
    }

    public void setCpfCol(String cpfCol) {
        String oldCpfCol = this.cpfCol;
        this.cpfCol = cpfCol;
        changeSupport.firePropertyChange("cpfCol", oldCpfCol, cpfCol);
    }

    public Integer getCelCol() {
        return celCol;
    }

    public void setCelCol(Integer celCol) {
        Integer oldCelCol = this.celCol;
        this.celCol = celCol;
        changeSupport.firePropertyChange("celCol", oldCelCol, celCol);
    }

    public String getTipoCol() {
        return tipoCol;
    }

    public void setTipoCol(String tipoCol) {
        String oldTipoCol = this.tipoCol;
        this.tipoCol = tipoCol;
        changeSupport.firePropertyChange("tipoCol", oldTipoCol, tipoCol);
    }

    public String getUsuCol() {
        return usuCol;
    }

    public void setUsuCol(String usuCol) {
        String oldUsuCol = this.usuCol;
        this.usuCol = usuCol;
        changeSupport.firePropertyChange("usuCol", oldUsuCol, usuCol);
    }

    public String getSenCol() {
        return senCol;
    }

    public void setSenCol(String senCol) {
        String oldSenCol = this.senCol;
        this.senCol = senCol;
        changeSupport.firePropertyChange("senCol", oldSenCol, senCol);
    }

    public String getUltAcCol() {
        return ultAcCol;
    }

    public void setUltAcCol(String ultAcCol) {
        String oldUltAcCol = this.ultAcCol;
        this.ultAcCol = ultAcCol;
        changeSupport.firePropertyChange("ultAcCol", oldUltAcCol, ultAcCol);
    }

    public String getEquCol() {
        return equCol;
    }

    public void setEquCol(String equCol) {
        String oldEquCol = this.equCol;
        this.equCol = equCol;
        changeSupport.firePropertyChange("equCol", oldEquCol, equCol);
    }

    public Integer getDddCol() {
        return dddCol;
    }

    public void setDddCol(Integer dddCol) {
        Integer oldDddCol = this.dddCol;
        this.dddCol = dddCol;
        changeSupport.firePropertyChange("dddCol", oldDddCol, dddCol);
    }

    public Integer getEquipeidEqui() {
        return equipeidEqui;
    }

    public void setEquipeidEqui(Integer equipeidEqui) {
        Integer oldEquipeidEqui = this.equipeidEqui;
        this.equipeidEqui = equipeidEqui;
        changeSupport.firePropertyChange("equipeidEqui", oldEquipeidEqui, equipeidEqui);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCol != null ? idCol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colaborador)) {
            return false;
        }
        Colaborador other = (Colaborador) object;
        if ((this.idCol == null && other.idCol != null) || (this.idCol != null && !this.idCol.equals(other.idCol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.senai.sc.sisges.views.Colaborador[ idCol=" + idCol + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
