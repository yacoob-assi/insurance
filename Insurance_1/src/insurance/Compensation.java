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
@Table(name = "COMPENSATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compensation.findAll", query = "SELECT c FROM Compensation c")
    , @NamedQuery(name = "Compensation.findBySsn", query = "SELECT c FROM Compensation c WHERE c.ssn = :ssn")
    , @NamedQuery(name = "Compensation.findByVechileNum", query = "SELECT c FROM Compensation c WHERE c.vechileNum = :vechileNum")
    , @NamedQuery(name = "Compensation.findByAmountPaid", query = "SELECT c FROM Compensation c WHERE c.amountPaid = :amountPaid")
    , @NamedQuery(name = "Compensation.findByDatePaid", query = "SELECT c FROM Compensation c WHERE c.datePaid = :datePaid")})
public class Compensation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private Long ssn;
    @Column(name = "VECHILE_NUM")
    private Integer vechileNum;
    @Column(name = "AMOUNT_PAID")
    private Long amountPaid;
    @Column(name = "DATE_PAID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePaid;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Memsignup memsignup;

    public Compensation() {
    }

    public Compensation(Long ssn) {
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

    public Long getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Long amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
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
        if (!(object instanceof Compensation)) {
            return false;
        }
        Compensation other = (Compensation) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.Compensation[ ssn=" + ssn + " ]";
    }
    
}
