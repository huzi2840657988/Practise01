package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Yrecruitment entity. @author MyEclipse Persistence Tools
 */

public class Yrecruitment  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer isUser;
     private String recruitmentName;
     private Set recruitments = new HashSet(0);


    // Constructors

    /** default constructor */
    public Yrecruitment() {
    }

    
    /** full constructor */
    public Yrecruitment(Integer isUser, String recruitmentName, Set recruitments) {
        this.isUser = isUser;
        this.recruitmentName = recruitmentName;
        this.recruitments = recruitments;
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

    public String getRecruitmentName() {
        return this.recruitmentName;
    }
    
    public void setRecruitmentName(String recruitmentName) {
        this.recruitmentName = recruitmentName;
    }

    public Set getRecruitments() {
        return this.recruitments;
    }
    
    public void setRecruitments(Set recruitments) {
        this.recruitments = recruitments;
    }
   








}