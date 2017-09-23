package com.fjsdfx.bean;

import java.util.Date;


/**
 * Repairproduction entity. @author MyEclipse Persistence Tools
 */

public class Repairproduction  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String itemTypeName;
     private Integer pno;
     private Date recDate;
     private String repstatus;


    // Constructors

    /** default constructor */
    public Repairproduction() {
    }

    
    /** full constructor */
    public Repairproduction(String itemTypeName, Integer pno, Date recDate, String repstatus) {
        this.itemTypeName = itemTypeName;
        this.pno = pno;
        this.recDate = recDate;
        this.repstatus = repstatus;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemTypeName() {
        return this.itemTypeName;
    }
    
    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public Integer getPno() {
        return this.pno;
    }
    
    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public Date getRecDate() {
        return this.recDate;
    }
    
    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public String getRepstatus() {
        return this.repstatus;
    }
    
    public void setRepstatus(String repstatus) {
        this.repstatus = repstatus;
    }
   








}