package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Discardreviewt entity. @author MyEclipse Persistence Tools
 */

public class Discardreviewt  implements java.io.Serializable {


    // Fields    

     private Integer scatId;
     private Employee employee;
     private String advice;
     private Date date;
     private String scanote;
     private Set discardverifies = new HashSet(0);


    // Constructors

    /** default constructor */
    public Discardreviewt() {
    }

    
    /** full constructor */
    public Discardreviewt(Employee employee, String advice, Date date, String scanote, Set discardverifies) {
        this.employee = employee;
        this.advice = advice;
        this.date = date;
        this.scanote = scanote;
        this.discardverifies = discardverifies;
    }

   
    // Property accessors

    public Integer getScatId() {
        return this.scatId;
    }
    
    public void setScatId(Integer scatId) {
        this.scatId = scatId;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getAdvice() {
        return this.advice;
    }
    
    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public String getScanote() {
        return this.scanote;
    }
    
    public void setScanote(String scanote) {
        this.scanote = scanote;
    }

    public Set getDiscardverifies() {
        return this.discardverifies;
    }
    
    public void setDiscardverifies(Set discardverifies) {
        this.discardverifies = discardverifies;
    }
   








}