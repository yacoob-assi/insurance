/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ra'ed Khwayreh
 */
@Entity
@Table(name = "DAMAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Damage_1.findAll", query = "SELECT d FROM Damage_1 d")
    , @NamedQuery(name = "Damage_1.findBySsn", query = "SELECT d FROM Damage_1 d WHERE d.ssn = :ssn")
    , @NamedQuery(name = "Damage_1.findByVechileNum", query = "SELECT d FROM Damage_1 d WHERE d.vechileNum = :vechileNum")
    , @NamedQuery(name = "Damage_1.findByAmountDamage", query = "SELECT d FROM Damage_1 d WHERE d.amountDamage = :amountDamage")
    , @NamedQuery(name = "Damage_1.findByDateDamage", query = "SELECT d FROM Damage_1 d WHERE d.dateDamage = :dateDamage")})
public class Damage_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private Long ssn;
    @Column(name = "VECHILE_NUM")
    private Integer vechileNum;
    @Column(name = "AMOUNT_DAMAGE")
    private Integer amountDamage;
    @Column(name = "DATE_DAMAGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDamage;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Memsignup memsignup;

    public Damage_1() {
    }

    public Damage_1(Long ssn) {
        this.ssn = ssn;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public Integer getVechileNum() {
        return vechileNum;
    }

    public void setVechileNum(Integer vechileNum) {
        this.vechileNum = vechileNum;
    }

    public Integer getAmountDamage() {
        return amountDamage;
    }

    public void setAmountDamage(Integer amountDamage) {
        this.amountDamage = amountDamage;
    }

    public Date getDateDamage() {
        return dateDamage;
    }

    public void setDateDamage(Date dateDamage) {
        this.dateDamage = dateDamage;
    }

    public Memsignup getMemsignup() {
        return memsignup;
    }

    public void setMemsignup(Memsignup memsignup) {
        this.memsignup = memsignup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ssn != null ? ssn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Damage_1)) {
            return false;
        }
        Damage_1 other = (Damage_1) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.Damage_1[ ssn=" + ssn + " ]";
    }
    
}
