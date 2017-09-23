package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Unqmessage entity. @author MyEclipse Persistence Tools
 */

public class Unqmessage  implements java.io.Serializable {


    // Fields    

     private Integer unmId;
     private Unqualified unqualified;
     private String bdepartment;
     private Timestamp fdate;
     private String unmcode;
     private String unmstatus;


    // Constructors

    /** default constructor */
    public Unqmessage() {
    }

    
    /** full constructor */
    public Unqmessage(Unqualified unqualified, String bdepartment, Timestamp fdate, String unmcode, String unmstatus) {
        this.unqualified = unqualified;
        this.bdepartment = bdepartment;
        this.fdate = fdate;
        this.unmcode = unmcode;
        this.unmstatus = unmstatus;
    }

   
    // Property accessors

    public Integer getUnmId() {
        return this.unmId;
    }
    
    public void setUnmId(Integer unmId) {
        this.unmId = unmId;
    }

    public Unqualified getUnqualified() {
        return this.unqualified;
    }
    
    public void setUnqualified(Unqualified unqualified) {
        this.unqualified = unqualified;
    }

    public String getBdepartment() {
        return this.bdepartment;
    }
    
    public void setBdepartment(String bdepartment) {
        this.bdepartment = bdepartment;
    }

    public Timestamp getFdate() {
        return this.fdate;
    }
    
    public void setFdate(Timestamp fdate) {
        this.fdate = fdate;
    }

    public String getUnmcode() {
        return this.unmcode;
    }
    
    public void setUnmcode(String unmcode) {
        this.unmcode = unmcode;
    }

    public String getUnmstatus() {
        return this.unmstatus;
    }
    
    public void setUnmstatus(String unmstatus) {
        this.unmstatus = unmstatus;
    }
   








}