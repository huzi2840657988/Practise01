package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Rmtotal entity. @author MyEclipse Persistence Tools
 */

public class Rmtotal  implements java.io.Serializable {


    // Fields    

     private Integer rmtId;
     private Itemtype itemtype;
     private Integer msendnum;
     private Float munqrate;
     private Integer repairnum;
     private Timestamp rmonth;
     private Integer rnum;
     private Integer rtotal;
     private Integer scrapnum;
     private Integer tsendnum;
     private Float tunqrate;
     private Set retgoods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Rmtotal() {
    }

    
    /** full constructor */
    public Rmtotal(Itemtype itemtype, Integer msendnum, Float munqrate, Integer repairnum, Timestamp rmonth, Integer rnum, Integer rtotal, Integer scrapnum, Integer tsendnum, Float tunqrate, Set retgoods) {
        this.itemtype = itemtype;
        this.msendnum = msendnum;
        this.munqrate = munqrate;
        this.repairnum = repairnum;
        this.rmonth = rmonth;
        this.rnum = rnum;
        this.rtotal = rtotal;
        this.scrapnum = scrapnum;
        this.tsendnum = tsendnum;
        this.tunqrate = tunqrate;
        this.retgoods = retgoods;
    }

   
    // Property accessors

    public Integer getRmtId() {
        return this.rmtId;
    }
    
    public void setRmtId(Integer rmtId) {
        this.rmtId = rmtId;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getMsendnum() {
        return this.msendnum;
    }
    
    public void setMsendnum(Integer msendnum) {
        this.msendnum = msendnum;
    }

    public Float getMunqrate() {
        return this.munqrate;
    }
    
    public void setMunqrate(Float munqrate) {
        this.munqrate = munqrate;
    }

    public Integer getRepairnum() {
        return this.repairnum;
    }
    
    public void setRepairnum(Integer repairnum) {
        this.repairnum = repairnum;
    }

    public Timestamp getRmonth() {
        return this.rmonth;
    }
    
    public void setRmonth(Timestamp rmonth) {
        this.rmonth = rmonth;
    }

    public Integer getRnum() {
        return this.rnum;
    }
    
    public void setRnum(Integer rnum) {
        this.rnum = rnum;
    }

    public Integer getRtotal() {
        return this.rtotal;
    }
    
    public void setRtotal(Integer rtotal) {
        this.rtotal = rtotal;
    }

    public Integer getScrapnum() {
        return this.scrapnum;
    }
    
    public void setScrapnum(Integer scrapnum) {
        this.scrapnum = scrapnum;
    }

    public Integer getTsendnum() {
        return this.tsendnum;
    }
    
    public void setTsendnum(Integer tsendnum) {
        this.tsendnum = tsendnum;
    }

    public Float getTunqrate() {
        return this.tunqrate;
    }
    
    public void setTunqrate(Float tunqrate) {
        this.tunqrate = tunqrate;
    }

    public Set getRetgoods() {
        return this.retgoods;
    }
    
    public void setRetgoods(Set retgoods) {
        this.retgoods = retgoods;
    }
   








}