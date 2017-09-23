package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Testnotes entity. @author MyEclipse Persistence Tools
 */

public class Testnotes  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employeeByQuaperEmpId;
     private Employee employeeByExaminerEmpId;
     private Employee employeeByPurperEmpId;
     private Department department;
     private Employee employeeByQuamanperEmpId;
     private Employee employeeByPurmanperEmpId;
     private Supplierinfo supplierinfo;
     private String basis;
     private String brand;
     private String checkreport;
     private String note;
     private Integer num;
     private Date purdate;
     private Date quadate;
     private String quadvice;
     private Boolean result;
     private Integer samid;
     private Date senddate;
     private Integer tiems;
     private Integer tracktestId;
     private Date purmdate;
     private Set trackingtests = new HashSet(0);


    // Constructors

    /** default constructor */
    public Testnotes() {
    }

    
    /** full constructor */
    public Testnotes(Employee employeeByQuaperEmpId, Employee employeeByExaminerEmpId, Employee employeeByPurperEmpId, Department department, Employee employeeByQuamanperEmpId, Employee employeeByPurmanperEmpId, Supplierinfo supplierinfo, String basis, String brand, String checkreport, String note, Integer num, Date purdate, Date quadate, String quadvice, Boolean result, Integer samid, Date senddate, Integer tiems, Integer tracktestId, Date purmdate, Set trackingtests) {
        this.employeeByQuaperEmpId = employeeByQuaperEmpId;
        this.employeeByExaminerEmpId = employeeByExaminerEmpId;
        this.employeeByPurperEmpId = employeeByPurperEmpId;
        this.department = department;
        this.employeeByQuamanperEmpId = employeeByQuamanperEmpId;
        this.employeeByPurmanperEmpId = employeeByPurmanperEmpId;
        this.supplierinfo = supplierinfo;
        this.basis = basis;
        this.brand = brand;
        this.checkreport = checkreport;
        this.note = note;
        this.num = num;
        this.purdate = purdate;
        this.quadate = quadate;
        this.quadvice = quadvice;
        this.result = result;
        this.samid = samid;
        this.senddate = senddate;
        this.tiems = tiems;
        this.tracktestId = tracktestId;
        this.purmdate = purmdate;
        this.trackingtests = trackingtests;
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

    public Employee getEmployeeByExaminerEmpId() {
        return this.employeeByExaminerEmpId;
    }
    
    public void setEmployeeByExaminerEmpId(Employee employeeByExaminerEmpId) {
        this.employeeByExaminerEmpId = employeeByExaminerEmpId;
    }

    public Employee getEmployeeByPurperEmpId() {
        return this.employeeByPurperEmpId;
    }
    
    public void setEmployeeByPurperEmpId(Employee employeeByPurperEmpId) {
        this.employeeByPurperEmpId = employeeByPurperEmpId;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployeeByQuamanperEmpId() {
        return this.employeeByQuamanperEmpId;
    }
    
    public void setEmployeeByQuamanperEmpId(Employee employeeByQuamanperEmpId) {
        this.employeeByQuamanperEmpId = employeeByQuamanperEmpId;
    }

    public Employee getEmployeeByPurmanperEmpId() {
        return this.employeeByPurmanperEmpId;
    }
    
    public void setEmployeeByPurmanperEmpId(Employee employeeByPurmanperEmpId) {
        this.employeeByPurmanperEmpId = employeeByPurmanperEmpId;
    }

    public Supplierinfo getSupplierinfo() {
        return this.supplierinfo;
    }
    
    public void setSupplierinfo(Supplierinfo supplierinfo) {
        this.supplierinfo = supplierinfo;
    }

    public String getBasis() {
        return this.basis;
    }
    
    public void setBasis(String basis) {
        this.basis = basis;
    }

    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCheckreport() {
        return this.checkreport;
    }
    
    public void setCheckreport(String checkreport) {
        this.checkreport = checkreport;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
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

    public Boolean getResult() {
        return this.result;
    }
    
    public void setResult(Boolean result) {
        this.result = result;
    }

    public Integer getSamid() {
        return this.samid;
    }
    
    public void setSamid(Integer samid) {
        this.samid = samid;
    }

    public Date getSenddate() {
        return this.senddate;
    }
    
    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Integer getTiems() {
        return this.tiems;
    }
    
    public void setTiems(Integer tiems) {
        this.tiems = tiems;
    }

    public Integer getTracktestId() {
        return this.tracktestId;
    }
    
    public void setTracktestId(Integer tracktestId) {
        this.tracktestId = tracktestId;
    }

    public Date getPurmdate() {
        return this.purmdate;
    }
    
    public void setPurmdate(Date purmdate) {
        this.purmdate = purmdate;
    }

    public Set getTrackingtests() {
        return this.trackingtests;
    }
    
    public void setTrackingtests(Set trackingtests) {
        this.trackingtests = trackingtests;
    }
   








}