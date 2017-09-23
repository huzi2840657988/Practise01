package com.fjsdfx.bean;



/**
 * Shi2good entity. @author MyEclipse Persistence Tools
 */

public class Shi2good  implements java.io.Serializable {


    // Fields    

     private Integer shi2gid;
     private Shinote2 shinote2;
     private Itemtype itemtype;
     private Integer orderid;
     private Integer shi2no;
     private Integer shi2no2;
     private String shi2note;


    // Constructors

    /** default constructor */
    public Shi2good() {
    }

    
    /** full constructor */
    public Shi2good(Shinote2 shinote2, Itemtype itemtype, Integer orderid, Integer shi2no, Integer shi2no2, String shi2note) {
        this.shinote2 = shinote2;
        this.itemtype = itemtype;
        this.orderid = orderid;
        this.shi2no = shi2no;
        this.shi2no2 = shi2no2;
        this.shi2note = shi2note;
    }

   
    // Property accessors

    public Integer getShi2gid() {
        return this.shi2gid;
    }
    
    public void setShi2gid(Integer shi2gid) {
        this.shi2gid = shi2gid;
    }

    public Shinote2 getShinote2() {
        return this.shinote2;
    }
    
    public void setShinote2(Shinote2 shinote2) {
        this.shinote2 = shinote2;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getOrderid() {
        return this.orderid;
    }
    
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getShi2no() {
        return this.shi2no;
    }
    
    public void setShi2no(Integer shi2no) {
        this.shi2no = shi2no;
    }

    public Integer getShi2no2() {
        return this.shi2no2;
    }
    
    public void setShi2no2(Integer shi2no2) {
        this.shi2no2 = shi2no2;
    }

    public String getShi2note() {
        return this.shi2note;
    }
    
    public void setShi2note(String shi2note) {
        this.shi2note = shi2note;
    }
   








}