package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Purorder entity. @author MyEclipse Persistence Tools
 */

public class Purorder  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employeeByAuditEmpId;
     private Employee employeeByApprovalEmpId;
     private Employee employeeByHandingEmpId;
     private Quaprolist quaprolist;
     private String firm;
     private String pno;
     private String pnote;
     private String purconfirm;
     private Date purdate;
     private Boolean srep;
     private Boolean enter;
     private Set purgoods = new HashSet(0);
     private Set purgoods_1 = new HashSet(0);


    // Constructors

    /** default constructor */
    public Purorder() {
    }

    
    /** full constructor */
    public Purorder(Employee employeeByAuditEmpId, Employee employeeByApprovalEmpId, Employee employeeByHandingEmpId, Quaprolist quaprolist, String firm, String pno, String pnote, String purconfirm, Date purdate, Boolean srep, Boolean enter, Set purgoods, Set purgoods_1) {
        this.employeeByAuditEmpId = employeeByAuditEmpId;
        this.employeeByApprovalEmpId = employeeByApprovalEmpId;
        this.employeeByHandingEmpId = employeeByHandingEmpId;
        this.quaprolist = quaprolist;
        this.firm = firm;
        this.pno = pno;
        this.pnote = pnote;
        this.purconfirm = purconfirm;
        this.purdate = purdate;
        this.srep = srep;
        this.enter = enter;
        this.purgoods = purgoods;
        this.purgoods_1 = purgoods_1;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployeeByAuditEmpId() {
        return this.employeeByAuditEmpId;
    }
    
    public void setEmployeeByAuditEmpId(Employee employeeByAuditEmpId) {
        this.employeeByAuditEmpId = employeeByAuditEmpId;
    }

    public Employee getEmployeeByApprovalEmpId() {
        return this.employeeByApprovalEmpId;
    }
    
    public void setEmployeeByApprovalEmpId(Employee employeeByApprovalEmpId) {
        this.employeeByApprovalEmpId = employeeByApprovalEmpId;
    }

    public Employee getEmployeeByHandingEmpId() {
        return this.employeeByHandingEmpId;
    }
    
    public void setEmployeeByHandingEmpId(Employee employeeByHandingEmpId) {
        this.employeeByHandingEmpId = employeeByHandingEmpId;
    }

    public Quaprolist getQuaprolist() {
        return this.quaprolist;
    }
    
    public void setQuaprolist(Quaprolist quaprolist) {
        this.quaprolist = quaprolist;
    }

    public String getFirm() {
        return this.firm;
    }
    
    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getPno() {
        return this.pno;
    }
    
    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPnote() {
        return this.pnote;
    }
    
    public void setPnote(String pnote) {
        this.pnote = pnote;
    }

    public String getPurconfirm() {
        return this.purconfirm;
    }
    
    public void setPurconfirm(String purconfirm) {
        this.purconfirm = purconfirm;
    }

    public Date getPurdate() {
        return this.purdate;
    }
    
    public void setPurdate(Date purdate) {
        this.purdate = purdate;
    }

    public Boolean getSrep() {
        return this.srep;
    }
    
    public void setSrep(Boolean srep) {
        this.srep = srep;
    }

    public Boolean getEnter() {
        return this.enter;
    }
    
    public void setEnter(Boolean enter) {
        this.enter = enter;
    }

    public Set getPurgoods() {
        return this.purgoods;
    }
    
    public void setPurgoods(Set purgoods) {
        this.purgoods = purgoods;
    }

    public Set getPurgoods_1() {
        return this.purgoods_1;
    }
    
    public void setPurgoods_1(Set purgoods_1) {
        this.purgoods_1 = purgoods_1;
    }
   








}