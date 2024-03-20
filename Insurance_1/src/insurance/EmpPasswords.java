/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ra'ed Khwayreh
 */
@Entity
@Table(name = "EMP_PASSWORDS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpPasswords.findAll", query = "SELECT e FROM EmpPasswords e")
    , @NamedQuery(name = "EmpPasswords.findByEmpid", query = "SELECT e FROM EmpPasswords e WHERE e.empid = :empid")
    , @NamedQuery(name = "EmpPasswords.findByEmPassword", query = "SELECT e FROM EmpPasswords e WHERE e.emPassword = :emPassword")})
public class EmpPasswords implements Serializable {

    @Column(name = "EM_PASSWORD")
    private String emPassword;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(generator="seq",strategy=GenerationType.SEQUENCE) 
    @SequenceGenerator(name="seq",sequenceName="seq",allocationSize=1)
    @Column(name = "EMPID")
    private Short empid;
    @JoinColumn(name = "DEP_ID", referencedColumnName = "DEPARTMENT_ID")
    @ManyToOne
    private Department depId;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @ManyToOne
    private Employee ssn;

    public EmpPasswords() {
    }

    public EmpPasswords(Short empid) {
        this.empid = empid;
    }

    public Short getEmpid() {
        return empid;
    }

    public void setEmpid(Short empid) {
        this.empid = empid;
    }

 

    public Department getDepId() {
        return depId;
    }

    public void setDepId(Department depId) {
        this.depId = depId;
    }

    public Employee getSsn() {
        return ssn;
    }

    public void setSsn(Employee ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empid != null ? empid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpPasswords)) {
            return false;
        }
        EmpPasswords other = (EmpPasswords) object;
        if ((this.empid == null && other.empid != null) || (this.empid != null && !this.empid.equals(other.empid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.EmpPasswords[ empid=" + empid + " ]";
    }

    public String getEmPassword() {
        return emPassword;
    }

    public void setEmPassword(String emPassword) {
        this.emPassword = emPassword;
    }
    
}
