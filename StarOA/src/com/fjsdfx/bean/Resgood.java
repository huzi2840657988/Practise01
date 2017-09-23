package com.fjsdfx.bean;

import java.util.Date;


/**
 * Resgood entity. @author MyEclipse Persistence Tools
 */

public class Resgood  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Itemtype itemtypeByItemtypeId;
     private Item item;
     private Requisitions requisitions;
     private Itemtype itemtypeByIteId;
     private Date arrivaldate;
     private String payment;
     private Integer reqnum;
     private Integer unum;
     private Float uprice;


    // Constructors

    /** default constructor */
    public Resgood() {
    }

    
    /** full constructor */
    public Resgood(Itemtype itemtypeByItemtypeId, Item item, Requisitions requisitions, Itemtype itemtypeByIteId, Date arrivaldate, String payment, Integer reqnum, Integer unum, Float uprice) {
        this.itemtypeByItemtypeId = itemtypeByItemtypeId;
        this.item = item;
        this.requisitions = requisitions;
        this.itemtypeByIteId = itemtypeByIteId;
        this.arrivaldate = arrivaldate;
        this.payment = payment;
        this.reqnum = reqnum;
        this.unum = unum;
        this.uprice = uprice;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Itemtype getItemtypeByItemtypeId() {
        return this.itemtypeByItemtypeId;
    }
    
    public void setItemtypeByItemtypeId(Itemtype itemtypeByItemtypeId) {
        this.itemtypeByItemtypeId = itemtypeByItemtypeId;
    }

    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }

    public Requisitions getRequisitions() {
        return this.requisitions;
    }
    
    public void setRequisitions(Requisitions requisitions) {
        this.requisitions = requisitions;
    }

    public Itemtype getItemtypeByIteId() {
        return this.itemtypeByIteId;
    }
    
    public void setItemtypeByIteId(Itemtype itemtypeByIteId) {
        this.itemtypeByIteId = itemtypeByIteId;
    }

    public Date getArrivaldate() {
        return this.arrivaldate;
    }
    
    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public String getPayment() {
        return this.payment;
    }
    
    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getReqnum() {
        return this.reqnum;
    }
    
    public void setReqnum(Integer reqnum) {
        this.reqnum = reqnum;
    }

    public Integer getUnum() {
        return this.unum;
    }
    
    public void setUnum(Integer unum) {
        this.unum = unum;
    }

    public Float getUprice() {
        return this.uprice;
    }
    
    public void setUprice(Float uprice) {
        this.uprice = uprice;
    }
   








}