package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Training entity. @author MyEclipse Persistence Tools
 */

public class Training  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Department department;
     private String dateTemp;
     private Timestamp eddate;
     private String exam;
     private String lecture;
     private Timestamp stDate;
     private String traName;
     private Integer traNumber;
     private String tracontent;
     private Set employees = new HashSet(0);
     private Set ytrainplans = new HashSet(0);


    // Constructors

    /** default constructor */
    public Training() {
    }

    
    /** full constructor */
    public Training(Department department, String dateTemp, Timestamp eddate, String exam, String lecture, Timestamp stDate, String traName, Integer traNumber, String tracontent, Set employees, Set ytrainplans) {
        this.department = department;
        this.dateTemp = dateTemp;
        this.eddate = eddate;
        this.exam = exam;
        this.lecture = lecture;
        this.stDate = stDate;
        this.traName = traName;
        this.traNumber = traNumber;
        this.tracontent = tracontent;
        this.employees = employees;
        this.ytrainplans = ytrainplans;
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

    public String getDateTemp() {
        return this.dateTemp;
    }
    
    public void setDateTemp(String dateTemp) {
        this.dateTemp = dateTemp;
    }

    public Timestamp getEddate() {
        return this.eddate;
    }
    
    public void setEddate(Timestamp eddate) {
        this.eddate = eddate;
    }

    public String getExam() {
        return this.exam;
    }
    
    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getLecture() {
        return this.lecture;
    }
    
    public void setLecture(String lecture) {
        this.lecture = lecture;
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

    public Integer getTraNumber() {
        return this.traNumber;
    }
    
    public void setTraNumber(Integer traNumber) {
        this.traNumber = traNumber;
    }

    public String getTracontent() {
        return this.tracontent;
    }
    
    public void setTracontent(String tracontent) {
        this.tracontent = tracontent;
    }

    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }

    public Set getYtrainplans() {
        return this.ytrainplans;
    }
    
    public void setYtrainplans(Set ytrainplans) {
        this.ytrainplans = ytrainplans;
    }
   








}