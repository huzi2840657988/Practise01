package com.fjsdfx.bean;



/**
 * Itemrelation entity. @author MyEclipse Persistence Tools
 */

public class Itemrelation  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Itemtype itemtypeByPartId;
     private Itemtype itemtypeByPitemId;
     private Integer partamount;
     private String controllerunitInfo;
     private Integer isCon;


    // Constructors

    /** default constructor */
    public Itemrelation() {
    }

	/** minimal constructor */
    public Itemrelation(Itemtype itemtypeByPartId, Itemtype itemtypeByPitemId) {
        this.itemtypeByPartId = itemtypeByPartId;
        this.itemtypeByPitemId = itemtypeByPitemId;
    }
    
    /** full constructor */
    public Itemrelation(Itemtype itemtypeByPartId, Itemtype itemtypeByPitemId, Integer partamount, String controllerunitInfo, Integer isCon) {
        this.itemtypeByPartId = itemtypeByPartId;
        this.itemtypeByPitemId = itemtypeByPitemId;
        this.partamount = partamount;
        this.controllerunitInfo = controllerunitInfo;
        this.isCon = isCon;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Itemtype getItemtypeByPartId() {
        return this.itemtypeByPartId;
    }
    
    public void setItemtypeByPartId(Itemtype itemtypeByPartId) {
        this.itemtypeByPartId = itemtypeByPartId;
    }

    public Itemtype getItemtypeByPitemId() {
        return this.itemtypeByPitemId;
    }
    
    public void setItemtypeByPitemId(Itemtype itemtypeByPitemId) {
        this.itemtypeByPitemId = itemtypeByPitemId;
    }

    public Integer getPartamount() {
        return this.partamount;
    }
    
    public void setPartamount(Integer partamount) {
        this.partamount = partamount;
    }

    public String getControllerunitInfo() {
        return this.controllerunitInfo;
    }
    
    public void setControllerunitInfo(String controllerunitInfo) {
        this.controllerunitInfo = controllerunitInfo;
    }

    public Integer getIsCon() {
        return this.isCon;
    }
    
    public void setIsCon(Integer isCon) {
        this.isCon = isCon;
    }
   








}