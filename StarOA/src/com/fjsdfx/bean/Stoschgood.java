package com.fjsdfx.bean;



/**
 * Stoschgood entity. @author MyEclipse Persistence Tools
 */

public class Stoschgood  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Department department;
     private Itemtype itemtype;
     private Storescheduling storescheduling;
     private Integer qualitynum;
     private Integer stonum;


    // Constructors

    /** default constructor */
    public Stoschgood() {
    }

    
    /** full constructor */
    public Stoschgood(Department department, Itemtype itemtype, Storescheduling storescheduling, Integer qualitynum, Integer stonum) {
        this.department = department;
        this.itemtype = itemtype;
        this.storescheduling = storescheduling;
        this.qualitynum = qualitynum;
        this.stonum = stonum;
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

    public Storescheduling getStorescheduling() {
        return this.storescheduling;
    }
    
    public void setStorescheduling(Storescheduling storescheduling) {
        this.storescheduling = storescheduling;
    }

    public Integer getQualitynum() {
        return this.qualitynum;
    }
    
    public void setQualitynum(Integer qualitynum) {
        this.qualitynum = qualitynum;
    }

    public Integer getStonum() {
        return this.stonum;
    }
    
    public void setStonum(Integer stonum) {
        this.stonum = stonum;
    }
   








}