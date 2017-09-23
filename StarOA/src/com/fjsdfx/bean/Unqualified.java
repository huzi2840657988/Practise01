package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Unqualified entity. @author MyEclipse Persistence Tools
 */

public class Unqualified  implements java.io.Serializable {


    // Fields    

     private Integer unqId;
     private Employee employeeByInspectorEmp;
     private Department departmentByRdpt;
     private Employee employeeByReportperEmp;
     private Employee employeeByRebperEmp;
     private Returned returned;
     private Itemtype itemtype;
     private Employee employeeByRecperEmp;
     private Department departmentByRecdpt;
     private Employee employeeByRecheckperEmp;
     private Date insdate;
     private String inspector;
     private Integer num;
     private String rebper;
     private Date recedate;
     private String recper;
     private String reportper;
     private String review;
     private Date rechecktime;
     private Set unqmessages = new HashSet(0);


    // Constructors

    /** default constructor */
    public Unqualified() {
    }

    
    /** full constructor */
    public Unqualified(Employee employeeByInspectorEmp, Department departmentByRdpt, Employee employeeByReportperEmp, Employee employeeByRebperEmp, Returned returned, Itemtype itemtype, Employee employeeByRecperEmp, Department departmentByRecdpt, Employee employeeByRecheckperEmp, Date insdate, String inspector, Integer num, String rebper, Date recedate, String recper, String reportper, String review, Date rechecktime, Set unqmessages) {
        this.employeeByInspectorEmp = employeeByInspectorEmp;
        this.departmentByRdpt = departmentByRdpt;
        this.employeeByReportperEmp = employeeByReportperEmp;
        this.employeeByRebperEmp = employeeByRebperEmp;
        this.returned = returned;
        this.itemtype = itemtype;
        this.employeeByRecperEmp = employeeByRecperEmp;
        this.departmentByRecdpt = departmentByRecdpt;
        this.employeeByRecheckperEmp = employeeByRecheckperEmp;
        this.insdate = insdate;
        this.inspector = inspector;
        this.num = num;
        this.rebper = rebper;
        this.recedate = recedate;
        this.recper = recper;
        this.reportper = reportper;
        this.review = review;
        this.rechecktime = rechecktime;
        this.unqmessages = unqmessages;
    }

   
    // Property accessors

    public Integer getUnqId() {
        return this.unqId;
    }
    
    public void setUnqId(Integer unqId) {
        this.unqId = unqId;
    }

    public Employee getEmployeeByInspectorEmp() {
        return this.employeeByInspectorEmp;
    }
    
    public void setEmployeeByInspectorEmp(Employee employeeByInspectorEmp) {
        this.employeeByInspectorEmp = employeeByInspectorEmp;
    }

    public Department getDepartmentByRdpt() {
        return this.departmentByRdpt;
    }
    
    public void setDepartmentByRdpt(Department departmentByRdpt) {
        this.departmentByRdpt = departmentByRdpt;
    }

    public Employee getEmployeeByReportperEmp() {
        return this.employeeByReportperEmp;
    }
    
    public void setEmployeeByReportperEmp(Employee employeeByReportperEmp) {
        this.employeeByReportperEmp = employeeByReportperEmp;
    }

    public Employee getEmployeeByRebperEmp() {
        return this.employeeByRebperEmp;
    }
    
    public void setEmployeeByRebperEmp(Employee employeeByRebperEmp) {
        this.employeeByRebperEmp = employeeByRebperEmp;
    }

    public Returned getReturned() {
        return this.returned;
    }
    
    public void setReturned(Returned returned) {
        this.returned = returned;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Employee getEmployeeByRecperEmp() {
        return this.employeeByRecperEmp;
    }
    
    public void setEmployeeByRecperEmp(Employee employeeByRecperEmp) {
        this.employeeByRecperEmp = employeeByRecperEmp;
    }

    public Department getDepartmentByRecdpt() {
        return this.departmentByRecdpt;
    }
    
    public void setDepartmentByRecdpt(Department departmentByRecdpt) {
        this.departmentByRecdpt = departmentByRecdpt;
    }

    public Employee getEmployeeByRecheckperEmp() {
        return this.employeeByRecheckperEmp;
    }
    
    public void setEmployeeByRecheckperEmp(Employee employeeByRecheckperEmp) {
        this.employeeByRecheckperEmp = employeeByRecheckperEmp;
    }

    public Date getInsdate() {
        return this.insdate;
    }
    
    public void setInsdate(Date insdate) {
        this.insdate = insdate;
    }

    public String getInspector() {
        return this.inspector;
    }
    
    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRebper() {
        return this.rebper;
    }
    
    public void setRebper(String rebper) {
        this.rebper = rebper;
    }

    public Date getRecedate() {
        return this.recedate;
    }
    
    public void setRecedate(Date recedate) {
        this.recedate = recedate;
    }

    public String getRecper() {
        return this.recper;
    }
    
    public void setRecper(String recper) {
        this.recper = recper;
    }

    public String getReportper() {
        return this.reportper;
    }
    
    public void setReportper(String reportper) {
        this.reportper = reportper;
    }

    public String getReview() {
        return this.review;
    }
    
    public void setReview(String review) {
        this.review = review;
    }

    public Date getRechecktime() {
        return this.rechecktime;
    }
    
    public void setRechecktime(Date rechecktime) {
        this.rechecktime = rechecktime;
    }

    public Set getUnqmessages() {
        return this.unqmessages;
    }
    
    public void setUnqmessages(Set unqmessages) {
        this.unqmessages = unqmessages;
    }
   








}