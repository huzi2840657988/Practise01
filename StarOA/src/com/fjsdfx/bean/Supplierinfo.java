package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Supplierinfo entity. @author MyEclipse Persistence Tools
 */

public class Supplierinfo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employeeByWperEmpId;
     private Employee employeeByCheckperEmpId;
     private String address;
     private String availability;
     private String award;
     private String business;
     private Date checkdate;
     private String itemname;
     private String itemtypename;
     private String muser;
     private String notes;
     private String obtain;
     private Integer output;
     private String phone;
     private String qsituation;
     private String quality;
     private String quamger;
     private String supcname;
     private String supcycle;
     private String supename;
     private String tech;
     private Date wdate;
     private Set testnoteses = new HashSet(0);
     private Set samidentifieds = new HashSet(0);
     private Set supidentifieds = new HashSet(0);
     private Set quaprolists = new HashSet(0);


    // Constructors

    /** default constructor */
    public Supplierinfo() {
    }

    
    /** full constructor */
    public Supplierinfo(Employee employeeByWperEmpId, Employee employeeByCheckperEmpId, String address, String availability, String award, String business, Date checkdate, String itemname, String itemtypename, String muser, String notes, String obtain, Integer output, String phone, String qsituation, String quality, String quamger, String supcname, String supcycle, String supename, String tech, Date wdate, Set testnoteses, Set samidentifieds, Set supidentifieds, Set quaprolists) {
        this.employeeByWperEmpId = employeeByWperEmpId;
        this.employeeByCheckperEmpId = employeeByCheckperEmpId;
        this.address = address;
        this.availability = availability;
        this.award = award;
        this.business = business;
        this.checkdate = checkdate;
        this.itemname = itemname;
        this.itemtypename = itemtypename;
        this.muser = muser;
        this.notes = notes;
        this.obtain = obtain;
        this.output = output;
        this.phone = phone;
        this.qsituation = qsituation;
        this.quality = quality;
        this.quamger = quamger;
        this.supcname = supcname;
        this.supcycle = supcycle;
        this.supename = supename;
        this.tech = tech;
        this.wdate = wdate;
        this.testnoteses = testnoteses;
        this.samidentifieds = samidentifieds;
        this.supidentifieds = supidentifieds;
        this.quaprolists = quaprolists;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployeeByWperEmpId() {
        return this.employeeByWperEmpId;
    }
    
    public void setEmployeeByWperEmpId(Employee employeeByWperEmpId) {
        this.employeeByWperEmpId = employeeByWperEmpId;
    }

    public Employee getEmployeeByCheckperEmpId() {
        return this.employeeByCheckperEmpId;
    }
    
    public void setEmployeeByCheckperEmpId(Employee employeeByCheckperEmpId) {
        this.employeeByCheckperEmpId = employeeByCheckperEmpId;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvailability() {
        return this.availability;
    }
    
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getAward() {
        return this.award;
    }
    
    public void setAward(String award) {
        this.award = award;
    }

    public String getBusiness() {
        return this.business;
    }
    
    public void setBusiness(String business) {
        this.business = business;
    }

    public Date getCheckdate() {
        return this.checkdate;
    }
    
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getItemname() {
        return this.itemname;
    }
    
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemtypename() {
        return this.itemtypename;
    }
    
    public void setItemtypename(String itemtypename) {
        this.itemtypename = itemtypename;
    }

    public String getMuser() {
        return this.muser;
    }
    
    public void setMuser(String muser) {
        this.muser = muser;
    }

    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getObtain() {
        return this.obtain;
    }
    
    public void setObtain(String obtain) {
        this.obtain = obtain;
    }

    public Integer getOutput() {
        return this.output;
    }
    
    public void setOutput(Integer output) {
        this.output = output;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQsituation() {
        return this.qsituation;
    }
    
    public void setQsituation(String qsituation) {
        this.qsituation = qsituation;
    }

    public String getQuality() {
        return this.quality;
    }
    
    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getQuamger() {
        return this.quamger;
    }
    
    public void setQuamger(String quamger) {
        this.quamger = quamger;
    }

    public String getSupcname() {
        return this.supcname;
    }
    
    public void setSupcname(String supcname) {
        this.supcname = supcname;
    }

    public String getSupcycle() {
        return this.supcycle;
    }
    
    public void setSupcycle(String supcycle) {
        this.supcycle = supcycle;
    }

    public String getSupename() {
        return this.supename;
    }
    
    public void setSupename(String supename) {
        this.supename = supename;
    }

    public String getTech() {
        return this.tech;
    }
    
    public void setTech(String tech) {
        this.tech = tech;
    }

    public Date getWdate() {
        return this.wdate;
    }
    
    public void setWdate(Date wdate) {
        this.wdate = wdate;
    }

    public Set getTestnoteses() {
        return this.testnoteses;
    }
    
    public void setTestnoteses(Set testnoteses) {
        this.testnoteses = testnoteses;
    }

    public Set getSamidentifieds() {
        return this.samidentifieds;
    }
    
    public void setSamidentifieds(Set samidentifieds) {
        this.samidentifieds = samidentifieds;
    }

    public Set getSupidentifieds() {
        return this.supidentifieds;
    }
    
    public void setSupidentifieds(Set supidentifieds) {
        this.supidentifieds = supidentifieds;
    }

    public Set getQuaprolists() {
        return this.quaprolists;
    }
    
    public void setQuaprolists(Set quaprolists) {
        this.quaprolists = quaprolists;
    }
   








}