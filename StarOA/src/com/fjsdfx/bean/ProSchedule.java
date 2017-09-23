package com.fjsdfx.bean;

import java.util.Date;


/**
 * ProSchedule entity. @author MyEclipse Persistence Tools
 */

public class ProSchedule  implements java.io.Serializable {


    // Fields    

     private Integer prsId;
     private Itemtype itemtype;
     private Prscheck prscheck;
     private Date cdate;
     private String pcontent;
     private String pnote;
     private Integer pnumber;
     private String punit;


    // Constructors

    /** default constructor */
    public ProSchedule() {
    }

    
    /** full constructor */
    public ProSchedule(Itemtype itemtype, Prscheck prscheck, Date cdate, String pcontent, String pnote, Integer pnumber, String punit) {
        this.itemtype = itemtype;
        this.prscheck = prscheck;
        this.cdate = cdate;
        this.pcontent = pcontent;
        this.pnote = pnote;
        this.pnumber = pnumber;
        this.punit = punit;
    }

   
    // Property accessors

    public Integer getPrsId() {
        return this.prsId;
    }
    
    public void setPrsId(Integer prsId) {
        this.prsId = prsId;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Prscheck getPrscheck() {
        return this.prscheck;
    }
    
    public void setPrscheck(Prscheck prscheck) {
        this.prscheck = prscheck;
    }

    public Date getCdate() {
        return this.cdate;
    }
    
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getPcontent() {
        return this.pcontent;
    }
    
    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public String getPnote() {
        return this.pnote;
    }
    
    public void setPnote(String pnote) {
        this.pnote = pnote;
    }

    public Integer getPnumber() {
        return this.pnumber;
    }
    
    public void setPnumber(Integer pnumber) {
        this.pnumber = pnumber;
    }

    public String getPunit() {
        return this.punit;
    }
    
    public void setPunit(String punit) {
        this.punit = punit;
    }
   








}