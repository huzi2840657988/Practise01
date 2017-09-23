package com.fjsdfx.bean;



/**
 * Shogood entity. @author MyEclipse Persistence Tools
 */

public class Shogood  implements java.io.Serializable {


    // Fields    

     private Integer shogId;
     private Shortm shortm;
     private Itemtype itemtype;
     private String note;
     private Integer num;
     private Float price;
     private String unit;
     private Float uprice;
     private String userf;


    // Constructors

    /** default constructor */
    public Shogood() {
    }

    
    /** full constructor */
    public Shogood(Shortm shortm, Itemtype itemtype, String note, Integer num, Float price, String unit, Float uprice, String userf) {
        this.shortm = shortm;
        this.itemtype = itemtype;
        this.note = note;
        this.num = num;
        this.price = price;
        this.unit = unit;
        this.uprice = uprice;
        this.userf = userf;
    }

   
    // Property accessors

    public Integer getShogId() {
        return this.shogId;
    }
    
    public void setShogId(Integer shogId) {
        this.shogId = shogId;
    }

    public Shortm getShortm() {
        return this.shortm;
    }
    
    public void setShortm(Shortm shortm) {
        this.shortm = shortm;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getPrice() {
        return this.price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getUprice() {
        return this.uprice;
    }
    
    public void setUprice(Float uprice) {
        this.uprice = uprice;
    }

    public String getUserf() {
        return this.userf;
    }
    
    public void setUserf(String userf) {
        this.userf = userf;
    }
   








}