package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Employeerap entity. @author MyEclipse Persistence Tools
 */

public class Employeerap  implements java.io.Serializable {


    // Fields    

     private Integer empRpId;
     private Employee employee;
     private Timestamp rapDate;
     private String rapName;
     private String rapReason;
     private Integer isdel;


    // Constructors

    /** default constructor */
    public Employeerap() {
    }

    
    /** full constructor */
    public Employeerap(Employee employee, Timestamp rapDate, String rapName, String rapReason, Integer isdel) {
        this.employee = employee;
        this.rapDate = rapDate;
        this.rapName = rapName;
        this.rapReason = rapReason;
        this.isdel = isdel;
    }

   
    // Property accessors

    public Integer getEmpRpId() {
        return this.empRpId;
    }
    
    public void setEmpRpId(Integer empRpId) {
        this.empRpId = empRpId;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Timestamp getRapDate() {
        return this.rapDate;
    }
    
    public void setRapDate(Timestamp rapDate) {
        this.rapDate = rapDate;
    }

    public String getRapName() {
        return this.rapName;
    }
    
    public void setRapName(String rapName) {
        this.rapName = rapName;
    }

    public String getRapReason() {
        return this.rapReason;
    }
    
    public void setRapReason(String rapReason) {
        this.rapReason = rapReason;
    }

    public Integer getIsdel() {
        return this.isdel;
    }
    
    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
   








}