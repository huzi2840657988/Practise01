package com.fjsdfx.bean;



/**
 * Picgood entity. @author MyEclipse Persistence Tools
 */

public class Picgood  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Requisition requisition;
     private Itemtype itemtype;
     private String calunit;
     private Integer factnum;
     private Integer reqnum;
     private Float rprice;
     private Float ruprice;
     private String userf;


    // Constructors

    /** default constructor */
    public Picgood() {
    }

	/** minimal constructor */
    public Picgood(Float rprice, Float ruprice) {
        this.rprice = rprice;
        this.ruprice = ruprice;
    }
    
    /** full constructor */
    public Picgood(Requisition requisition, Itemtype itemtype, String calunit, Integer factnum, Integer reqnum, Float rprice, Float ruprice, String userf) {
        this.requisition = requisition;
        this.itemtype = itemtype;
        this.calunit = calunit;
        this.factnum = factnum;
        this.reqnum = reqnum;
        this.rprice = rprice;
        this.ruprice = ruprice;
        this.userf = userf;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Requisition getRequisition() {
        return this.requisition;
    }
    
    public void setRequisition(Requisition requisition) {
        this.requisition = requisition;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public String getCalunit() {
        return this.calunit;
    }
    
    public void setCalunit(String calunit) {
        this.calunit = calunit;
    }

    public Integer getFactnum() {
        return this.factnum;
    }
    
    public void setFactnum(Integer factnum) {
        this.factnum = factnum;
    }

    public Integer getReqnum() {
        return this.reqnum;
    }
    
    public void setReqnum(Integer reqnum) {
        this.reqnum = reqnum;
    }

    public Float getRprice() {
        return this.rprice;
    }
    
    public void setRprice(Float rprice) {
        this.rprice = rprice;
    }

    public Float getRuprice() {
        return this.ruprice;
    }
    
    public void setRuprice(Float ruprice) {
        this.ruprice = ruprice;
    }

    public String getUserf() {
        return this.userf;
    }
    
    public void setUserf(String userf) {
        this.userf = userf;
    }
   








}