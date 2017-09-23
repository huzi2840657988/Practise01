package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Feedexamine entity. @author MyEclipse Persistence Tools
 */

public class Feedexamine  implements java.io.Serializable {


    // Fields    

     private Integer feeId;
     private Employee employeeByWh2Id;
     private Employee employeeByBuyerId;
     private Employee employeeByWhId;
     private Employee employeeBySpecId;
     private Quaprolist quaprolist;
     private Boolean confirm;
     private String estatus;
     private Date feeDate;
     private String feestyle;
     private String fromt;
     private String orderno;
     private Date warehouseDate;
     private Set feegoods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Feedexamine() {
    }

    
    /** full constructor */
    public Feedexamine(Employee employeeByWh2Id, Employee employeeByBuyerId, Employee employeeByWhId, Employee employeeBySpecId, Quaprolist quaprolist, Boolean confirm, String estatus, Date feeDate, String feestyle, String fromt, String orderno, Date warehouseDate, Set feegoods) {
        this.employeeByWh2Id = employeeByWh2Id;
        this.employeeByBuyerId = employeeByBuyerId;
        this.employeeByWhId = employeeByWhId;
        this.employeeBySpecId = employeeBySpecId;
        this.quaprolist = quaprolist;
        this.confirm = confirm;
        this.estatus = estatus;
        this.feeDate = feeDate;
        this.feestyle = feestyle;
        this.fromt = fromt;
        this.orderno = orderno;
        this.warehouseDate = warehouseDate;
        this.feegoods = feegoods;
    }

   
    // Property accessors

    public Integer getFeeId() {
        return this.feeId;
    }
    
    public void setFeeId(Integer feeId) {
        this.feeId = feeId;
    }

    public Employee getEmployeeByWh2Id() {
        return this.employeeByWh2Id;
    }
    
    public void setEmployeeByWh2Id(Employee employeeByWh2Id) {
        this.employeeByWh2Id = employeeByWh2Id;
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

    public Employee getEmployeeBySpecId() {
        return this.employeeBySpecId;
    }
    
    public void setEmployeeBySpecId(Employee employeeBySpecId) {
        this.employeeBySpecId = employeeBySpecId;
    }

    public Quaprolist getQuaprolist() {
        return this.quaprolist;
    }
    
    public void setQuaprolist(Quaprolist quaprolist) {
        this.quaprolist = quaprolist;
    }

    public Boolean getConfirm() {
        return this.confirm;
    }
    
    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public String getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Date getFeeDate() {
        return this.feeDate;
    }
    
    public void setFeeDate(Date feeDate) {
        this.feeDate = feeDate;
    }

    public String getFeestyle() {
        return this.feestyle;
    }
    
    public void setFeestyle(String feestyle) {
        this.feestyle = feestyle;
    }

    public String getFromt() {
        return this.fromt;
    }
    
    public void setFromt(String fromt) {
        this.fromt = fromt;
    }

    public String getOrderno() {
        return this.orderno;
    }
    
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Date getWarehouseDate() {
        return this.warehouseDate;
    }
    
    public void setWarehouseDate(Date warehouseDate) {
        this.warehouseDate = warehouseDate;
    }

    public Set getFeegoods() {
        return this.feegoods;
    }
    
    public void setFeegoods(Set feegoods) {
        this.feegoods = feegoods;
    }
   








}