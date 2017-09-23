package com.fjsdfx.bean;



/**
 * Susgood3 entity. @author MyEclipse Persistence Tools
 */

public class Susgood3  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Itemtype itemtype;
     private Supsendm3 supsendm3;
     private String controllerunitInfo;
     private Integer isExtra;
     private Integer needNum;
     private String note;
     private Integer pracNum;
     private Integer seriNum;
     private Integer singleset;
     private Integer worshipConfirm;


    // Constructors

    /** default constructor */
    public Susgood3() {
    }

    
    /** full constructor */
    public Susgood3(Itemtype itemtype, Supsendm3 supsendm3, String controllerunitInfo, Integer isExtra, Integer needNum, String note, Integer pracNum, Integer seriNum, Integer singleset, Integer worshipConfirm) {
        this.itemtype = itemtype;
        this.supsendm3 = supsendm3;
        this.controllerunitInfo = controllerunitInfo;
        this.isExtra = isExtra;
        this.needNum = needNum;
        this.note = note;
        this.pracNum = pracNum;
        this.seriNum = seriNum;
        this.singleset = singleset;
        this.worshipConfirm = worshipConfirm;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Supsendm3 getSupsendm3() {
        return this.supsendm3;
    }
    
    public void setSupsendm3(Supsendm3 supsendm3) {
        this.supsendm3 = supsendm3;
    }

    public String getControllerunitInfo() {
        return this.controllerunitInfo;
    }
    
    public void setControllerunitInfo(String controllerunitInfo) {
        this.controllerunitInfo = controllerunitInfo;
    }

    public Integer getIsExtra() {
        return this.isExtra;
    }
    
    public void setIsExtra(Integer isExtra) {
        this.isExtra = isExtra;
    }

    public Integer getNeedNum() {
        return this.needNum;
    }
    
    public void setNeedNum(Integer needNum) {
        this.needNum = needNum;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPracNum() {
        return this.pracNum;
    }
    
    public void setPracNum(Integer pracNum) {
        this.pracNum = pracNum;
    }

    public Integer getSeriNum() {
        return this.seriNum;
    }
    
    public void setSeriNum(Integer seriNum) {
        this.seriNum = seriNum;
    }

    public Integer getSingleset() {
        return this.singleset;
    }
    
    public void setSingleset(Integer singleset) {
        this.singleset = singleset;
    }

    public Integer getWorshipConfirm() {
        return this.worshipConfirm;
    }
    
    public void setWorshipConfirm(Integer worshipConfirm) {
        this.worshipConfirm = worshipConfirm;
    }
   








}