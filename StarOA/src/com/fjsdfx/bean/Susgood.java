package com.fjsdfx.bean;



/**
 * Susgood entity. @author MyEclipse Persistence Tools
 */

public class Susgood  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Supsendm supsendm;
     private Itemtype itemtype;
     private Integer bondednum;
     private Integer generalno;
     private Integer lbalance;
     private Integer no;
     private String note;
     private Integer singleset;
     private Integer tbalance;


    // Constructors

    /** default constructor */
    public Susgood() {
    }

    
    /** full constructor */
    public Susgood(Supsendm supsendm, Itemtype itemtype, Integer bondednum, Integer generalno, Integer lbalance, Integer no, String note, Integer singleset, Integer tbalance) {
        this.supsendm = supsendm;
        this.itemtype = itemtype;
        this.bondednum = bondednum;
        this.generalno = generalno;
        this.lbalance = lbalance;
        this.no = no;
        this.note = note;
        this.singleset = singleset;
        this.tbalance = tbalance;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Supsendm getSupsendm() {
        return this.supsendm;
    }
    
    public void setSupsendm(Supsendm supsendm) {
        this.supsendm = supsendm;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getBondednum() {
        return this.bondednum;
    }
    
    public void setBondednum(Integer bondednum) {
        this.bondednum = bondednum;
    }

    public Integer getGeneralno() {
        return this.generalno;
    }
    
    public void setGeneralno(Integer generalno) {
        this.generalno = generalno;
    }

    public Integer getLbalance() {
        return this.lbalance;
    }
    
    public void setLbalance(Integer lbalance) {
        this.lbalance = lbalance;
    }

    public Integer getNo() {
        return this.no;
    }
    
    public void setNo(Integer no) {
        this.no = no;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSingleset() {
        return this.singleset;
    }
    
    public void setSingleset(Integer singleset) {
        this.singleset = singleset;
    }

    public Integer getTbalance() {
        return this.tbalance;
    }
    
    public void setTbalance(Integer tbalance) {
        this.tbalance = tbalance;
    }
   








}