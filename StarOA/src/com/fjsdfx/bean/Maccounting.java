package com.fjsdfx.bean;

import java.util.Date;


/**
 * Maccounting entity. @author MyEclipse Persistence Tools
 */

public class Maccounting  implements java.io.Serializable {


    // Fields    

     private Integer macId;
     private Itemtype itemtype;
     private Integer ennum;
     private Date macdate;
     private String notes;
     private Integer outnum;
     private Integer stonum;
     private String whname;


    // Constructors

    /** default constructor */
    public Maccounting() {
    }

    
    /** full constructor */
    public Maccounting(Itemtype itemtype, Integer ennum, Date macdate, String notes, Integer outnum, Integer stonum, String whname) {
        this.itemtype = itemtype;
        this.ennum = ennum;
        this.macdate = macdate;
        this.notes = notes;
        this.outnum = outnum;
        this.stonum = stonum;
        this.whname = whname;
    }

   
    // Property accessors

    public Integer getMacId() {
        return this.macId;
    }
    
    public void setMacId(Integer macId) {
        this.macId = macId;
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

    public Date getMacdate() {
        return this.macdate;
    }
    
    public void setMacdate(Date macdate) {
        this.macdate = macdate;
    }

    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getOutnum() {
        return this.outnum;
    }
    
    public void setOutnum(Integer outnum) {
        this.outnum = outnum;
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