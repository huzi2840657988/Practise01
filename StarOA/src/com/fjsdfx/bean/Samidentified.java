package com.fjsdfx.bean;

import java.util.Date;


/**
 * Samidentified entity. @author MyEclipse Persistence Tools
 */

public class Samidentified  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employeeByExamineEmpId;
     private Employee employeeByChargeEmpId;
     private Itemtype itemtype;
     private Department department;
     private Employee employeeByResperEmpId;
     private Supplierinfo supplierinfo;
     private Employee employeeByHangdingEmpId;
     private String brand;
     private String conclusion;
     private Boolean entest;
     private Date examinedate;
     private String mcodename;
     private Boolean newitem;
     private Boolean newsup;
     private Integer num;
     private String opinion;
     private Date opiniondate;
     private Boolean redcost;
     private Integer reqtime;
     private Date samdate;
     private Boolean techchange;
     private Float uprice;
     private Date wantdate;
     private Date examdate;


    // Constructors

    /** default constructor */
    public Samidentified() {
    }

    
    /** full constructor */
    public Samidentified(Employee employeeByExamineEmpId, Employee employeeByChargeEmpId, Itemtype itemtype, Department department, Employee employeeByResperEmpId, Supplierinfo supplierinfo, Employee employeeByHangdingEmpId, String brand, String conclusion, Boolean entest, Date examinedate, String mcodename, Boolean newitem, Boolean newsup, Integer num, String opinion, Date opiniondate, Boolean redcost, Integer reqtime, Date samdate, Boolean techchange, Float uprice, Date wantdate, Date examdate) {
        this.employeeByExamineEmpId = employeeByExamineEmpId;
        this.employeeByChargeEmpId = employeeByChargeEmpId;
        this.itemtype = itemtype;
        this.department = department;
        this.employeeByResperEmpId = employeeByResperEmpId;
        this.supplierinfo = supplierinfo;
        this.employeeByHangdingEmpId = employeeByHangdingEmpId;
        this.brand = brand;
        this.conclusion = conclusion;
        this.entest = entest;
        this.examinedate = examinedate;
        this.mcodename = mcodename;
        this.newitem = newitem;
        this.newsup = newsup;
        this.num = num;
        this.opinion = opinion;
        this.opiniondate = opiniondate;
        this.redcost = redcost;
        this.reqtime = reqtime;
        this.samdate = samdate;
        this.techchange = techchange;
        this.uprice = uprice;
        this.wantdate = wantdate;
        this.examdate = examdate;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployeeByExamineEmpId() {
        return this.employeeByExamineEmpId;
    }
    
    public void setEmployeeByExamineEmpId(Employee employeeByExamineEmpId) {
        this.employeeByExamineEmpId = employeeByExamineEmpId;
    }

    public Employee getEmployeeByChargeEmpId() {
        return this.employeeByChargeEmpId;
    }
    
    public void setEmployeeByChargeEmpId(Employee employeeByChargeEmpId) {
        this.employeeByChargeEmpId = employeeByChargeEmpId;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployeeByResperEmpId() {
        return this.employeeByResperEmpId;
    }
    
    public void setEmployeeByResperEmpId(Employee employeeByResperEmpId) {
        this.employeeByResperEmpId = employeeByResperEmpId;
    }

    public Supplierinfo getSupplierinfo() {
        return this.supplierinfo;
    }
    
    public void setSupplierinfo(Supplierinfo supplierinfo) {
        this.supplierinfo = supplierinfo;
    }

    public Employee getEmployeeByHangdingEmpId() {
        return this.employeeByHangdingEmpId;
    }
    
    public void setEmployeeByHangdingEmpId(Employee employeeByHangdingEmpId) {
        this.employeeByHangdingEmpId = employeeByHangdingEmpId;
    }

    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getConclusion() {
        return this.conclusion;
    }
    
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Boolean getEntest() {
        return this.entest;
    }
    
    public void setEntest(Boolean entest) {
        this.entest = entest;
    }

    public Date getExaminedate() {
        return this.examinedate;
    }
    
    public void setExaminedate(Date examinedate) {
        this.examinedate = examinedate;
    }

    public String getMcodename() {
        return this.mcodename;
    }
    
    public void setMcodename(String mcodename) {
        this.mcodename = mcodename;
    }

    public Boolean getNewitem() {
        return this.newitem;
    }
    
    public void setNewitem(Boolean newitem) {
        this.newitem = newitem;
    }

    public Boolean getNewsup() {
        return this.newsup;
    }
    
    public void setNewsup(Boolean newsup) {
        this.newsup = newsup;
    }

    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOpinion() {
        return this.opinion;
    }
    
    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Date getOpiniondate() {
        return this.opiniondate;
    }
    
    public void setOpiniondate(Date opiniondate) {
        this.opiniondate = opiniondate;
    }

    public Boolean getRedcost() {
        return this.redcost;
    }
    
    public void setRedcost(Boolean redcost) {
        this.redcost = redcost;
    }

    public Integer getReqtime() {
        return this.reqtime;
    }
    
    public void setReqtime(Integer reqtime) {
        this.reqtime = reqtime;
    }

    public Date getSamdate() {
        return this.samdate;
    }
    
    public void setSamdate(Date samdate) {
        this.samdate = samdate;
    }

    public Boolean getTechchange() {
        return this.techchange;
    }
    
    public void setTechchange(Boolean techchange) {
        this.techchange = techchange;
    }

    public Float getUprice() {
        return this.uprice;
    }
    
    public void setUprice(Float uprice) {
        this.uprice = uprice;
    }

    public Date getWantdate() {
        return this.wantdate;
    }
    
    public void setWantdate(Date wantdate) {
        this.wantdate = wantdate;
    }

    public Date getExamdate() {
        return this.examdate;
    }
    
    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }
   








}