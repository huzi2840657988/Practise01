package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Discardreviewf entity. @author MyEclipse Persistence Tools
 */

public class Discardreviewf  implements java.io.Serializable {


    // Fields    

     private Integer scafId;
     private Employee employee;
     private String advice;
     private Timestamp date;
     private String scanote;
     private Set discardverifies = new HashSet(0);


    // Constructors

    /** default constructor */
    public Discardreviewf() {
    }

    
    /** full constructor */
    public Discardreviewf(Employee employee, String advice, Timestamp date, String scanote, Set discardverifies) {
        this.employee = employee;
        this.advice = advice;
        this.date = date;
        this.scanote = scanote;
        this.discardverifies = discardverifies;
    }

   
    // Property accessors

    public Integer getScafId() {
        return this.scafId;
    }
    
    public void setScafId(Integer scafId) {
        this.scafId = scafId;
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

    public Timestamp getDate() {
        return this.date;
    }
    
    public void setDate(Timestamp date) {
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