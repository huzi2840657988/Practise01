package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Shortm entity. @author MyEclipse Persistence Tools
 */

public class Shortm  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Department department;
     private Employee employeeByWsmanager;
     private Employee employeeByRper;
     private String approve;
     private Date sdate;
     private String shoCheck;
     private String shoid;
     private String state;
     private Set shogoods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Shortm() {
    }

    
    /** full constructor */
    public Shortm(Department department, Employee employeeByWsmanager, Employee employeeByRper, String approve, Date sdate, String shoCheck, String shoid, String state, Set shogoods) {
        this.department = department;
        this.employeeByWsmanager = employeeByWsmanager;
        this.employeeByRper = employeeByRper;
        this.approve = approve;
        this.sdate = sdate;
        this.shoCheck = shoCheck;
        this.shoid = shoid;
        this.state = state;
        this.shogoods = shogoods;
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

    public Employee getEmployeeByWsmanager() {
        return this.employeeByWsmanager;
    }
    
    public void setEmployeeByWsmanager(Employee employeeByWsmanager) {
        this.employeeByWsmanager = employeeByWsmanager;
    }

    public Employee getEmployeeByRper() {
        return this.employeeByRper;
    }
    
    public void setEmployeeByRper(Employee employeeByRper) {
        this.employeeByRper = employeeByRper;
    }

    public String getApprove() {
        return this.approve;
    }
    
    public void setApprove(String approve) {
        this.approve = approve;
    }

    public Date getSdate() {
        return this.sdate;
    }
    
    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getShoCheck() {
        return this.shoCheck;
    }
    
    public void setShoCheck(String shoCheck) {
        this.shoCheck = shoCheck;
    }

    public String getShoid() {
        return this.shoid;
    }
    
    public void setShoid(String shoid) {
        this.shoid = shoid;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public Set getShogoods() {
        return this.shogoods;
    }
    
    public void setShogoods(Set shogoods) {
        this.shogoods = shogoods;
    }
   








}