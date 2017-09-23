package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Supsendm entity. @author MyEclipse Persistence Tools
 */

public class Supsendm  implements java.io.Serializable {


    // Fields    

     private Integer susId;
     private Department department;
     private Employee employeeByProper;
     private Employee employeeByWhmanager;
     private Itemtype itemtype;
     private Preparation preparation;
     private Employee employeeByWsper;
     private String batch;
     private String bondedpro;
     private Date date;
     private String feeding;
     private String partno;
     private Set susgoods = new HashSet(0);
     private Set proSups = new HashSet(0);


    // Constructors

    /** default constructor */
    public Supsendm() {
    }

    
    /** full constructor */
    public Supsendm(Department department, Employee employeeByProper, Employee employeeByWhmanager, Itemtype itemtype, Preparation preparation, Employee employeeByWsper, String batch, String bondedpro, Date date, String feeding, String partno, Set susgoods, Set proSups) {
        this.department = department;
        this.employeeByProper = employeeByProper;
        this.employeeByWhmanager = employeeByWhmanager;
        this.itemtype = itemtype;
        this.preparation = preparation;
        this.employeeByWsper = employeeByWsper;
        this.batch = batch;
        this.bondedpro = bondedpro;
        this.date = date;
        this.feeding = feeding;
        this.partno = partno;
        this.susgoods = susgoods;
        this.proSups = proSups;
    }

   
    // Property accessors

    public Integer getSusId() {
        return this.susId;
    }
    
    public void setSusId(Integer susId) {
        this.susId = susId;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployeeByProper() {
        return this.employeeByProper;
    }
    
    public void setEmployeeByProper(Employee employeeByProper) {
        this.employeeByProper = employeeByProper;
    }

    public Employee getEmployeeByWhmanager() {
        return this.employeeByWhmanager;
    }
    
    public void setEmployeeByWhmanager(Employee employeeByWhmanager) {
        this.employeeByWhmanager = employeeByWhmanager;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Preparation getPreparation() {
        return this.preparation;
    }
    
    public void setPreparation(Preparation preparation) {
        this.preparation = preparation;
    }

    public Employee getEmployeeByWsper() {
        return this.employeeByWsper;
    }
    
    public void setEmployeeByWsper(Employee employeeByWsper) {
        this.employeeByWsper = employeeByWsper;
    }

    public String getBatch() {
        return this.batch;
    }
    
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBondedpro() {
        return this.bondedpro;
    }
    
    public void setBondedpro(String bondedpro) {
        this.bondedpro = bondedpro;
    }

    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public String getFeeding() {
        return this.feeding;
    }
    
    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public String getPartno() {
        return this.partno;
    }
    
    public void setPartno(String partno) {
        this.partno = partno;
    }

    public Set getSusgoods() {
        return this.susgoods;
    }
    
    public void setSusgoods(Set susgoods) {
        this.susgoods = susgoods;
    }

    public Set getProSups() {
        return this.proSups;
    }
    
    public void setProSups(Set proSups) {
        this.proSups = proSups;
    }
   








}