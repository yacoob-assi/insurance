/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Ra'ed Khwayreh
 */
@Embeddable
public class InsuranceAccountPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SSN")
    private long ssn;
    @Basic(optional = false)
    @Column(name = "VECHILE_NUM")
    private int vechileNum;

    public InsuranceAccountPK() {
    }

    public InsuranceAccountPK(long ssn, int vechileNum) {
        this.ssn = ssn;
        this.vechileNum = vechileNum;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getVechileNum() {
        return vechileNum;
    }

    public void setVechileNum(int vechileNum) {
        this.vechileNum = vechileNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ssn;
        hash += (int) vechileNum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsuranceAccountPK)) {
            return false;
        }
        InsuranceAccountPK other = (InsuranceAccountPK) object;
        if (this.ssn != other.ssn) {
            return false;
        }
        if (this.vechileNum != other.vechileNum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "insurance.InsuranceAccountPK[ ssn=" + ssn + ", vechileNum=" + vechileNum + " ]";
    }
    
}
