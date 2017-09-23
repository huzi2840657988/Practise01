package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Jobs entity. @author MyEclipse Persistence Tools
 */

public class Jobs  implements java.io.Serializable {


    // Fields    

     private Integer jobId;
     private String jobDes;
     private String jobName;
     private Set employees = new HashSet(0);


    // Constructors

    /** default constructor */
    public Jobs() {
    }

    
    /** full constructor */
    public Jobs(String jobDes, String jobName, Set employees) {
        this.jobDes = jobDes;
        this.jobName = jobName;
        this.employees = employees;
    }

   
    // Property accessors

    public Integer getJobId() {
        return this.jobId;
    }
    
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobDes() {
        return this.jobDes;
    }
    
    public void setJobDes(String jobDes) {
        this.jobDes = jobDes;
    }

    public String getJobName() {
        return this.jobName;
    }
    
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }
   








}