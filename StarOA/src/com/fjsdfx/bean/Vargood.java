package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Vargood entity. @author MyEclipse Persistence Tools
 */

public class Vargood  implements java.io.Serializable {


    // Fields    

     private Integer vagId;
     private Employee employeeByCjCheck;
     private Variation variation;
     private Itemtype itemtype;
     private Employee employeeByCheckNum;
     private Integer chno;
     private Timestamp etdate;
     private Integer etno;
     private String forstyle;
     private String vagReason;


    // Constructors

    /** default constructor */
    public Vargood() {
    }

    
    /** full constructor */
    public Vargood(Employee employeeByCjCheck, Variation variation, Itemtype itemtype, Employee employeeByCheckNum, Integer chno, Timestamp etdate, Integer etno, String forstyle, String vagReason) {
        this.employeeByCjCheck = employeeByCjCheck;
        this.variation = variation;
        this.itemtype = itemtype;
        this.employeeByCheckNum = employeeByCheckNum;
        this.chno = chno;
        this.etdate = etdate;
        this.etno = etno;
        this.forstyle = forstyle;
        this.vagReason = vagReason;
    }

   
    // Property accessors

    public Integer getVagId() {
        return this.vagId;
    }
    
    public void setVagId(Integer vagId) {
        this.vagId = vagId;
    }

    public Employee getEmployeeByCjCheck() {
        return this.employeeByCjCheck;
    }
    
    public void setEmployeeByCjCheck(Employee employeeByCjCheck) {
        this.employeeByCjCheck = employeeByCjCheck;
    }

    public Variation getVariation() {
        return this.variation;
    }
    
    public void setVariation(Variation variation) {
        this.variation = variation;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Employee getEmployeeByCheckNum() {
        return this.employeeByCheckNum;
    }
    
    public void setEmployeeByCheckNum(Employee employeeByCheckNum) {
        this.employeeByCheckNum = employeeByCheckNum;
    }

    public Integer getChno() {
        return this.chno;
    }
    
    public void setChno(Integer chno) {
        this.chno = chno;
    }

    public Timestamp getEtdate() {
        return this.etdate;
    }
    
    public void setEtdate(Timestamp etdate) {
        this.etdate = etdate;
    }

    public Integer getEtno() {
        return this.etno;
    }
    
    public void setEtno(Integer etno) {
        this.etno = etno;
    }

    public String getForstyle() {
        return this.forstyle;
    }
    
    public void setForstyle(String forstyle) {
        this.forstyle = forstyle;
    }

    public String getVagReason() {
        return this.vagReason;
    }
    
    public void setVagReason(String vagReason) {
        this.vagReason = vagReason;
    }
   








}