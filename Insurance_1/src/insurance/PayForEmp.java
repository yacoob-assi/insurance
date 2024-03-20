/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ra'ed Khwayreh
 */
@Entity
@Table(name = "PAY_FOR_EMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PayForEmp.findAll", query = "SELECT p FROM PayForEmp p")
    , @NamedQuery(name = "PayForEmp.findByFirstName", query = "SELECT p FROM PayForEmp p WHERE p.firstName = :firstName")
    , @NamedQuery(name = "PayForEmp.findByLastName", query = "SELECT p FROM PayForEmp p WHERE p.lastName = :lastName")
    , @NamedQuery(name = "PayForEmp.findByEmpNum", query = "SELECT p FROM PayForEmp p WHERE p.empNum = :empNum")
    , @NamedQuery(name = "PayForEmp.findByAmountPaid", query = "SELECT p FROM PayForEmp p WHERE p.amountPaid = :amountPaid")})
public class PayForEmp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Id
    @Basic(optional = false)
    @Column(name = "EMP_NUM")
    private Integer empNum;
    @Column(name = "AMOUNT_PAID")
    private Integer amountPaid;
    @JoinColumn(name = "EMP_NUM", referencedColumnName = "SSN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;

    public PayForEmp() {
    }

    public PayForEmp(Integer empNum) {
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

    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
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
        if (!(object instanceof PayForEmp)) {
            return false;
        }
        PayForEmp other = (PayForEmp) object;
        if ((this.empNum == null && other.empNum != null) || (this.empNum != null && !this.empNum.equals(other.empNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.PayForEmp[ empNum=" + empNum + " ]";
    }
    
}
