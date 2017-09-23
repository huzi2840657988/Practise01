package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Preparation entity. @author MyEclipse Persistence Tools
 */

public class Preparation  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employeeByPersonEmpId;
     private Employee employeeByPleaderEmpId;
     private Department department;
     private String confimation;
     private String fulfillment;
     private Timestamp pdate;
     private String presn;
     private Timestamp sdate;
     private Integer addplan;
     private Integer addsup;
     private Set pergoods = new HashSet(0);
     private Set proSups = new HashSet(0);
     private Set prschecks = new HashSet(0);
     private Set supsendms = new HashSet(0);
     private Set supsendm3s = new HashSet(0);
     private Set accreditions = new HashSet(0);


    // Constructors

    /** default constructor */
    public Preparation() {
    }

    
    /** full constructor */
    public Preparation(Employee employeeByPersonEmpId, Employee employeeByPleaderEmpId, Department department, String confimation, String fulfillment, Timestamp pdate, String presn, Timestamp sdate, Integer addplan, Integer addsup, Set pergoods, Set proSups, Set prschecks, Set supsendms, Set supsendm3s, Set accreditions) {
        this.employeeByPersonEmpId = employeeByPersonEmpId;
        this.employeeByPleaderEmpId = employeeByPleaderEmpId;
        this.department = department;
        this.confimation = confimation;
        this.fulfillment = fulfillment;
        this.pdate = pdate;
        this.presn = presn;
        this.sdate = sdate;
        this.addplan = addplan;
        this.addsup = addsup;
        this.pergoods = pergoods;
        this.proSups = proSups;
        this.prschecks = prschecks;
        this.supsendms = supsendms;
        this.supsendm3s = supsendm3s;
        this.accreditions = accreditions;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployeeByPersonEmpId() {
        return this.employeeByPersonEmpId;
    }
    
    public void setEmployeeByPersonEmpId(Employee employeeByPersonEmpId) {
        this.employeeByPersonEmpId = employeeByPersonEmpId;
    }

    public Employee getEmployeeByPleaderEmpId() {
        return this.employeeByPleaderEmpId;
    }
    
    public void setEmployeeByPleaderEmpId(Employee employeeByPleaderEmpId) {
        this.employeeByPleaderEmpId = employeeByPleaderEmpId;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getConfimation() {
        return this.confimation;
    }
    
    public void setConfimation(String confimation) {
        this.confimation = confimation;
    }

    public String getFulfillment() {
        return this.fulfillment;
    }
    
    public void setFulfillment(String fulfillment) {
        this.fulfillment = fulfillment;
    }

    public Timestamp getPdate() {
        return this.pdate;
    }
    
    public void setPdate(Timestamp pdate) {
        this.pdate = pdate;
    }

    public String getPresn() {
        return this.presn;
    }
    
    public void setPresn(String presn) {
        this.presn = presn;
    }

    public Timestamp getSdate() {
        return this.sdate;
    }
    
    public void setSdate(Timestamp sdate) {
        this.sdate = sdate;
    }

    public Integer getAddplan() {
        return this.addplan;
    }
    
    public void setAddplan(Integer addplan) {
        this.addplan = addplan;
    }

    public Integer getAddsup() {
        return this.addsup;
    }
    
    public void setAddsup(Integer addsup) {
        this.addsup = addsup;
    }

    public Set getPergoods() {
        return this.pergoods;
    }
    
    public void setPergoods(Set pergoods) {
        this.pergoods = pergoods;
    }

    public Set getProSups() {
        return this.proSups;
    }
    
    public void setProSups(Set proSups) {
        this.proSups = proSups;
    }

    public Set getPrschecks() {
        return this.prschecks;
    }
    
    public void setPrschecks(Set prschecks) {
        this.prschecks = prschecks;
    }

    public Set getSupsendms() {
        return this.supsendms;
    }
    
    public void setSupsendms(Set supsendms) {
        this.supsendms = supsendms;
    }

    public Set getSupsendm3s() {
        return this.supsendm3s;
    }
    
    public void setSupsendm3s(Set supsendm3s) {
        this.supsendm3s = supsendm3s;
    }

    public Set getAccreditions() {
        return this.accreditions;
    }
    
    public void setAccreditions(Set accreditions) {
        this.accreditions = accreditions;
    }
   








}