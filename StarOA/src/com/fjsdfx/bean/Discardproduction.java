package com.fjsdfx.bean;



/**
 * Discardproduction entity. @author MyEclipse Persistence Tools
 */

public class Discardproduction  implements java.io.Serializable {


    // Fields    

     private Integer scgId;
     private Discardverify discardverify;
     private Itemtype itemtype;
     private Float losemoney;
     private String losetime;
     private Integer number;
     private String reason;


    // Constructors

    /** default constructor */
    public Discardproduction() {
    }

	/** minimal constructor */
    public Discardproduction(Float losemoney) {
        this.losemoney = losemoney;
    }
    
    /** full constructor */
    public Discardproduction(Discardverify discardverify, Itemtype itemtype, Float losemoney, String losetime, Integer number, String reason) {
        this.discardverify = discardverify;
        this.itemtype = itemtype;
        this.losemoney = losemoney;
        this.losetime = losetime;
        this.number = number;
        this.reason = reason;
    }

   
    // Property accessors

    public Integer getScgId() {
        return this.scgId;
    }
    
    public void setScgId(Integer scgId) {
        this.scgId = scgId;
    }

    public Discardverify getDiscardverify() {
        return this.discardverify;
    }
    
    public void setDiscardverify(Discardverify discardverify) {
        this.discardverify = discardverify;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Float getLosemoney() {
        return this.losemoney;
    }
    
    public void setLosemoney(Float losemoney) {
        this.losemoney = losemoney;
    }

    public String getLosetime() {
        return this.losetime;
    }
    
    public void setLosetime(String losetime) {
        this.losetime = losetime;
    }

    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
   








}