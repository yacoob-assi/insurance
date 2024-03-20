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
@Table(name = "EMPLOYEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findBySsn", query = "SELECT e FROM Employee e WHERE e.ssn = :ssn")
    , @NamedQuery(name = "Employee.findByFirstName", query = "SELECT e FROM Employee e WHERE e.firstName = :firstName")
    , @NamedQuery(name = "Employee.findByMiddleName", query = "SELECT e FROM Employee e WHERE e.middleName = :middleName")
    , @NamedQuery(name = "Employee.findByLastName", query = "SELECT e FROM Employee e WHERE e.lastName = :lastName")
    , @NamedQuery(name = "Employee.findByPhoneNum", query = "SELECT e FROM Employee e WHERE e.phoneNum = :phoneNum")
    , @NamedQuery(name = "Employee.findByYearsOfExperience", query = "SELECT e FROM Employee e WHERE e.yearsOfExperience = :yearsOfExperience")
    , @NamedQuery(name = "Employee.findBySex", query = "SELECT e FROM Employee e WHERE e.sex = :sex")
    , @NamedQuery(name = "Employee.findBySocialStatus", query = "SELECT e FROM Employee e WHERE e.socialStatus = :socialStatus")
    , @NamedQuery(name = "Employee.findByBirthDate", query = "SELECT e FROM Employee e WHERE e.birthDate = :birthDate")
    , @NamedQuery(name = "Employee.findByDateEmp", query = "SELECT e FROM Employee e WHERE e.dateEmp = :dateEmp")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private Integer ssn;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "PHONE_NUM")
    private Long phoneNum;
    @Column(name = "YEARS_OF_EXPERIENCE")
    private Short yearsOfExperience;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "SOCIAL_STATUS")
    private String socialStatus;
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Column(name = "DATE_EMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEmp;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private PayForEmp payForEmp;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Vacation vacation;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Riterment riterment;
    @OneToMany(mappedBy = "ssn")
    private Collection<EmpPasswords> empPasswordsCollection;

    public Employee() {
    }

    public Employee(Integer ssn) {
        this.ssn = ssn;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Short getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Short yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDateEmp() {
        return dateEmp;
    }

    public void setDateEmp(Date dateEmp) {
        this.dateEmp = dateEmp;
    }

    public PayForEmp getPayForEmp() {
        return payForEmp;
    }

    public void setPayForEmp(PayForEmp payForEmp) {
        this.payForEmp = payForEmp;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    public Riterment getRiterment() {
        return riterment;
    }

    public void setRiterment(Riterment riterment) {
        this.riterment = riterment;
    }

    @XmlTransient
    public Collection<EmpPasswords> getEmpPasswordsCollection() {
        return empPasswordsCollection;
    }

    public void setEmpPasswordsCollection(Collection<EmpPasswords> empPasswordsCollection) {
        this.empPasswordsCollection = empPasswordsCollection;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.Employee[ ssn=" + ssn + " ]";
    }
    
}
