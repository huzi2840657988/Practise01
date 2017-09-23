package com.fjsdfx.bean;

import java.util.Date;


/**
 * Supidentified entity. @author MyEclipse Persistence Tools
 */

public class Supidentified  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employeeByQuaperEmpId;
     private Employee employeeByManperEmpId;
     private Employee employeeByReqperEmpId;
     private Employee employeeByPurperEmpId;
     private Employee employeeByPurresperEmpId;
     private Supplierinfo supplierinfo;
     private Employee employeeByRecperEmpId;
     private Department departmentByRecdptId;
     private Employee employeeByQuaresperEmpId;
     private Department departmentByReqdptId;
     private String brand;
     private Boolean directosales;
     private String manadvice;
     private Date mandate;
     private String note;
     private String puradvice;
     private Date purdate;
     private Date quadate;
     private String quadvice;
     private Date recdate;
     private Date reqdate;
     private String reqinfo;
     private String reqreason;
     private Integer samid;
     private Date pardate;
     private Date partdate;


    // Constructors

    /** default constructor */
    public Supidentified() {
    }

    
    /** full constructor */
    public Supidentified(Employee employeeByQuaperEmpId, Employee employeeByManperEmpId, Employee employeeByReqperEmpId, Employee employeeByPurperEmpId, Employee employeeByPurresperEmpId, Supplierinfo supplierinfo, Employee employeeByRecperEmpId, Department departmentByRecdptId, Employee employeeByQuaresperEmpId, Department departmentByReqdptId, String brand, Boolean directosales, String manadvice, Date mandate, String note, String puradvice, Date purdate, Date quadate, String quadvice, Date recdate, Date reqdate, String reqinfo, String reqreason, Integer samid, Date pardate, Date partdate) {
        this.employeeByQuaperEmpId = employeeByQuaperEmpId;
        this.employeeByManperEmpId = employeeByManperEmpId;
        this.employeeByReqperEmpId = employeeByReqperEmpId;
        this.employeeByPurperEmpId = employeeByPurperEmpId;
        this.employeeByPurresperEmpId = employeeByPurresperEmpId;
        this.supplierinfo = supplierinfo;
        this.employeeByRecperEmpId = employeeByRecperEmpId;
        this.departmentByRecdptId = departmentByRecdptId;
        this.employeeByQuaresperEmpId = employeeByQuaresperEmpId;
        this.departmentByReqdptId = departmentByReqdptId;
        this.brand = brand;
        this.directosales = directosales;
        this.manadvice = manadvice;
        this.mandate = mandate;
        this.note = note;
        this.puradvice = puradvice;
        this.purdate = purdate;
        this.quadate = quadate;
        this.quadvice = quadvice;
        this.recdate = recdate;
        this.reqdate = reqdate;
        this.reqinfo = reqinfo;
        this.reqreason = reqreason;
        this.samid = samid;
        this.pardate = pardate;
        this.partdate = partdate;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployeeByQuaperEmpId() {
        return this.employeeByQuaperEmpId;
    }
    
    public void setEmployeeByQuaperEmpId(Employee employeeByQuaperEmpId) {
        this.employeeByQuaperEmpId = employeeByQuaperEmpId;
    }

    public Employee getEmployeeByManperEmpId() {
        return this.employeeByManperEmpId;
    }
    
    public void setEmployeeByManperEmpId(Employee employeeByManperEmpId) {
        this.employeeByManperEmpId = employeeByManperEmpId;
    }

    public Employee getEmployeeByReqperEmpId() {
        return this.employeeByReqperEmpId;
    }
    
    public void setEmployeeByReqperEmpId(Employee employeeByReqperEmpId) {
        this.employeeByReqperEmpId = employeeByReqperEmpId;
    }

    public Employee getEmployeeByPurperEmpId() {
        return this.employeeByPurperEmpId;
    }
    
    public void setEmployeeByPurperEmpId(Employee employeeByPurperEmpId) {
        this.employeeByPurperEmpId = employeeByPurperEmpId;
    }

    public Employee getEmployeeByPurresperEmpId() {
        return this.employeeByPurresperEmpId;
    }
    
    public void setEmployeeByPurresperEmpId(Employee employeeByPurresperEmpId) {
        this.employeeByPurresperEmpId = employeeByPurresperEmpId;
    }

    public Supplierinfo getSupplierinfo() {
        return this.supplierinfo;
    }
    
    public void setSupplierinfo(Supplierinfo supplierinfo) {
        this.supplierinfo = supplierinfo;
    }

    public Employee getEmployeeByRecperEmpId() {
        return this.employeeByRecperEmpId;
    }
    
    public void setEmployeeByRecperEmpId(Employee employeeByRecperEmpId) {
        this.employeeByRecperEmpId = employeeByRecperEmpId;
    }

    public Department getDepartmentByRecdptId() {
        return this.departmentByRecdptId;
    }
    
    public void setDepartmentByRecdptId(Department departmentByRecdptId) {
        this.departmentByRecdptId = departmentByRecdptId;
    }

    public Employee getEmployeeByQuaresperEmpId() {
        return this.employeeByQuaresperEmpId;
    }
    
    public void setEmployeeByQuaresperEmpId(Employee employeeByQuaresperEmpId) {
        this.employeeByQuaresperEmpId = employeeByQuaresperEmpId;
    }

    public Department getDepartmentByReqdptId() {
        return this.departmentByReqdptId;
    }
    
    public void setDepartmentByReqdptId(Department departmentByReqdptId) {
        this.departmentByReqdptId = departmentByReqdptId;
    }

    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getDirectosales() {
        return this.directosales;
    }
    
    public void setDirectosales(Boolean directosales) {
        this.directosales = directosales;
    }

    public String getManadvice() {
        return this.manadvice;
    }
    
    public void setManadvice(String manadvice) {
        this.manadvice = manadvice;
    }

    public Date getMandate() {
        return this.mandate;
    }
    
    public void setMandate(Date mandate) {
        this.mandate = mandate;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public String getPuradvice() {
        return this.puradvice;
    }
    
    public void setPuradvice(String puradvice) {
        this.puradvice = puradvice;
    }

    public Date getPurdate() {
        return this.purdate;
    }
    
    public void setPurdate(Date purdate) {
        this.purdate = purdate;
    }

    public Date getQuadate() {
        return this.quadate;
    }
    
    public void setQuadate(Date quadate) {
        this.quadate = quadate;
    }

    public String getQuadvice() {
        return this.quadvice;
    }
    
    public void setQuadvice(String quadvice) {
        this.quadvice = quadvice;
    }

    public Date getRecdate() {
        return this.recdate;
    }
    
    public void setRecdate(Date recdate) {
        this.recdate = recdate;
    }

    public Date getReqdate() {
        return this.reqdate;
    }
    
    public void setReqdate(Date reqdate) {
        this.reqdate = reqdate;
    }

    public String getReqinfo() {
        return this.reqinfo;
    }
    
    public void setReqinfo(String reqinfo) {
        this.reqinfo = reqinfo;
    }

    public String getReqreason() {
        return this.reqreason;
    }
    
    public void setReqreason(String reqreason) {
        this.reqreason = reqreason;
    }

    public Integer getSamid() {
        return this.samid;
    }
    
    public void setSamid(Integer samid) {
        this.samid = samid;
    }

    public Date getPardate() {
        return this.pardate;
    }
    
    public void setPardate(Date pardate) {
        this.pardate = pardate;
    }

    public Date getPartdate() {
        return this.partdate;
    }
    
    public void setPartdate(Date partdate) {
        this.partdate = partdate;
    }
   








}