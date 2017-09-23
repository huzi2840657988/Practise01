package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String description;
     private String name;
     private Set roleResources = new HashSet(0);
     private Set userRoles = new HashSet(0);


    // Constructors

    /** default constructor */
    public Role() {
    }

    
    /** full constructor */
    public Role(String description, String name, Set roleResources, Set userRoles) {
        this.description = description;
        this.name = name;
        this.roleResources = roleResources;
        this.userRoles = userRoles;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getRoleResources() {
        return this.roleResources;
    }
    
    public void setRoleResources(Set roleResources) {
        this.roleResources = roleResources;
    }

    public Set getUserRoles() {
        return this.userRoles;
    }
    
    public void setUserRoles(Set userRoles) {
        this.userRoles = userRoles;
    }
   








}