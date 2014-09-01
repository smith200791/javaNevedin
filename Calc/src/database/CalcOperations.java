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
}
