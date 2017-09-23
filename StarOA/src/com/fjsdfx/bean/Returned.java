package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Returned entity. @author MyEclipse Persistence Tools
 */

public class Returned  implements java.io.Serializable {


    // Fields    

     private Integer retid;
     private Employee employeeBySignatory;
     private Employee employeeByQualitymanager;
     private Employee employeeBySignper;
     private String customern;
     private String forward;
     private String qualityadvice;
     private Date qualitydate;
     private String qualitynote;
     private Date retdate;
     private String retnote;
     private String sn;
     private Date whradate;
     private String whreceive;
     private String buhege;
     private String deals;
     private String unqualifyId;
     private Set retgoods = new HashSet(0);
     private Set unqualifieds = new HashSet(0);


    // Constructors

    /** default constructor */
    public Returned() {
    }

    
    /** full constructor */
    public Returned(Employee employeeBySignatory, Employee employeeByQualitymanager, Employee employeeBySignper, String customern, String forward, String qualityadvice, Date qualitydate, String qualitynote, Date retdate, String retnote, String sn, Date whradate, String whreceive, String buhege, String deals, String unqualifyId, Set retgoods, Set unqualifieds) {
        this.employeeBySignatory = employeeBySignatory;
        this.employeeByQualitymanager = employeeByQualitymanager;
        this.employeeBySignper = employeeBySignper;
        this.customern = customern;
        this.forward = forward;
        this.qualityadvice = qualityadvice;
        this.qualitydate = qualitydate;
        this.qualitynote = qualitynote;
        this.retdate = retdate;
        this.retnote = retnote;
        this.sn = sn;
        this.whradate = whradate;
        this.whreceive = whreceive;
        this.buhege = buhege;
        this.deals = deals;
        this.unqualifyId = unqualifyId;
        this.retgoods = retgoods;
        this.unqualifieds = unqualifieds;
    }

   
    // Property accessors

    public Integer getRetid() {
        return this.retid;
    }
    
    public void setRetid(Integer retid) {
        this.retid = retid;
    }

    public Employee getEmployeeBySignatory() {
        return this.employeeBySignatory;
    }
    
    public void setEmployeeBySignatory(Employee employeeBySignatory) {
        this.employeeBySignatory = employeeBySignatory;
    }

    public Employee getEmployeeByQualitymanager() {
        return this.employeeByQualitymanager;
    }
    
    public void setEmployeeByQualitymanager(Employee employeeByQualitymanager) {
        this.employeeByQualitymanager = employeeByQualitymanager;
    }

    public Employee getEmployeeBySignper() {
        return this.employeeBySignper;
    }
    
    public void setEmployeeBySignper(Employee employeeBySignper) {
        this.employeeBySignper = employeeBySignper;
    }

    public String getCustomern() {
        return this.customern;
    }
    
    public void setCustomern(String customern) {
        this.customern = customern;
    }

    public String getForward() {
        return this.forward;
    }
    
    public void setForward(String forward) {
        this.forward = forward;
    }

    public String getQualityadvice() {
        return this.qualityadvice;
    }
    
    public void setQualityadvice(String qualityadvice) {
        this.qualityadvice = qualityadvice;
    }

    public Date getQualitydate() {
        return this.qualitydate;
    }
    
    public void setQualitydate(Date qualitydate) {
        this.qualitydate = qualitydate;
    }

    public String getQualitynote() {
        return this.qualitynote;
    }
    
    public void setQualitynote(String qualitynote) {
        this.qualitynote = qualitynote;
    }

    public Date getRetdate() {
        return this.retdate;
    }
    
    public void setRetdate(Date retdate) {
        this.retdate = retdate;
    }

    public String getRetnote() {
        return this.retnote;
    }
    
    public void setRetnote(String retnote) {
        this.retnote = retnote;
    }

    public String getSn() {
        return this.sn;
    }
    
    public void setSn(String sn) {
        this.sn = sn;
    }

    public Date getWhradate() {
        return this.whradate;
    }
    
    public void setWhradate(Date whradate) {
        this.whradate = whradate;
    }

    public String getWhreceive() {
        return this.whreceive;
    }
    
    public void setWhreceive(String whreceive) {
        this.whreceive = whreceive;
    }

    public String getBuhege() {
        return this.buhege;
    }
    
    public void setBuhege(String buhege) {
        this.buhege = buhege;
    }

    public String getDeals() {
        return this.deals;
    }
    
    public void setDeals(String deals) {
        this.deals = deals;
    }

    public String getUnqualifyId() {
        return this.unqualifyId;
    }
    
    public void setUnqualifyId(String unqualifyId) {
        this.unqualifyId = unqualifyId;
    }

    public Set getRetgoods() {
        return this.retgoods;
    }
    
    public void setRetgoods(Set retgoods) {
        this.retgoods = retgoods;
    }

    public Set getUnqualifieds() {
        return this.unqualifieds;
    }
    
    public void setUnqualifieds(Set unqualifieds) {
        this.unqualifieds = unqualifieds;
    }
   








}