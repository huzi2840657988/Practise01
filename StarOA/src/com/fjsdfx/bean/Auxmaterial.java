package com.fjsdfx.bean;

import java.util.Date;


/**
 * Auxmaterial entity. @author MyEclipse Persistence Tools
 */

public class Auxmaterial  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Quaprolist quaprolist;
     private Integer ewhnum;
     private Integer num;
     private Integer owhnum;
     private Date purDate;
     private String unit;
     private Float uprice;


    // Constructors

    /** default constructor */
    public Auxmaterial() {
    }

    
    /** full constructor */
    public Auxmaterial(Quaprolist quaprolist, Integer ewhnum, Integer num, Integer owhnum, Date purDate, String unit, Float uprice) {
        this.quaprolist = quaprolist;
        this.ewhnum = ewhnum;
        this.num = num;
        this.owhnum = owhnum;
        this.purDate = purDate;
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

    public Quaprolist getQuaprolist() {
        return this.quaprolist;
    }
    
    public void setQuaprolist(Quaprolist quaprolist) {
        this.quaprolist = quaprolist;
    }

    public Integer getEwhnum() {
        return this.ewhnum;
    }
    
    public void setEwhnum(Integer ewhnum) {
        this.ewhnum = ewhnum;
    }

    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOwhnum() {
        return this.owhnum;
    }
    
    public void setOwhnum(Integer owhnum) {
        this.owhnum = owhnum;
    }

    public Date getPurDate() {
        return this.purDate;
    }
    
    public void setPurDate(Date purDate) {
        this.purDate = purDate;
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