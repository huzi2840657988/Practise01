package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Pergood entity. @author MyEclipse Persistence Tools
 */

public class Pergood  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Preparation preparation;
     private Itemtype itemtype;
     private Timestamp edate;
     private String preNote;
     private Integer preNum;
     private Integer addsup;
     private Integer isExtraSup;


    // Constructors

    /** default constructor */
    public Pergood() {
    }

    
    /** full constructor */
    public Pergood(Preparation preparation, Itemtype itemtype, Timestamp edate, String preNote, Integer preNum, Integer addsup, Integer isExtraSup) {
        this.preparation = preparation;
        this.itemtype = itemtype;
        this.edate = edate;
        this.preNote = preNote;
        this.preNum = preNum;
        this.addsup = addsup;
        this.isExtraSup = isExtraSup;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Preparation getPreparation() {
        return this.preparation;
    }
    
    public void setPreparation(Preparation preparation) {
        this.preparation = preparation;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Timestamp getEdate() {
        return this.edate;
    }
    
    public void setEdate(Timestamp edate) {
        this.edate = edate;
    }

    public String getPreNote() {
        return this.preNote;
    }
    
    public void setPreNote(String preNote) {
        this.preNote = preNote;
    }

    public Integer getPreNum() {
        return this.preNum;
    }
    
    public void setPreNum(Integer preNum) {
        this.preNum = preNum;
    }

    public Integer getAddsup() {
        return this.addsup;
    }
    
    public void setAddsup(Integer addsup) {
        this.addsup = addsup;
    }

    public Integer getIsExtraSup() {
        return this.isExtraSup;
    }
    
    public void setIsExtraSup(Integer isExtraSup) {
        this.isExtraSup = isExtraSup;
    }
   








}