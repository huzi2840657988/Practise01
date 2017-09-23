package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Changef entity. @author MyEclipse Persistence Tools
 */

public class Changef  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Itemtype itemtypeByFormerPro;
     private Employee employeeByWsSign;
     private Employee employeeByExSign;
     private Employee employeeByMenuMake;
     private Employee employeeByWhSign;
     private Itemtype itemtypeByToPro;
     private Integer bno;
     private String chaNo;
     private String channote;
     private Integer competeno;
     private Timestamp enddate;
     private String prorecord;
     private Timestamp startdate;


    // Constructors

    /** default constructor */
    public Changef() {
    }

    
    /** full constructor */
    public Changef(Itemtype itemtypeByFormerPro, Employee employeeByWsSign, Employee employeeByExSign, Employee employeeByMenuMake, Employee employeeByWhSign, Itemtype itemtypeByToPro, Integer bno, String chaNo, String channote, Integer competeno, Timestamp enddate, String prorecord, Timestamp startdate) {
        this.itemtypeByFormerPro = itemtypeByFormerPro;
        this.employeeByWsSign = employeeByWsSign;
        this.employeeByExSign = employeeByExSign;
        this.employeeByMenuMake = employeeByMenuMake;
        this.employeeByWhSign = employeeByWhSign;
        this.itemtypeByToPro = itemtypeByToPro;
        this.bno = bno;
        this.chaNo = chaNo;
        this.channote = channote;
        this.competeno = competeno;
        this.enddate = enddate;
        this.prorecord = prorecord;
        this.startdate = startdate;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Itemtype getItemtypeByFormerPro() {
        return this.itemtypeByFormerPro;
    }
    
    public void setItemtypeByFormerPro(Itemtype itemtypeByFormerPro) {
        this.itemtypeByFormerPro = itemtypeByFormerPro;
    }

    public Employee getEmployeeByWsSign() {
        return this.employeeByWsSign;
    }
    
    public void setEmployeeByWsSign(Employee employeeByWsSign) {
        this.employeeByWsSign = employeeByWsSign;
    }

    public Employee getEmployeeByExSign() {
        return this.employeeByExSign;
    }
    
    public void setEmployeeByExSign(Employee employeeByExSign) {
        this.employeeByExSign = employeeByExSign;
    }

    public Employee getEmployeeByMenuMake() {
        return this.employeeByMenuMake;
    }
    
    public void setEmployeeByMenuMake(Employee employeeByMenuMake) {
        this.employeeByMenuMake = employeeByMenuMake;
    }

    public Employee getEmployeeByWhSign() {
        return this.employeeByWhSign;
    }
    
    public void setEmployeeByWhSign(Employee employeeByWhSign) {
        this.employeeByWhSign = employeeByWhSign;
    }

    public Itemtype getItemtypeByToPro() {
        return this.itemtypeByToPro;
    }
    
    public void setItemtypeByToPro(Itemtype itemtypeByToPro) {
        this.itemtypeByToPro = itemtypeByToPro;
    }

    public Integer getBno() {
        return this.bno;
    }
    
    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getChaNo() {
        return this.chaNo;
    }
    
    public void setChaNo(String chaNo) {
        this.chaNo = chaNo;
    }

    public String getChannote() {
        return this.channote;
    }
    
    public void setChannote(String channote) {
        this.channote = channote;
    }

    public Integer getCompeteno() {
        return this.competeno;
    }
    
    public void setCompeteno(Integer competeno) {
        this.competeno = competeno;
    }

    public Timestamp getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    public String getProrecord() {
        return this.prorecord;
    }
    
    public void setProrecord(String prorecord) {
        this.prorecord = prorecord;
    }

    public Timestamp getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }
   








}