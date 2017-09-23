package com.fjsdfx.bean;



/**
 * Dailyproduction entity. @author MyEclipse Persistence Tools
 */

public class Dailyproduction  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Dailyproductionform dailyproductionform;
     private Itemtype itemtype;
     private Integer feedDaily;
     private Integer feedMonth;
     private Integer feedYear;
     private Float planComplete;
     private Integer planDaily;
     private Float rateDaily;
     private Integer storeDaily;
     private Integer storeMonth;
     private Integer storeYear;


    // Constructors

    /** default constructor */
    public Dailyproduction() {
    }

    
    /** full constructor */
    public Dailyproduction(Dailyproductionform dailyproductionform, Itemtype itemtype, Integer feedDaily, Integer feedMonth, Integer feedYear, Float planComplete, Integer planDaily, Float rateDaily, Integer storeDaily, Integer storeMonth, Integer storeYear) {
        this.dailyproductionform = dailyproductionform;
        this.itemtype = itemtype;
        this.feedDaily = feedDaily;
        this.feedMonth = feedMonth;
        this.feedYear = feedYear;
        this.planComplete = planComplete;
        this.planDaily = planDaily;
        this.rateDaily = rateDaily;
        this.storeDaily = storeDaily;
        this.storeMonth = storeMonth;
        this.storeYear = storeYear;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Dailyproductionform getDailyproductionform() {
        return this.dailyproductionform;
    }
    
    public void setDailyproductionform(Dailyproductionform dailyproductionform) {
        this.dailyproductionform = dailyproductionform;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getFeedDaily() {
        return this.feedDaily;
    }
    
    public void setFeedDaily(Integer feedDaily) {
        this.feedDaily = feedDaily;
    }

    public Integer getFeedMonth() {
        return this.feedMonth;
    }
    
    public void setFeedMonth(Integer feedMonth) {
        this.feedMonth = feedMonth;
    }

    public Integer getFeedYear() {
        return this.feedYear;
    }
    
    public void setFeedYear(Integer feedYear) {
        this.feedYear = feedYear;
    }

    public Float getPlanComplete() {
        return this.planComplete;
    }
    
    public void setPlanComplete(Float planComplete) {
        this.planComplete = planComplete;
    }

    public Integer getPlanDaily() {
        return this.planDaily;
    }
    
    public void setPlanDaily(Integer planDaily) {
        this.planDaily = planDaily;
    }

    public Float getRateDaily() {
        return this.rateDaily;
    }
    
    public void setRateDaily(Float rateDaily) {
        this.rateDaily = rateDaily;
    }

    public Integer getStoreDaily() {
        return this.storeDaily;
    }
    
    public void setStoreDaily(Integer storeDaily) {
        this.storeDaily = storeDaily;
    }

    public Integer getStoreMonth() {
        return this.storeMonth;
    }
    
    public void setStoreMonth(Integer storeMonth) {
        this.storeMonth = storeMonth;
    }

    public Integer getStoreYear() {
        return this.storeYear;
    }
    
    public void setStoreYear(Integer storeYear) {
        this.storeYear = storeYear;
    }
   








}