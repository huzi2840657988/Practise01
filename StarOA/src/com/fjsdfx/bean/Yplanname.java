package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Yplanname entity. @author MyEclipse Persistence Tools
 */

public class Yplanname  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer isUser;
     private String planname;
     private Timestamp names;
     private Set ytrainplansForYplanname = new HashSet(0);
     private Set ytrainplansForYplannameId = new HashSet(0);


    // Constructors

    /** default constructor */
    public Yplanname() {
    }

    
    /** full constructor */
    public Yplanname(Integer isUser, String planname, Timestamp names, Set ytrainplansForYplanname, Set ytrainplansForYplannameId) {
        this.isUser = isUser;
        this.planname = planname;
        this.names = names;
        this.ytrainplansForYplanname = ytrainplansForYplanname;
        this.ytrainplansForYplannameId = ytrainplansForYplannameId;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsUser() {
        return this.isUser;
    }
    
    public void setIsUser(Integer isUser) {
        this.isUser = isUser;
    }

    public String getPlanname() {
        return this.planname;
    }
    
    public void setPlanname(String planname) {
        this.planname = planname;
    }

    public Timestamp getNames() {
        return this.names;
    }
    
    public void setNames(Timestamp names) {
        this.names = names;
    }

    public Set getYtrainplansForYplanname() {
        return this.ytrainplansForYplanname;
    }
    
    public void setYtrainplansForYplanname(Set ytrainplansForYplanname) {
        this.ytrainplansForYplanname = ytrainplansForYplanname;
    }

    public Set getYtrainplansForYplannameId() {
        return this.ytrainplansForYplannameId;
    }
    
    public void setYtrainplansForYplannameId(Set ytrainplansForYplannameId) {
        this.ytrainplansForYplannameId = ytrainplansForYplannameId;
    }
   








}