package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Variation entity. @author MyEclipse Persistence Tools
 */

public class Variation  implements java.io.Serializable {


    // Fields    

     private Integer varId;
     private Department department;
     private Employee employeeByUmanager;
     private Employee employeeByAppper;
     private Integer quaadvice;
     private String quanote;
     private Timestamp vardate;
     private String varnote;
     private Set vargoods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Variation() {
    }

    
    /** full constructor */
    public Variation(Department department, Employee employeeByUmanager, Employee employeeByAppper, Integer quaadvice, String quanote, Timestamp vardate, String varnote, Set vargoods) {
        this.department = department;
        this.employeeByUmanager = employeeByUmanager;
        this.employeeByAppper = employeeByAppper;
        this.quaadvice = quaadvice;
        this.quanote = quanote;
        this.vardate = vardate;
        this.varnote = varnote;
        this.vargoods = vargoods;
    }

   
    // Property accessors

    public Integer getVarId() {
        return this.varId;
    }
    
    public void setVarId(Integer varId) {
        this.varId = varId;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployeeByUmanager() {
        return this.employeeByUmanager;
    }
    
    public void setEmployeeByUmanager(Employee employeeByUmanager) {
        this.employeeByUmanager = employeeByUmanager;
    }

    public Employee getEmployeeByAppper() {
        return this.employeeByAppper;
    }
    
    public void setEmployeeByAppper(Employee employeeByAppper) {
        this.employeeByAppper = employeeByAppper;
    }

    public Integer getQuaadvice() {
        return this.quaadvice;
    }
    
    public void setQuaadvice(Integer quaadvice) {
        this.quaadvice = quaadvice;
    }

    public String getQuanote() {
        return this.quanote;
    }
    
    public void setQuanote(String quanote) {
        this.quanote = quanote;
    }

    public Timestamp getVardate() {
        return this.vardate;
    }
    
    public void setVardate(Timestamp vardate) {
        this.vardate = vardate;
    }

    public String getVarnote() {
        return this.varnote;
    }
    
    public void setVarnote(String varnote) {
        this.varnote = varnote;
    }

    public Set getVargoods() {
        return this.vargoods;
    }
    
    public void setVargoods(Set vargoods) {
        this.vargoods = vargoods;
    }
   








}