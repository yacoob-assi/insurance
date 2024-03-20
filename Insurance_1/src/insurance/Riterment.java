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
@Table(name = "RITERMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Riterment.findAll", query = "SELECT r FROM Riterment r")
    , @NamedQuery(name = "Riterment.findByFirstName", query = "SELECT r FROM Riterment r WHERE r.firstName = :firstName")
    , @NamedQuery(name = "Riterment.findByLastName", query = "SELECT r FROM Riterment r WHERE r.lastName = :lastName")
    , @NamedQuery(name = "Riterment.findByEmpNum", query = "SELECT r FROM Riterment r WHERE r.empNum = :empNum")
    , @NamedQuery(name = "Riterment.findByPension", query = "SELECT r FROM Riterment r WHERE r.pension = :pension")})
public class Riterment implements Serializable {

    @Column(name = "RIT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ritDate;

    private static final long serialVersionUID = 1L;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Id
    @Basic(optional = false)
    @Column(name = "EMP_NUM")
    private Integer empNum;
    @Column(name = "PENSION")
    private Integer pension;
    @JoinColumn(name = "EMP_NUM", referencedColumnName = "SSN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;

    public Riterment() {
    }

    public Riterment(Integer empNum) {
        this.empNum = empNum;
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

    public Integer getEmpNum() {
        return empNum;
    }

    public void setEmpNum(Integer empNum) {
        this.empNum = empNum;
    }

    public Integer getPension() {
        return pension;
    }

    public void setPension(Integer pension) {
        this.pension = pension;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empNum != null ? empNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Riterment)) {
            return false;
        }
        Riterment other = (Riterment) object;
        if ((this.empNum == null && other.empNum != null) || (this.empNum != null && !this.empNum.equals(other.empNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.Riterment[ empNum=" + empNum + " ]";
    }

    public Date getRitDate() {
        return ritDate;
    }

    public void setRitDate(Date ritDate) {
        this.ritDate = ritDate;
    }
    
}
