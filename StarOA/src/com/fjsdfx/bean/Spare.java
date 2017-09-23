package com.fjsdfx.bean;



/**
 * Spare entity. @author MyEclipse Persistence Tools
 */

public class Spare  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Quaprolist quaprolist;
     private Integer num;
     private String unit;
     private Float uprice;


    // Constructors

    /** default constructor */
    public Spare() {
    }

    
    /** full constructor */
    public Spare(Quaprolist quaprolist, Integer num, String unit, Float uprice) {
        this.quaprolist = quaprolist;
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

    public Quaprolist getQuaprolist() {
        return this.quaprolist;
    }
    
    public void setQuaprolist(Quaprolist quaprolist) {
        this.quaprolist = quaprolist;
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