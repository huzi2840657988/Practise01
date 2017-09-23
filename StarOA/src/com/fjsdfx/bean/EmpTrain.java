package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * EmpTrain entity. @author MyEclipse Persistence Tools
 */

public class EmpTrain  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employee;
     private Timestamp stDate;
     private String traName;


    // Constructors

    /** default constructor */
    public EmpTrain() {
    }

    
    /** full constructor */
    public EmpTrain(Employee employee, Timestamp stDate, String traName) {
        this.employee = employee;
        this.stDate = stDate;
        this.traName = traName;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Timestamp getStDate() {
        return this.stDate;
    }
    
    public void setStDate(Timestamp stDate) {
        this.stDate = stDate;
    }

    public String getTraName() {
        return this.traName;
    }
    
    public void setTraName(String traName) {
        this.traName = traName;
    }
   








}