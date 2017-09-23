package com.fjsdfx.bean;

import java.util.Date;


/**
 * Warehouse entity. @author MyEclipse Persistence Tools
 */

public class Warehouse  implements java.io.Serializable {


    // Fields    

     private Integer warId;
     private Itemtype itemtype;
     private Employee employeeByWhId;
     private Employee employeeByWinpectorId;
     private Date dateOfManufacture;
     private Integer mtotal;
     private String prno;
     private String productionAcceptance;
     private String prunit;
     private Date warehouseDate;
     private String warname;
     private Integer warno;
     private String warsn;
     private String whnote;
     private Integer wpro;
     private Integer ytotal;


    // Constructors

    /** default constructor */
    public Warehouse() {
    }

    
    /** full constructor */
    public Warehouse(Itemtype itemtype, Employee employeeByWhId, Employee employeeByWinpectorId, Date dateOfManufacture, Integer mtotal, String prno, String productionAcceptance, String prunit, Date warehouseDate, String warname, Integer warno, String warsn, String whnote, Integer wpro, Integer ytotal) {
        this.itemtype = itemtype;
        this.employeeByWhId = employeeByWhId;
        this.employeeByWinpectorId = employeeByWinpectorId;
        this.dateOfManufacture = dateOfManufacture;
        this.mtotal = mtotal;
        this.prno = prno;
        this.productionAcceptance = productionAcceptance;
        this.prunit = prunit;
        this.warehouseDate = warehouseDate;
        this.warname = warname;
        this.warno = warno;
        this.warsn = warsn;
        this.whnote = whnote;
        this.wpro = wpro;
        this.ytotal = ytotal;
    }

   
    // Property accessors

    public Integer getWarId() {
        return this.warId;
    }
    
    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Employee getEmployeeByWhId() {
        return this.employeeByWhId;
    }
    
    public void setEmployeeByWhId(Employee employeeByWhId) {
        this.employeeByWhId = employeeByWhId;
    }

    public Employee getEmployeeByWinpectorId() {
        return this.employeeByWinpectorId;
    }
    
    public void setEmployeeByWinpectorId(Employee employeeByWinpectorId) {
        this.employeeByWinpectorId = employeeByWinpectorId;
    }

    public Date getDateOfManufacture() {
        return this.dateOfManufacture;
    }
    
    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Integer getMtotal() {
        return this.mtotal;
    }
    
    public void setMtotal(Integer mtotal) {
        this.mtotal = mtotal;
    }

    public String getPrno() {
        return this.prno;
    }
    
    public void setPrno(String prno) {
        this.prno = prno;
    }

    public String getProductionAcceptance() {
        return this.productionAcceptance;
    }
    
    public void setProductionAcceptance(String productionAcceptance) {
        this.productionAcceptance = productionAcceptance;
    }

    public String getPrunit() {
        return this.prunit;
    }
    
    public void setPrunit(String prunit) {
        this.prunit = prunit;
    }

    public Date getWarehouseDate() {
        return this.warehouseDate;
    }
    
    public void setWarehouseDate(Date warehouseDate) {
        this.warehouseDate = warehouseDate;
    }

    public String getWarname() {
        return this.warname;
    }
    
    public void setWarname(String warname) {
        this.warname = warname;
    }

    public Integer getWarno() {
        return this.warno;
    }
    
    public void setWarno(Integer warno) {
        this.warno = warno;
    }

    public String getWarsn() {
        return this.warsn;
    }
    
    public void setWarsn(String warsn) {
        this.warsn = warsn;
    }

    public String getWhnote() {
        return this.whnote;
    }
    
    public void setWhnote(String whnote) {
        this.whnote = whnote;
    }

    public Integer getWpro() {
        return this.wpro;
    }
    
    public void setWpro(Integer wpro) {
        this.wpro = wpro;
    }

    public Integer getYtotal() {
        return this.ytotal;
    }
    
    public void setYtotal(Integer ytotal) {
        this.ytotal = ytotal;
    }
   








}