package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Requisition entity. @author MyEclipse Persistence Tools
 */

public class Requisition  implements java.io.Serializable {


    // Fields    

     private Integer reqId;
     private Employee employeeByDptId;
     private Employee employeeByConfId;
     private Employee employeeByPinkId;
     private String company;
     private Date deliverDate;
     private Integer dptmanager;
     private Date reqDate;
     private Set picgoods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Requisition() {
    }

    
    /** full constructor */
    public Requisition(Employee employeeByDptId, Employee employeeByConfId, Employee employeeByPinkId, String company, Date deliverDate, Integer dptmanager, Date reqDate, Set picgoods) {
        this.employeeByDptId = employeeByDptId;
        this.employeeByConfId = employeeByConfId;
        this.employeeByPinkId = employeeByPinkId;
        this.company = company;
        this.deliverDate = deliverDate;
        this.dptmanager = dptmanager;
        this.reqDate = reqDate;
        this.picgoods = picgoods;
    }

   
    // Property accessors

    public Integer getReqId() {
        return this.reqId;
    }
    
    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    public Employee getEmployeeByDptId() {
        return this.employeeByDptId;
    }
    
    public void setEmployeeByDptId(Employee employeeByDptId) {
        this.employeeByDptId = employeeByDptId;
    }

    public Employee getEmployeeByConfId() {
        return this.employeeByConfId;
    }
    
    public void setEmployeeByConfId(Employee employeeByConfId) {
        this.employeeByConfId = employeeByConfId;
    }

    public Employee getEmployeeByPinkId() {
        return this.employeeByPinkId;
    }
    
    public void setEmployeeByPinkId(Employee employeeByPinkId) {
        this.employeeByPinkId = employeeByPinkId;
    }

    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }

    public Date getDeliverDate() {
        return this.deliverDate;
    }
    
    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public Integer getDptmanager() {
        return this.dptmanager;
    }
    
    public void setDptmanager(Integer dptmanager) {
        this.dptmanager = dptmanager;
    }

    public Date getReqDate() {
        return this.reqDate;
    }
    
    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Set getPicgoods() {
        return this.picgoods;
    }
    
    public void setPicgoods(Set picgoods) {
        this.picgoods = picgoods;
    }
   








}