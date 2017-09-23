package com.fjsdfx.bean;



/**
 * RoleResource entity. @author MyEclipse Persistence Tools
 */

public class RoleResource  implements java.io.Serializable {


    // Fields    

     private RoleResourceId id;


    // Constructors

    /** default constructor */
    public RoleResource() {
    }

    
    /** full constructor */
    public RoleResource(RoleResourceId id) {
        this.id = id;
    }

   
    // Property accessors

    public RoleResourceId getId() {
        return this.id;
    }
    
    public void setId(RoleResourceId id) {
        this.id = id;
    }
   








}