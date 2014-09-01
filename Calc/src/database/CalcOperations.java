package database;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TABLE_CALC_OPERATIONS")
public class CalcOperations implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="OBJID")
    protected int objid;
    

    @Column(name="RESULT",unique = false, nullable = false, length = 255)
    protected String result;

    @Column(name="CREATE_DATE")
    protected Date createDate;
    
    
    protected String getResult() {
        return result;
    }
    protected void setResult(String result) {
        this.result = result;
    }
    protected int getObjid() {
        return objid;
    }
    protected void setObjid(int objid) {
        this.objid = objid;
    }
    protected Date getCreateDate() {
        return createDate;
    }
    protected void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Override
    public String toString() {
        return "CalcOperations [objid=" + objid + ", result=" + result + ", createDate=" + createDate + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
        result = prime * result + objid;
        result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CalcOperations other = (CalcOperations) obj;
        if (createDate == null) {
            if (other.createDate != null)
                return false;
        } else if (!createDate.equals(other.createDate))
            return false;
        if (objid != other.objid)
            return false;
        if (result == null) {
            if (other.result != null)
                return false;
        } else if (!result.equals(other.result))
            return false;
        return true;
    }
    
    
}
