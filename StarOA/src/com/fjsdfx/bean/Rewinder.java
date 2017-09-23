package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Rewinder entity. @author MyEclipse Persistence Tools
 */

public class Rewinder  implements java.io.Serializable {


    // Fields    

     private Integer rewId;
     private Employee employeeBySpectorId;
     private Employee employeeByBuyerId;
     private Employee employeeByWhId;
     private Date rewDate;
     private String rewexamine;
     private String rewnote;
     private String suplyu;
     private Date warehouseDate;
     private Set rewgoods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Rewinder() {
    }

    
    /** full constructor */
    public Rewinder(Employee employeeBySpectorId, Employee employeeByBuyerId, Employee employeeByWhId, Date rewDate, String rewexamine, String rewnote, String suplyu, Date warehouseDate, Set rewgoods) {
        this.employeeBySpectorId = employeeBySpectorId;
        this.employeeByBuyerId = employeeByBuyerId;
        this.employeeByWhId = employeeByWhId;
        this.rewDate = rewDate;
        this.rewexamine = rewexamine;
        this.rewnote = rewnote;
        this.suplyu = suplyu;
        this.warehouseDate = warehouseDate;
        this.rewgoods = rewgoods;
    }

   
    // Property accessors

    public Integer getRewId() {
        return this.rewId;
    }
    
    public void setRewId(Integer rewId) {
        this.rewId = rewId;
    }

    public Employee getEmployeeBySpectorId() {
        return this.employeeBySpectorId;
    }
    
    public void setEmployeeBySpectorId(Employee employeeBySpectorId) {
        this.employeeBySpectorId = employeeBySpectorId;
    }

    public Employee getEmployeeByBuyerId() {
        return this.employeeByBuyerId;
    }
    
    public void setEmployeeByBuyerId(Employee employeeByBuyerId) {
        this.employeeByBuyerId = employeeByBuyerId;
    }

    public Employee getEmployeeByWhId() {
        return this.employeeByWhId;
    }
    
    public void setEmployeeByWhId(Employee employeeByWhId) {
        this.employeeByWhId = employeeByWhId;
    }

    public Date getRewDate() {
        return this.rewDate;
    }
    
    public void setRewDate(Date rewDate) {
        this.rewDate = rewDate;
    }

    public String getRewexamine() {
        return this.rewexamine;
    }
    
    public void setRewexamine(String rewexamine) {
        this.rewexamine = rewexamine;
    }

    public String getRewnote() {
        return this.rewnote;
    }
    
    public void setRewnote(String rewnote) {
        this.rewnote = rewnote;
    }

    public String getSuplyu() {
        return this.suplyu;
    }
    
    public void setSuplyu(String suplyu) {
        this.suplyu = suplyu;
    }

    public Date getWarehouseDate() {
        return this.warehouseDate;
    }
    
    public void setWarehouseDate(Date warehouseDate) {
        this.warehouseDate = warehouseDate;
    }

    public Set getRewgoods() {
        return this.rewgoods;
    }
    
    public void setRewgoods(Set rewgoods) {
        this.rewgoods = rewgoods;
    }
   








}