package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Recruitment entity. @author MyEclipse Persistence Tools
 */

public class Recruitment  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Department department;
     private Yrecruitment yrecruitment;
     private String baserec;
     private Integer isCheck;
     private Integer isyear;
     private Timestamp rdate;
     private String recnature;
     private Integer recno;
     private String recstyle;


    // Constructors

    /** default constructor */
    public Recruitment() {
    }

	/** minimal constructor */
    public Recruitment(Department department) {
        this.department = department;
    }
    
    /** full constructor */
    public Recruitment(Department department, Yrecruitment yrecruitment, String baserec, Integer isCheck, Integer isyear, Timestamp rdate, String recnature, Integer recno, String recstyle) {
        this.department = department;
        this.yrecruitment = yrecruitment;
        this.baserec = baserec;
        this.isCheck = isCheck;
        this.isyear = isyear;
        this.rdate = rdate;
        this.recnature = recnature;
        this.recno = recno;
        this.recstyle = recstyle;
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

    public Yrecruitment getYrecruitment() {
        return this.yrecruitment;
    }
    
    public void setYrecruitment(Yrecruitment yrecruitment) {
        this.yrecruitment = yrecruitment;
    }

    public String getBaserec() {
        return this.baserec;
    }
    
    public void setBaserec(String baserec) {
        this.baserec = baserec;
    }

    public Integer getIsCheck() {
        return this.isCheck;
    }
    
    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getIsyear() {
        return this.isyear;
    }
    
    public void setIsyear(Integer isyear) {
        this.isyear = isyear;
    }

    public Timestamp getRdate() {
        return this.rdate;
    }
    
    public void setRdate(Timestamp rdate) {
        this.rdate = rdate;
    }

    public String getRecnature() {
        return this.recnature;
    }
    
    public void setRecnature(String recnature) {
        this.recnature = recnature;
    }

    public Integer getRecno() {
        return this.recno;
    }
    
    public void setRecno(Integer recno) {
        this.recno = recno;
    }

    public String getRecstyle() {
        return this.recstyle;
    }
    
    public void setRecstyle(String recstyle) {
        this.recstyle = recstyle;
    }
   








}