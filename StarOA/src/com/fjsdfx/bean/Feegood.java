package com.fjsdfx.bean;



/**
 * Feegood entity. @author MyEclipse Persistence Tools
 */

public class Feegood  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Itemtype itemtype;
     private Feedexamine feedexamine;
     private Department department;
     private Integer bsno;
     private Boolean confirmnum;
     private Boolean exresult;
     private Integer factno;
     private String fnote;
     private Integer fpnum;


    // Constructors

    /** default constructor */
    public Feegood() {
    }

	/** minimal constructor */
    public Feegood(Boolean exresult) {
        this.exresult = exresult;
    }
    
    /** full constructor */
    public Feegood(Itemtype itemtype, Feedexamine feedexamine, Department department, Integer bsno, Boolean confirmnum, Boolean exresult, Integer factno, String fnote, Integer fpnum) {
        this.itemtype = itemtype;
        this.feedexamine = feedexamine;
        this.department = department;
        this.bsno = bsno;
        this.confirmnum = confirmnum;
        this.exresult = exresult;
        this.factno = factno;
        this.fnote = fnote;
        this.fpnum = fpnum;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Feedexamine getFeedexamine() {
        return this.feedexamine;
    }
    
    public void setFeedexamine(Feedexamine feedexamine) {
        this.feedexamine = feedexamine;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getBsno() {
        return this.bsno;
    }
    
    public void setBsno(Integer bsno) {
        this.bsno = bsno;
    }

    public Boolean getConfirmnum() {
        return this.confirmnum;
    }
    
    public void setConfirmnum(Boolean confirmnum) {
        this.confirmnum = confirmnum;
    }

    public Boolean getExresult() {
        return this.exresult;
    }
    
    public void setExresult(Boolean exresult) {
        this.exresult = exresult;
    }

    public Integer getFactno() {
        return this.factno;
    }
    
    public void setFactno(Integer factno) {
        this.factno = factno;
    }

    public String getFnote() {
        return this.fnote;
    }
    
    public void setFnote(String fnote) {
        this.fnote = fnote;
    }

    public Integer getFpnum() {
        return this.fpnum;
    }
    
    public void setFpnum(Integer fpnum) {
        this.fpnum = fpnum;
    }
   








}