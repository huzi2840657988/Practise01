package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Dailyproductionform entity. @author MyEclipse Persistence Tools
 */

public class Dailyproductionform  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Department department;
     private Date date;
     private String info;
     private Set dailyproductions = new HashSet(0);


    // Constructors

    /** default constructor */
    public Dailyproductionform() {
    }

    
    /** full constructor */
    public Dailyproductionform(Department department, Date date, String info, Set dailyproductions) {
        this.department = department;
        this.date = date;
        this.info = info;
        this.dailyproductions = dailyproductions;
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

    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }

    public Set getDailyproductions() {
        return this.dailyproductions;
    }
    
    public void setDailyproductions(Set dailyproductions) {
        this.dailyproductions = dailyproductions;
    }
   








}