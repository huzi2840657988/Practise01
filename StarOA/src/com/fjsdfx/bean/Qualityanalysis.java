package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Qualityanalysis entity. @author MyEclipse Persistence Tools
 */

public class Qualityanalysis  implements java.io.Serializable {


    // Fields    

     private Integer anaId;
     private Itemtype itemtype;
     private Integer analysis;
     private Integer mainfault;
     private Integer measures;
     private Integer rnum;
     private Integer snum;
     private Set retgoods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Qualityanalysis() {
    }

    
    /** full constructor */
    public Qualityanalysis(Itemtype itemtype, Integer analysis, Integer mainfault, Integer measures, Integer rnum, Integer snum, Set retgoods) {
        this.itemtype = itemtype;
        this.analysis = analysis;
        this.mainfault = mainfault;
        this.measures = measures;
        this.rnum = rnum;
        this.snum = snum;
        this.retgoods = retgoods;
    }

   
    // Property accessors

    public Integer getAnaId() {
        return this.anaId;
    }
    
    public void setAnaId(Integer anaId) {
        this.anaId = anaId;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getAnalysis() {
        return this.analysis;
    }
    
    public void setAnalysis(Integer analysis) {
        this.analysis = analysis;
    }

    public Integer getMainfault() {
        return this.mainfault;
    }
    
    public void setMainfault(Integer mainfault) {
        this.mainfault = mainfault;
    }

    public Integer getMeasures() {
        return this.measures;
    }
    
    public void setMeasures(Integer measures) {
        this.measures = measures;
    }

    public Integer getRnum() {
        return this.rnum;
    }
    
    public void setRnum(Integer rnum) {
        this.rnum = rnum;
    }

    public Integer getSnum() {
        return this.snum;
    }
    
    public void setSnum(Integer snum) {
        this.snum = snum;
    }

    public Set getRetgoods() {
        return this.retgoods;
    }
    
    public void setRetgoods(Set retgoods) {
        this.retgoods = retgoods;
    }
   








}