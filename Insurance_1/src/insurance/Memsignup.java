/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ra'ed Khwayreh
 */
@Entity
@Table(name = "MEMSIGNUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memsignup.findAll", query = "SELECT m FROM Memsignup m")
    , @NamedQuery(name = "Memsignup.findByFirstName", query = "SELECT m FROM Memsignup m WHERE m.firstName = :firstName")
    , @NamedQuery(name = "Memsignup.findByMidName", query = "SELECT m FROM Memsignup m WHERE m.midName = :midName")
    , @NamedQuery(name = "Memsignup.findByLastName", query = "SELECT m FROM Memsignup m WHERE m.lastName = :lastName")
    , @NamedQuery(name = "Memsignup.findBySsn", query = "SELECT m FROM Memsignup m WHERE m.ssn = :ssn")
    , @NamedQuery(name = "Memsignup.findByAddress", query = "SELECT m FROM Memsignup m WHERE m.address = :address")
    , @NamedQuery(name = "Memsignup.findByPhone", query = "SELECT m FROM Memsignup m WHERE m.phone = :phone")
    , @NamedQuery(name = "Memsignup.findByCWork", query = "SELECT m FROM Memsignup m WHERE m.cWork = :cWork")
    , @NamedQuery(name = "Memsignup.findByBDate", query = "SELECT m FROM Memsignup m WHERE m.bDate = :bDate")})
public class Memsignup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MID_NAME")
    private String midName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private Long ssn;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PHONE")
    private Long phone;
    @Column(name = "C_WORK")
    private String cWork;
    @Column(name = "B_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bDate;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "memsignup")
    private Payment payment;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "memsignup")
    private Compensation compensation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "memsignup")
    private Collection<InsuranceAccount> insuranceAccountCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "memsignup")
    private Damage_1 damage;

    public Memsignup() {
    }

    public Memsignup(Long ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getCWork() {
        return cWork;
    }

    public void setCWork(String cWork) {
        this.cWork = cWork;
    }

    public Date getBDate() {
        return bDate;
    }

    public void setBDate(Date bDate) {
        this.bDate = bDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }

    @XmlTransient
    public Collection<InsuranceAccount> getInsuranceAccountCollection() {
        return insuranceAccountCollection;
    }

    public void setInsuranceAccountCollection(Collection<InsuranceAccount> insuranceAccountCollection) {
        this.insuranceAccountCollection = insuranceAccountCollection;
    }

    public Damage_1 getDamage() {
        return damage;
    }

    public void setDamage(Damage_1 damage) {
        this.damage = damage;
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
        if (!(object instanceof Memsignup)) {
            return false;
        }
        Memsignup other = (Memsignup) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.Memsignup[ ssn=" + ssn + " ]";
    }
    
}
