package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Proreportone entity. @author MyEclipse Persistence Tools
 */

public class Proreportone  implements java.io.Serializable {


    // Fields    

     private Integer prt1Id;
     private String failurecon;
     private Float failurerate;
     private Integer pronum;
     private Timestamp prtdate;
     private Integer unqnum;


    // Constructors

    /** default constructor */
    public Proreportone() {
    }

    
    /** full constructor */
    public Proreportone(String failurecon, Float failurerate, Integer pronum, Timestamp prtdate, Integer unqnum) {
        this.failurecon = failurecon;
        this.failurerate = failurerate;
        this.pronum = pronum;
        this.prtdate = prtdate;
        this.unqnum = unqnum;
    }

   
    // Property accessors

    public Integer getPrt1Id() {
        return this.prt1Id;
    }
    
    public void setPrt1Id(Integer prt1Id) {
        this.prt1Id = prt1Id;
    }

    public String getFailurecon() {
        return this.failurecon;
    }
    
    public void setFailurecon(String failurecon) {
        this.failurecon = failurecon;
    }

    public Float getFailurerate() {
        return this.failurerate;
    }
    
    public void setFailurerate(Float failurerate) {
        this.failurerate = failurerate;
    }

    public Integer getPronum() {
        return this.pronum;
    }
    
    public void setPronum(Integer pronum) {
        this.pronum = pronum;
    }

    public Timestamp getPrtdate() {
        return this.prtdate;
    }
    
    public void setPrtdate(Timestamp prtdate) {
        this.prtdate = prtdate;
    }

    public Integer getUnqnum() {
        return this.unqnum;
    }
    
    public void setUnqnum(Integer unqnum) {
        this.unqnum = unqnum;
    }
   








}