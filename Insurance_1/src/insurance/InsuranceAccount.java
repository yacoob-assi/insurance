/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ra'ed Khwayreh
 */
@Entity
@Table(name = "INSURANCE_ACCOUNT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InsuranceAccount.findAll", query = "SELECT i FROM InsuranceAccount i")
    , @NamedQuery(name = "InsuranceAccount.findBySsn", query = "SELECT i FROM InsuranceAccount i WHERE i.insuranceAccountPK.ssn = :ssn")
    , @NamedQuery(name = "InsuranceAccount.findByVechileNum", query = "SELECT i FROM InsuranceAccount i WHERE i.insuranceAccountPK.vechileNum = :vechileNum")
    , @NamedQuery(name = "InsuranceAccount.findByVechileColor", query = "SELECT i FROM InsuranceAccount i WHERE i.vechileColor = :vechileColor")
    , @NamedQuery(name = "InsuranceAccount.findByPassengerNum", query = "SELECT i FROM InsuranceAccount i WHERE i.passengerNum = :passengerNum")
    , @NamedQuery(name = "InsuranceAccount.findByEngineCapacity", query = "SELECT i FROM InsuranceAccount i WHERE i.engineCapacity = :engineCapacity")
    , @NamedQuery(name = "InsuranceAccount.findByVechileModel", query = "SELECT i FROM InsuranceAccount i WHERE i.vechileModel = :vechileModel")
    , @NamedQuery(name = "InsuranceAccount.findByVechileType", query = "SELECT i FROM InsuranceAccount i WHERE i.vechileType = :vechileType")})
public class InsuranceAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsuranceAccountPK insuranceAccountPK;
    @Column(name = "VECHILE_COLOR")
    private String vechileColor;
    @Column(name = "PASSENGER_NUM")
    private Short passengerNum;
    @Column(name = "ENGINE_CAPACITY")
    private Integer engineCapacity;
    @Column(name = "VECHILE_MODEL")
    private Short vechileModel;
    @Column(name = "VECHILE_TYPE")
    private String vechileType;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Memsignup memsignup;

    public InsuranceAccount() {
    }

    public InsuranceAccount(InsuranceAccountPK insuranceAccountPK) {
        this.insuranceAccountPK = insuranceAccountPK;
    }

    public InsuranceAccount(long ssn, int vechileNum) {
        this.insuranceAccountPK = new InsuranceAccountPK(ssn, vechileNum);
    }

    public InsuranceAccountPK getInsuranceAccountPK() {
        return insuranceAccountPK;
    }

    public void setInsuranceAccountPK(InsuranceAccountPK insuranceAccountPK) {
        this.insuranceAccountPK = insuranceAccountPK;
    }

    public String getVechileColor() {
        return vechileColor;
    }

    public void setVechileColor(String vechileColor) {
        this.vechileColor = vechileColor;
    }

    public Short getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(Short passengerNum) {
        this.passengerNum = passengerNum;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Short getVechileModel() {
        return vechileModel;
    }

    public void setVechileModel(Short vechileModel) {
        this.vechileModel = vechileModel;
    }

    public String getVechileType() {
        return vechileType;
    }

    public void setVechileType(String vechileType) {
        this.vechileType = vechileType;
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
        hash += (insuranceAccountPK != null ? insuranceAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsuranceAccount)) {
            return false;
        }
        InsuranceAccount other = (InsuranceAccount) object;
        if ((this.insuranceAccountPK == null && other.insuranceAccountPK != null) || (this.insuranceAccountPK != null && !this.insuranceAccountPK.equals(other.insuranceAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.InsuranceAccount[ insuranceAccountPK=" + insuranceAccountPK + " ]";
    }
    
}
