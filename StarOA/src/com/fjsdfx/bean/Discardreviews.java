package com.fjsdfx.bean;

import java.util.Date;


/**
 * Discardreviews entity. @author MyEclipse Persistence Tools
 */

public class Discardreviews  implements java.io.Serializable {


    // Fields    

     private Integer scaId;
     private Discardverify discardverify;
     private Employee employee;
     private Date date;
     private String inspector;
     private String manager;
     private String scanote;
     private Integer scasId;
     private String advice;
     private Integer flag;


    // Constructors

    /** default constructor */
    public Discardreviews() {
    }

    
    /** full constructor */
    public Discardreviews(Discardverify discardverify, Employee employee, Date date, String inspector, String manager, String scanote, Integer scasId, String advice, Integer flag) {
        this.discardverify = discardverify;
        this.employee = employee;
        this.date = date;
        this.inspector = inspector;
        this.manager = manager;
        this.scanote = scanote;
        this.scasId = scasId;
        this.advice = advice;
        this.flag = flag;
    }

   
    // Property accessors

    public Integer getScaId() {
        return this.scaId;
    }
    
    public void setScaId(Integer scaId) {
        this.scaId = scaId;
    }

    public Discardverify getDiscardverify() {
        return this.discardverify;
    }
    
    public void setDiscardverify(Discardverify discardverify) {
        this.discardverify = discardverify;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public String getInspector() {
        return this.inspector;
    }
    
    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getManager() {
        return this.manager;
    }
    
    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getScanote() {
        return this.scanote;
    }
    
    public void setScanote(String scanote) {
        this.scanote = scanote;
    }

    public Integer getScasId() {
        return this.scasId;
    }
    
    public void setScasId(Integer scasId) {
        this.scasId = scasId;
    }

    public String getAdvice() {
        return this.advice;
    }
    
    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Integer getFlag() {
        return this.flag;
    }
    
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
   








}