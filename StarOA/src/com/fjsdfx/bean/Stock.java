package com.fjsdfx.bean;



/**
 * Stock entity. @author MyEclipse Persistence Tools
 */

public class Stock  implements java.io.Serializable {


    // Fields    

     private Integer stoId;
     private Itemtype itemtype;
     private Integer ennum;
     private Integer outnum;
     private Integer scrnum;
     private Integer stonum;
     private String whname;


    // Constructors

    /** default constructor */
    public Stock() {
    }

    
    /** full constructor */
    public Stock(Itemtype itemtype, Integer ennum, Integer outnum, Integer scrnum, Integer stonum, String whname) {
        this.itemtype = itemtype;
        this.ennum = ennum;
        this.outnum = outnum;
        this.scrnum = scrnum;
        this.stonum = stonum;
        this.whname = whname;
    }

   
    // Property accessors

    public Integer getStoId() {
        return this.stoId;
    }
    
    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getEnnum() {
        return this.ennum;
    }
    
    public void setEnnum(Integer ennum) {
        this.ennum = ennum;
    }

    public Integer getOutnum() {
        return this.outnum;
    }
    
    public void setOutnum(Integer outnum) {
        this.outnum = outnum;
    }

    public Integer getScrnum() {
        return this.scrnum;
    }
    
    public void setScrnum(Integer scrnum) {
        this.scrnum = scrnum;
    }

    public Integer getStonum() {
        return this.stonum;
    }
    
    public void setStonum(Integer stonum) {
        this.stonum = stonum;
    }

    public String getWhname() {
        return this.whname;
    }
    
    public void setWhname(String whname) {
        this.whname = whname;
    }
   








}