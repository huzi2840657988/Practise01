package com.fjsdfx.bean;

import java.util.Date;


/**
 * Purgood entity. @author MyEclipse Persistence Tools
 */

public class Purgood  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Itemtype itemtypeByItemtypeId;
     private Item item;
     private Itemtype itemtypeByIteId;
     private Purorder purorder;
     private Date delydate;
     private String note;
     private Integer num;
     private String unit;
     private Float uprice;


    // Constructors

    /** default constructor */
    public Purgood() {
    }

    
    /** full constructor */
    public Purgood(Itemtype itemtypeByItemtypeId, Item item, Itemtype itemtypeByIteId, Purorder purorder, Date delydate, String note, Integer num, String unit, Float uprice) {
        this.itemtypeByItemtypeId = itemtypeByItemtypeId;
        this.item = item;
        this.itemtypeByIteId = itemtypeByIteId;
        this.purorder = purorder;
        this.delydate = delydate;
        this.note = note;
        this.num = num;
        this.unit = unit;
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

    public Itemtype getItemtypeByIteId() {
        return this.itemtypeByIteId;
    }
    
    public void setItemtypeByIteId(Itemtype itemtypeByIteId) {
        this.itemtypeByIteId = itemtypeByIteId;
    }

    public Purorder getPurorder() {
        return this.purorder;
    }
    
    public void setPurorder(Purorder purorder) {
        this.purorder = purorder;
    }

    public Date getDelydate() {
        return this.delydate;
    }
    
    public void setDelydate(Date delydate) {
        this.delydate = delydate;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getUprice() {
        return this.uprice;
    }
    
    public void setUprice(Float uprice) {
        this.uprice = uprice;
    }
   








}