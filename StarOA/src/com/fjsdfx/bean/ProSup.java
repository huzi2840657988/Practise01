package com.fjsdfx.bean;



/**
 * ProSup entity. @author MyEclipse Persistence Tools
 */

public class ProSup  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Preparation preparation;
     private Prscheck prscheck;
     private Supsendm supsendm;


    // Constructors

    /** default constructor */
    public ProSup() {
    }

    
    /** full constructor */
    public ProSup(Preparation preparation, Prscheck prscheck, Supsendm supsendm) {
        this.preparation = preparation;
        this.prscheck = prscheck;
        this.supsendm = supsendm;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Preparation getPreparation() {
        return this.preparation;
    }
    
    public void setPreparation(Preparation preparation) {
        this.preparation = preparation;
    }

    public Prscheck getPrscheck() {
        return this.prscheck;
    }
    
    public void setPrscheck(Prscheck prscheck) {
        this.prscheck = prscheck;
    }

    public Supsendm getSupsendm() {
        return this.supsendm;
    }
    
    public void setSupsendm(Supsendm supsendm) {
        this.supsendm = supsendm;
    }
   








}