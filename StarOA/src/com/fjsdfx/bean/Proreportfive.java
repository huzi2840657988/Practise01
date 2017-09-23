package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Proreportfive entity. @author MyEclipse Persistence Tools
 */

public class Proreportfive  implements java.io.Serializable {


    // Fields    

     private Integer rpt5Id;
     private Integer fiqua;
     private Integer fiunq;
     private Integer insptime;
     private Float passrate;
     private Integer pronum;
     private Timestamp rtdate;
     private Integer unqnum;


    // Constructors

    /** default constructor */
    public Proreportfive() {
    }

    
    /** full constructor */
    public Proreportfive(Integer fiqua, Integer fiunq, Integer insptime, Float passrate, Integer pronum, Timestamp rtdate, Integer unqnum) {
        this.fiqua = fiqua;
        this.fiunq = fiunq;
        this.insptime = insptime;
        this.passrate = passrate;
        this.pronum = pronum;
        this.rtdate = rtdate;
        this.unqnum = unqnum;
    }

   
    // Property accessors

    public Integer getRpt5Id() {
        return this.rpt5Id;
    }
    
    public void setRpt5Id(Integer rpt5Id) {
        this.rpt5Id = rpt5Id;
    }

    public Integer getFiqua() {
        return this.fiqua;
    }
    
    public void setFiqua(Integer fiqua) {
        this.fiqua = fiqua;
    }

    public Integer getFiunq() {
        return this.fiunq;
    }
    
    public void setFiunq(Integer fiunq) {
        this.fiunq = fiunq;
    }

    public Integer getInsptime() {
        return this.insptime;
    }
    
    public void setInsptime(Integer insptime) {
        this.insptime = insptime;
    }

    public Float getPassrate() {
        return this.passrate;
    }
    
    public void setPassrate(Float passrate) {
        this.passrate = passrate;
    }

    public Integer getPronum() {
        return this.pronum;
    }
    
    public void setPronum(Integer pronum) {
        this.pronum = pronum;
    }

    public Timestamp getRtdate() {
        return this.rtdate;
    }
    
    public void setRtdate(Timestamp rtdate) {
        this.rtdate = rtdate;
    }

    public Integer getUnqnum() {
        return this.unqnum;
    }
    
    public void setUnqnum(Integer unqnum) {
        this.unqnum = unqnum;
    }
   








}