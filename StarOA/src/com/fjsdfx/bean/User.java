package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employee;
     private Boolean disabled;
     private String name;
     private String password;
     private String rasmessages;
     private String rasmessages2;
     private Set userRoles = new HashSet(0);
     private Set rasmessagesForSper = new HashSet(0);
     private Set rasmessagesForRper = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(Boolean disabled) {
        this.disabled = disabled;
    }
    
    /** full constructor */
    public User(Employee employee, Boolean disabled, String name, String password, String rasmessages, String rasmessages2, Set userRoles, Set rasmessagesForSper, Set rasmessagesForRper) {
        this.employee = employee;
        this.disabled = disabled;
        this.name = name;
        this.password = password;
        this.rasmessages = rasmessages;
        this.rasmessages2 = rasmessages2;
        this.userRoles = userRoles;
        this.rasmessagesForSper = rasmessagesForSper;
        this.rasmessagesForRper = rasmessagesForRper;
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

    public Boolean getDisabled() {
        return this.disabled;
    }
    
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRasmessages() {
        return this.rasmessages;
    }
    
    public void setRasmessages(String rasmessages) {
        this.rasmessages = rasmessages;
    }

    public String getRasmessages2() {
        return this.rasmessages2;
    }
    
    public void setRasmessages2(String rasmessages2) {
        this.rasmessages2 = rasmessages2;
    }

    public Set getUserRoles() {
        return this.userRoles;
    }
    
    public void setUserRoles(Set userRoles) {
        this.userRoles = userRoles;
    }

    public Set getRasmessagesForSper() {
        return this.rasmessagesForSper;
    }
    
    public void setRasmessagesForSper(Set rasmessagesForSper) {
        this.rasmessagesForSper = rasmessagesForSper;
    }

    public Set getRasmessagesForRper() {
        return this.rasmessagesForRper;
    }
    
    public void setRasmessagesForRper(Set rasmessagesForRper) {
        this.rasmessagesForRper = rasmessagesForRper;
    }
   








}