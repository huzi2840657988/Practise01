package com.fjsdfx.bean;



/**
 * Inventory entity. @author MyEclipse Persistence Tools
 */

public class Inventory  implements java.io.Serializable {


    // Fields    

     private Integer invId;
     private Itemtype itemtype;
     private Integer solationnum;
     private Integer stocknum;
     private Integer totalnum;
     private Integer wsstock;


    // Constructors

    /** default constructor */
    public Inventory() {
    }

    
    /** full constructor */
    public Inventory(Itemtype itemtype, Integer solationnum, Integer stocknum, Integer totalnum, Integer wsstock) {
        this.itemtype = itemtype;
        this.solationnum = solationnum;
        this.stocknum = stocknum;
        this.totalnum = totalnum;
        this.wsstock = wsstock;
    }

   
    // Property accessors

    public Integer getInvId() {
        return this.invId;
    }
    
    public void setInvId(Integer invId) {
        this.invId = invId;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getSolationnum() {
        return this.solationnum;
    }
    
    public void setSolationnum(Integer solationnum) {
        this.solationnum = solationnum;
    }

    public Integer getStocknum() {
        return this.stocknum;
    }
    
    public void setStocknum(Integer stocknum) {
        this.stocknum = stocknum;
    }

    public Integer getTotalnum() {
        return this.totalnum;
    }
    
    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }

    public Integer getWsstock() {
        return this.wsstock;
    }
    
    public void setWsstock(Integer wsstock) {
        this.wsstock = wsstock;
    }
   








}