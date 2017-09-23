package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Proreportthree entity. @author MyEclipse Persistence Tools
 */

public class Proreportthree  implements java.io.Serializable {


    // Fields    

     private Integer prt3Id;
     private Float passrate;
     private Integer probatch;
     private Timestamp ptdate;
     private Integer quabatch;
     private Integer unqbatch;
     private String unqcon;


    // Constructors

    /** default constructor */
    public Proreportthree() {
    }

    
    /** full constructor */
    public Proreportthree(Float passrate, Integer probatch, Timestamp ptdate, Integer quabatch, Integer unqbatch, String unqcon) {
        this.passrate = passrate;
        this.probatch = probatch;
        this.ptdate = ptdate;
        this.quabatch = quabatch;
        this.unqbatch = unqbatch;
        this.unqcon = unqcon;
    }

   
    // Property accessors

    public Integer getPrt3Id() {
        return this.prt3Id;
    }
    
    public void setPrt3Id(Integer prt3Id) {
        this.prt3Id = prt3Id;
    }

    public Float getPassrate() {
        return this.passrate;
    }
    
    public void setPassrate(Float passrate) {
        this.passrate = passrate;
    }

    public Integer getProbatch() {
        return this.probatch;
    }
    
    public void setProbatch(Integer probatch) {
        this.probatch = probatch;
    }

    public Timestamp getPtdate() {
        return this.ptdate;
    }
    
    public void setPtdate(Timestamp ptdate) {
        this.ptdate = ptdate;
    }

    public Integer getQuabatch() {
        return this.quabatch;
    }
    
    public void setQuabatch(Integer quabatch) {
        this.quabatch = quabatch;
    }

    public Integer getUnqbatch() {
        return this.unqbatch;
    }
    
    public void setUnqbatch(Integer unqbatch) {
        this.unqbatch = unqbatch;
    }

    public String getUnqcon() {
        return this.unqcon;
    }
    
    public void setUnqcon(String unqcon) {
        this.unqcon = unqcon;
    }
   








}