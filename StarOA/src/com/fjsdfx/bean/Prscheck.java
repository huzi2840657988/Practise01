package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Prscheck entity. @author MyEclipse Persistence Tools
 */

public class Prscheck  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Department department;
     private Employee employeeByEedit;
     private Employee employeeByEapprove;
     private Preparation preparation;
     private Employee employeeByEaudit;
     private Date prsDate;
     private String psn;
     private Date sdate;
     private Set proSups = new HashSet(0);
     private Set proSchedules = new HashSet(0);


    // Constructors

    /** default constructor */
    public Prscheck() {
    }

    
    /** full constructor */
    public Prscheck(Department department, Employee employeeByEedit, Employee employeeByEapprove, Preparation preparation, Employee employeeByEaudit, Date prsDate, String psn, Date sdate, Set proSups, Set proSchedules) {
        this.department = department;
        this.employeeByEedit = employeeByEedit;
        this.employeeByEapprove = employeeByEapprove;
        this.preparation = preparation;
        this.employeeByEaudit = employeeByEaudit;
        this.prsDate = prsDate;
        this.psn = psn;
        this.sdate = sdate;
        this.proSups = proSups;
        this.proSchedules = proSchedules;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployeeByEedit() {
        return this.employeeByEedit;
    }
    
    public void setEmployeeByEedit(Employee employeeByEedit) {
        this.employeeByEedit = employeeByEedit;
    }

    public Employee getEmployeeByEapprove() {
        return this.employeeByEapprove;
    }
    
    public void setEmployeeByEapprove(Employee employeeByEapprove) {
        this.employeeByEapprove = employeeByEapprove;
    }

    public Preparation getPreparation() {
        return this.preparation;
    }
    
    public void setPreparation(Preparation preparation) {
        this.preparation = preparation;
    }

    public Employee getEmployeeByEaudit() {
        return this.employeeByEaudit;
    }
    
    public void setEmployeeByEaudit(Employee employeeByEaudit) {
        this.employeeByEaudit = employeeByEaudit;
    }

    public Date getPrsDate() {
        return this.prsDate;
    }
    
    public void setPrsDate(Date prsDate) {
        this.prsDate = prsDate;
    }

    public String getPsn() {
        return this.psn;
    }
    
    public void setPsn(String psn) {
        this.psn = psn;
    }

    public Date getSdate() {
        return this.sdate;
    }
    
    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Set getProSups() {
        return this.proSups;
    }
    
    public void setProSups(Set proSups) {
        this.proSups = proSups;
    }

    public Set getProSchedules() {
        return this.proSchedules;
    }
    
    public void setProSchedules(Set proSchedules) {
        this.proSchedules = proSchedules;
    }
   








}