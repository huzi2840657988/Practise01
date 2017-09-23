package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Supsendm3 entity. @author MyEclipse Persistence Tools
 */

public class Supsendm3  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Department department;
     private Itemtype itemtype;
     private Preparation preparation;
     private String hawversion;
     private Integer needNum;
     private Timestamp sudate;
     private Integer worshipConfirm;
     private Set susgood3s = new HashSet(0);


    // Constructors

    /** default constructor */
    public Supsendm3() {
    }

    
    /** full constructor */
    public Supsendm3(Department department, Itemtype itemtype, Preparation preparation, String hawversion, Integer needNum, Timestamp sudate, Integer worshipConfirm, Set susgood3s) {
        this.department = department;
        this.itemtype = itemtype;
        this.preparation = preparation;
        this.hawversion = hawversion;
        this.needNum = needNum;
        this.sudate = sudate;
        this.worshipConfirm = worshipConfirm;
        this.susgood3s = susgood3s;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
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

    public String getHawversion() {
        return this.hawversion;
    }
    
    public void setHawversion(String hawversion) {
        this.hawversion = hawversion;
    }

    public Integer getNeedNum() {
        return this.needNum;
    }
    
    public void setNeedNum(Integer needNum) {
        this.needNum = needNum;
    }

    public Timestamp getSudate() {
        return this.sudate;
    }
    
    public void setSudate(Timestamp sudate) {
        this.sudate = sudate;
    }

    public Integer getWorshipConfirm() {
        return this.worshipConfirm;
    }
    
    public void setWorshipConfirm(Integer worshipConfirm) {
        this.worshipConfirm = worshipConfirm;
    }

    public Set getSusgood3s() {
        return this.susgood3s;
    }
    
    public void setSusgood3s(Set susgood3s) {
        this.susgood3s = susgood3s;
    }
   








}