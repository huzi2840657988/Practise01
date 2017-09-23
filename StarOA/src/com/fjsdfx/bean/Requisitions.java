package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Requisitions entity. @author MyEclipse Persistence Tools
 */

public class Requisitions  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employeeByBmanagerEmpId;
     private Employee employeeByBuyerEmpId;
     private Employee employeeByDpmanagerEmpId;
     private Employee employeeByCmanagerEmpId;
     private Quaprolist quaprolist;
     private Employee employeeByDmanagerEmpId;
     private String directions;
     private Boolean enter;
     private Set resgoods = new HashSet(0);
     private Set resgoods_1 = new HashSet(0);


    // Constructors

    /** default constructor */
    public Requisitions() {
    }

    
    /** full constructor */
    public Requisitions(Employee employeeByBmanagerEmpId, Employee employeeByBuyerEmpId, Employee employeeByDpmanagerEmpId, Employee employeeByCmanagerEmpId, Quaprolist quaprolist, Employee employeeByDmanagerEmpId, String directions, Boolean enter, Set resgoods, Set resgoods_1) {
        this.employeeByBmanagerEmpId = employeeByBmanagerEmpId;
        this.employeeByBuyerEmpId = employeeByBuyerEmpId;
        this.employeeByDpmanagerEmpId = employeeByDpmanagerEmpId;
        this.employeeByCmanagerEmpId = employeeByCmanagerEmpId;
        this.quaprolist = quaprolist;
        this.employeeByDmanagerEmpId = employeeByDmanagerEmpId;
        this.directions = directions;
        this.enter = enter;
        this.resgoods = resgoods;
        this.resgoods_1 = resgoods_1;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployeeByBmanagerEmpId() {
        return this.employeeByBmanagerEmpId;
    }
    
    public void setEmployeeByBmanagerEmpId(Employee employeeByBmanagerEmpId) {
        this.employeeByBmanagerEmpId = employeeByBmanagerEmpId;
    }

    public Employee getEmployeeByBuyerEmpId() {
        return this.employeeByBuyerEmpId;
    }
    
    public void setEmployeeByBuyerEmpId(Employee employeeByBuyerEmpId) {
        this.employeeByBuyerEmpId = employeeByBuyerEmpId;
    }

    public Employee getEmployeeByDpmanagerEmpId() {
        return this.employeeByDpmanagerEmpId;
    }
    
    public void setEmployeeByDpmanagerEmpId(Employee employeeByDpmanagerEmpId) {
        this.employeeByDpmanagerEmpId = employeeByDpmanagerEmpId;
    }

    public Employee getEmployeeByCmanagerEmpId() {
        return this.employeeByCmanagerEmpId;
    }
    
    public void setEmployeeByCmanagerEmpId(Employee employeeByCmanagerEmpId) {
        this.employeeByCmanagerEmpId = employeeByCmanagerEmpId;
    }

    public Quaprolist getQuaprolist() {
        return this.quaprolist;
    }
    
    public void setQuaprolist(Quaprolist quaprolist) {
        this.quaprolist = quaprolist;
    }

    public Employee getEmployeeByDmanagerEmpId() {
        return this.employeeByDmanagerEmpId;
    }
    
    public void setEmployeeByDmanagerEmpId(Employee employeeByDmanagerEmpId) {
        this.employeeByDmanagerEmpId = employeeByDmanagerEmpId;
    }

    public String getDirections() {
        return this.directions;
    }
    
    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Boolean getEnter() {
        return this.enter;
    }
    
    public void setEnter(Boolean enter) {
        this.enter = enter;
    }

    public Set getResgoods() {
        return this.resgoods;
    }
    
    public void setResgoods(Set resgoods) {
        this.resgoods = resgoods;
    }

    public Set getResgoods_1() {
        return this.resgoods_1;
    }
    
    public void setResgoods_1(Set resgoods_1) {
        this.resgoods_1 = resgoods_1;
    }
   








}