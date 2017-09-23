package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String dptDes;
     private String dptName;
     private Integer dptType;
     private Set dailyproductionforms = new HashSet(0);
     private Set supsendms = new HashSet(0);
     private Set shinote2s = new HashSet(0);
     private Set ytrainplansForDptId = new HashSet(0);
     private Set unqualifiedsForRdpt = new HashSet(0);
     private Set recruitments = new HashSet(0);
     private Set discardverifies = new HashSet(0);
     private Set shortms = new HashSet(0);
     private Set feegoods = new HashSet(0);
     private Set unqualifiedsForRecdpt = new HashSet(0);
     private Set supidentifiedsForReqdptId = new HashSet(0);
     private Set supidentifiedsForRecdptId = new HashSet(0);
     private Set ytrainplansForWithf = new HashSet(0);
     private Set supsendm3s = new HashSet(0);
     private Set preparations = new HashSet(0);
     private Set variations = new HashSet(0);
     private Set employees = new HashSet(0);
     private Set stoschgoods = new HashSet(0);
     private Set trainings = new HashSet(0);
     private Set testnoteses = new HashSet(0);
     private Set trackingtestsForWhDptId = new HashSet(0);
     private Set samidentifieds = new HashSet(0);
     private Set trackingtestsForWs2Dpt = new HashSet(0);
     private Set prschecks = new HashSet(0);
     private Set trackingtestsForWs1DptId = new HashSet(0);


    // Constructors

    /** default constructor */
    public Department() {
    }

    
    /** full constructor */
    public Department(String dptDes, String dptName, Integer dptType, Set dailyproductionforms, Set supsendms, Set shinote2s, Set ytrainplansForDptId, Set unqualifiedsForRdpt, Set recruitments, Set discardverifies, Set shortms, Set feegoods, Set unqualifiedsForRecdpt, Set supidentifiedsForReqdptId, Set supidentifiedsForRecdptId, Set ytrainplansForWithf, Set supsendm3s, Set preparations, Set variations, Set employees, Set stoschgoods, Set trainings, Set testnoteses, Set trackingtestsForWhDptId, Set samidentifieds, Set trackingtestsForWs2Dpt, Set prschecks, Set trackingtestsForWs1DptId) {
        this.dptDes = dptDes;
        this.dptName = dptName;
        this.dptType = dptType;
        this.dailyproductionforms = dailyproductionforms;
        this.supsendms = supsendms;
        this.shinote2s = shinote2s;
        this.ytrainplansForDptId = ytrainplansForDptId;
        this.unqualifiedsForRdpt = unqualifiedsForRdpt;
        this.recruitments = recruitments;
        this.discardverifies = discardverifies;
        this.shortms = shortms;
        this.feegoods = feegoods;
        this.unqualifiedsForRecdpt = unqualifiedsForRecdpt;
        this.supidentifiedsForReqdptId = supidentifiedsForReqdptId;
        this.supidentifiedsForRecdptId = supidentifiedsForRecdptId;
        this.ytrainplansForWithf = ytrainplansForWithf;
        this.supsendm3s = supsendm3s;
        this.preparations = preparations;
        this.variations = variations;
        this.employees = employees;
        this.stoschgoods = stoschgoods;
        this.trainings = trainings;
        this.testnoteses = testnoteses;
        this.trackingtestsForWhDptId = trackingtestsForWhDptId;
        this.samidentifieds = samidentifieds;
        this.trackingtestsForWs2Dpt = trackingtestsForWs2Dpt;
        this.prschecks = prschecks;
        this.trackingtestsForWs1DptId = trackingtestsForWs1DptId;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDptDes() {
        return this.dptDes;
    }
    
    public void setDptDes(String dptDes) {
        this.dptDes = dptDes;
    }

    public String getDptName() {
        return this.dptName;
    }
    
    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public Integer getDptType() {
        return this.dptType;
    }
    
    public void setDptType(Integer dptType) {
        this.dptType = dptType;
    }

    public Set getDailyproductionforms() {
        return this.dailyproductionforms;
    }
    
    public void setDailyproductionforms(Set dailyproductionforms) {
        this.dailyproductionforms = dailyproductionforms;
    }

    public Set getSupsendms() {
        return this.supsendms;
    }
    
    public void setSupsendms(Set supsendms) {
        this.supsendms = supsendms;
    }

    public Set getShinote2s() {
        return this.shinote2s;
    }
    
    public void setShinote2s(Set shinote2s) {
        this.shinote2s = shinote2s;
    }

    public Set getYtrainplansForDptId() {
        return this.ytrainplansForDptId;
    }
    
    public void setYtrainplansForDptId(Set ytrainplansForDptId) {
        this.ytrainplansForDptId = ytrainplansForDptId;
    }

    public Set getUnqualifiedsForRdpt() {
        return this.unqualifiedsForRdpt;
    }
    
    public void setUnqualifiedsForRdpt(Set unqualifiedsForRdpt) {
        this.unqualifiedsForRdpt = unqualifiedsForRdpt;
    }

    public Set getRecruitments() {
        return this.recruitments;
    }
    
    public void setRecruitments(Set recruitments) {
        this.recruitments = recruitments;
    }

    public Set getDiscardverifies() {
        return this.discardverifies;
    }
    
    public void setDiscardverifies(Set discardverifies) {
        this.discardverifies = discardverifies;
    }

    public Set getShortms() {
        return this.shortms;
    }
    
    public void setShortms(Set shortms) {
        this.shortms = shortms;
    }

    public Set getFeegoods() {
        return this.feegoods;
    }
    
    public void setFeegoods(Set feegoods) {
        this.feegoods = feegoods;
    }

    public Set getUnqualifiedsForRecdpt() {
        return this.unqualifiedsForRecdpt;
    }
    
    public void setUnqualifiedsForRecdpt(Set unqualifiedsForRecdpt) {
        this.unqualifiedsForRecdpt = unqualifiedsForRecdpt;
    }

    public Set getSupidentifiedsForReqdptId() {
        return this.supidentifiedsForReqdptId;
    }
    
    public void setSupidentifiedsForReqdptId(Set supidentifiedsForReqdptId) {
        this.supidentifiedsForReqdptId = supidentifiedsForReqdptId;
    }

    public Set getSupidentifiedsForRecdptId() {
        return this.supidentifiedsForRecdptId;
    }
    
    public void setSupidentifiedsForRecdptId(Set supidentifiedsForRecdptId) {
        this.supidentifiedsForRecdptId = supidentifiedsForRecdptId;
    }

    public Set getYtrainplansForWithf() {
        return this.ytrainplansForWithf;
    }
    
    public void setYtrainplansForWithf(Set ytrainplansForWithf) {
        this.ytrainplansForWithf = ytrainplansForWithf;
    }

    public Set getSupsendm3s() {
        return this.supsendm3s;
    }
    
    public void setSupsendm3s(Set supsendm3s) {
        this.supsendm3s = supsendm3s;
    }

    public Set getPreparations() {
        return this.preparations;
    }
    
    public void setPreparations(Set preparations) {
        this.preparations = preparations;
    }

    public Set getVariations() {
        return this.variations;
    }
    
    public void setVariations(Set variations) {
        this.variations = variations;
    }

    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }

    public Set getStoschgoods() {
        return this.stoschgoods;
    }
    
    public void setStoschgoods(Set stoschgoods) {
        this.stoschgoods = stoschgoods;
    }

    public Set getTrainings() {
        return this.trainings;
    }
    
    public void setTrainings(Set trainings) {
        this.trainings = trainings;
    }

    public Set getTestnoteses() {
        return this.testnoteses;
    }
    
    public void setTestnoteses(Set testnoteses) {
        this.testnoteses = testnoteses;
    }

    public Set getTrackingtestsForWhDptId() {
        return this.trackingtestsForWhDptId;
    }
    
    public void setTrackingtestsForWhDptId(Set trackingtestsForWhDptId) {
        this.trackingtestsForWhDptId = trackingtestsForWhDptId;
    }

    public Set getSamidentifieds() {
        return this.samidentifieds;
    }
    
    public void setSamidentifieds(Set samidentifieds) {
        this.samidentifieds = samidentifieds;
    }

    public Set getTrackingtestsForWs2Dpt() {
        return this.trackingtestsForWs2Dpt;
    }
    
    public void setTrackingtestsForWs2Dpt(Set trackingtestsForWs2Dpt) {
        this.trackingtestsForWs2Dpt = trackingtestsForWs2Dpt;
    }

    public Set getPrschecks() {
        return this.prschecks;
    }
    
    public void setPrschecks(Set prschecks) {
        this.prschecks = prschecks;
    }

    public Set getTrackingtestsForWs1DptId() {
        return this.trackingtestsForWs1DptId;
    }
    
    public void setTrackingtestsForWs1DptId(Set trackingtestsForWs1DptId) {
        this.trackingtestsForWs1DptId = trackingtestsForWs1DptId;
    }
   








}