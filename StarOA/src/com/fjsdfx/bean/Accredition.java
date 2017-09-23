package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Accredition entity. @author MyEclipse Persistence Tools
 */

public class Accredition  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Preparation preparation;
     private Employee employee;
     private Timestamp adate;
     private String content;


    // Constructors

    /** default constructor */
    public Accredition() {
    }

    
    /** full constructor */
    public Accredition(Preparation preparation, Employee employee, Timestamp adate, String content) {
        this.preparation = preparation;
        this.employee = employee;
        this.adate = adate;
        this.content = content;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Preparation getPreparation() {
        return this.preparation;
    }
    
    public void setPreparation(Preparation preparation) {
        this.preparation = preparation;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Timestamp getAdate() {
        return this.adate;
    }
    
    public void setAdate(Timestamp adate) {
        this.adate = adate;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
   








}