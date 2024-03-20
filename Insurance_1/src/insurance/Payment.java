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
@Table(name = "PAYMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p")
    , @NamedQuery(name = "Payment.findByFirstName", query = "SELECT p FROM Payment p WHERE p.firstName = :firstName")
    , @NamedQuery(name = "Payment.findByLastName", query = "SELECT p FROM Payment p WHERE p.lastName = :lastName")
    , @NamedQuery(name = "Payment.findBySsn", query = "SELECT p FROM Payment p WHERE p.ssn = :ssn")
    , @NamedQuery(name = "Payment.findByAmountHePaid", query = "SELECT p FROM Payment p WHERE p.amountHePaid = :amountHePaid")
    , @NamedQuery(name = "Payment.findByDateP", query = "SELECT p FROM Payment p WHERE p.dateP = :dateP")})
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private Long ssn;
    @Column(name = "AMOUNT_HE_PAID")
    private Integer amountHePaid;
    @Column(name = "DATE_P")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateP;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Memsignup memsignup;

    public Payment() {
    }

    public Payment(Long ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public Integer getAmountHePaid() {
        return amountHePaid;
    }

    public void setAmountHePaid(Integer amountHePaid) {
        this.amountHePaid = amountHePaid;
    }

    public Date getDateP() {
        return dateP;
    }

    public void setDateP(Date dateP) {
        this.dateP = dateP;
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
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.Payment[ ssn=" + ssn + " ]";
    }
    
}
