package com.fjsdfx.bean;



/**
 * Retgood entity. @author MyEclipse Persistence Tools
 */

public class Retgood  implements java.io.Serializable {


    // Fields    

     private Integer retgid;
     private Rmtotal rmtotal;
     private Qualityanalysis qualityanalysis;
     private Returned returned;
     private Itemtype itemtype;
     private Integer retno;


    // Constructors

    /** default constructor */
    public Retgood() {
    }

    
    /** full constructor */
    public Retgood(Rmtotal rmtotal, Qualityanalysis qualityanalysis, Returned returned, Itemtype itemtype, Integer retno) {
        this.rmtotal = rmtotal;
        this.qualityanalysis = qualityanalysis;
        this.returned = returned;
        this.itemtype = itemtype;
        this.retno = retno;
    }

   
    // Property accessors

    public Integer getRetgid() {
        return this.retgid;
    }
    
    public void setRetgid(Integer retgid) {
        this.retgid = retgid;
    }

    public Rmtotal getRmtotal() {
        return this.rmtotal;
    }
    
    public void setRmtotal(Rmtotal rmtotal) {
        this.rmtotal = rmtotal;
    }

    public Qualityanalysis getQualityanalysis() {
        return this.qualityanalysis;
    }
    
    public void setQualityanalysis(Qualityanalysis qualityanalysis) {
        this.qualityanalysis = qualityanalysis;
    }

    public Returned getReturned() {
        return this.returned;
    }
    
    public void setReturned(Returned returned) {
        this.returned = returned;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getRetno() {
        return this.retno;
    }
    
    public void setRetno(Integer retno) {
        this.retno = retno;
    }
   








}