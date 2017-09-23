package com.fjsdfx.bean;



/**
 * Rewgood entity. @author MyEclipse Persistence Tools
 */

public class Rewgood  implements java.io.Serializable {


    // Fields    

     private Integer rewgid;
     private Rewinder rewinder;
     private Itemtype itemtype;
     private Integer bsno;
     private Integer factno;
     private Boolean rewexamine;
     private Integer rewno;
     private String rewnote;
     private Float rewprice;
     private String rewunit;
     private Float rewuprice;


    // Constructors

    /** default constructor */
    public Rewgood() {
    }

	/** minimal constructor */
    public Rewgood(Boolean rewexamine, Float rewprice, Float rewuprice) {
        this.rewexamine = rewexamine;
        this.rewprice = rewprice;
        this.rewuprice = rewuprice;
    }
    
    /** full constructor */
    public Rewgood(Rewinder rewinder, Itemtype itemtype, Integer bsno, Integer factno, Boolean rewexamine, Integer rewno, String rewnote, Float rewprice, String rewunit, Float rewuprice) {
        this.rewinder = rewinder;
        this.itemtype = itemtype;
        this.bsno = bsno;
        this.factno = factno;
        this.rewexamine = rewexamine;
        this.rewno = rewno;
        this.rewnote = rewnote;
        this.rewprice = rewprice;
        this.rewunit = rewunit;
        this.rewuprice = rewuprice;
    }

   
    // Property accessors

    public Integer getRewgid() {
        return this.rewgid;
    }
    
    public void setRewgid(Integer rewgid) {
        this.rewgid = rewgid;
    }

    public Rewinder getRewinder() {
        return this.rewinder;
    }
    
    public void setRewinder(Rewinder rewinder) {
        this.rewinder = rewinder;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getBsno() {
        return this.bsno;
    }
    
    public void setBsno(Integer bsno) {
        this.bsno = bsno;
    }

    public Integer getFactno() {
        return this.factno;
    }
    
    public void setFactno(Integer factno) {
        this.factno = factno;
    }

    public Boolean getRewexamine() {
        return this.rewexamine;
    }
    
    public void setRewexamine(Boolean rewexamine) {
        this.rewexamine = rewexamine;
    }

    public Integer getRewno() {
        return this.rewno;
    }
    
    public void setRewno(Integer rewno) {
        this.rewno = rewno;
    }

    public String getRewnote() {
        return this.rewnote;
    }
    
    public void setRewnote(String rewnote) {
        this.rewnote = rewnote;
    }

    public Float getRewprice() {
        return this.rewprice;
    }
    
    public void setRewprice(Float rewprice) {
        this.rewprice = rewprice;
    }

    public String getRewunit() {
        return this.rewunit;
    }
    
    public void setRewunit(String rewunit) {
        this.rewunit = rewunit;
    }

    public Float getRewuprice() {
        return this.rewuprice;
    }
    
    public void setRewuprice(Float rewuprice) {
        this.rewuprice = rewuprice;
    }
   








}