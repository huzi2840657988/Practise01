package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Discardverify entity. @author MyEclipse Persistence Tools
 */

public class Discardverify  implements java.io.Serializable {


    // Fields    

     private Integer scrId;
     private Department department;
     private Employee employee;
     private Itemtype itemtype;
     private Discardreviewf discardreviewf;
     private Discardreviewt discardreviewt;
     private Date rdate;
     private String rdpt;
     private Integer discardreviewsScasId;
     private Set discardproductions = new HashSet(0);
     private Set discardreviewses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Discardverify() {
    }

    
    /** full constructor */
    public Discardverify(Department department, Employee employee, Itemtype itemtype, Discardreviewf discardreviewf, Discardreviewt discardreviewt, Date rdate, String rdpt, Integer discardreviewsScasId, Set discardproductions, Set discardreviewses) {
        this.department = department;
        this.employee = employee;
        this.itemtype = itemtype;
        this.discardreviewf = discardreviewf;
        this.discardreviewt = discardreviewt;
        this.rdate = rdate;
        this.rdpt = rdpt;
        this.discardreviewsScasId = discardreviewsScasId;
        this.discardproductions = discardproductions;
        this.discardreviewses = discardreviewses;
    }

   
    // Property accessors

    public Integer getScrId() {
        return this.scrId;
    }
    
    public void setScrId(Integer scrId) {
        this.scrId = scrId;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Discardreviewf getDiscardreviewf() {
        return this.discardreviewf;
    }
    
    public void setDiscardreviewf(Discardreviewf discardreviewf) {
        this.discardreviewf = discardreviewf;
    }

    public Discardreviewt getDiscardreviewt() {
        return this.discardreviewt;
    }
    
    public void setDiscardreviewt(Discardreviewt discardreviewt) {
        this.discardreviewt = discardreviewt;
    }

    public Date getRdate() {
        return this.rdate;
    }
    
    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getRdpt() {
        return this.rdpt;
    }
    
    public void setRdpt(String rdpt) {
        this.rdpt = rdpt;
    }

    public Integer getDiscardreviewsScasId() {
        return this.discardreviewsScasId;
    }
    
    public void setDiscardreviewsScasId(Integer discardreviewsScasId) {
        this.discardreviewsScasId = discardreviewsScasId;
    }

    public Set getDiscardproductions() {
        return this.discardproductions;
    }
    
    public void setDiscardproductions(Set discardproductions) {
        this.discardproductions = discardproductions;
    }

    public Set getDiscardreviewses() {
        return this.discardreviewses;
    }
    
    public void setDiscardreviewses(Set discardreviewses) {
        this.discardreviewses = discardreviewses;
    }
   








}