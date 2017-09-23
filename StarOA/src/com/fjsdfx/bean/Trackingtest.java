package com.fjsdfx.bean;

import java.util.Date;


/**
 * Trackingtest entity. @author MyEclipse Persistence Tools
 */

public class Trackingtest  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Employee employeeByTryEmpId;
     private Department departmentByWs2Dpt;
     private Employee employeeByExa2EmpId;
     private Department departmentByWs1DptId;
     private Testnotes testnotes;
     private Employee employeeByExa1EmpId;
     private Employee employeeByManEmpId;
     private Itemtype itemtype;
     private Employee employeeByWsr2EmpId;
     private Department departmentByWhDptId;
     private Employee employeeByWsr1EmpId;
     private String examineresult;
     private String itempsn;
     private Date proexadate;
     private String proexasitudation;
     private String propsn;
     private String proquasitudation;
     private Date prorecdate;
     private String prorecord;
     private String psncontent;
     private String qualitySituation;
     private Date testdate;
     private String tryadvice;
     private Date trydate;
     private Date trymanagerdate;
     private String trypsn;
     private Date whexamineDate;
     private Date whrecordate;


    // Constructors

    /** default constructor */
    public Trackingtest() {
    }

    
    /** full constructor */
    public Trackingtest(Employee employeeByTryEmpId, Department departmentByWs2Dpt, Employee employeeByExa2EmpId, Department departmentByWs1DptId, Testnotes testnotes, Employee employeeByExa1EmpId, Employee employeeByManEmpId, Itemtype itemtype, Employee employeeByWsr2EmpId, Department departmentByWhDptId, Employee employeeByWsr1EmpId, String examineresult, String itempsn, Date proexadate, String proexasitudation, String propsn, String proquasitudation, Date prorecdate, String prorecord, String psncontent, String qualitySituation, Date testdate, String tryadvice, Date trydate, Date trymanagerdate, String trypsn, Date whexamineDate, Date whrecordate) {
        this.employeeByTryEmpId = employeeByTryEmpId;
        this.departmentByWs2Dpt = departmentByWs2Dpt;
        this.employeeByExa2EmpId = employeeByExa2EmpId;
        this.departmentByWs1DptId = departmentByWs1DptId;
        this.testnotes = testnotes;
        this.employeeByExa1EmpId = employeeByExa1EmpId;
        this.employeeByManEmpId = employeeByManEmpId;
        this.itemtype = itemtype;
        this.employeeByWsr2EmpId = employeeByWsr2EmpId;
        this.departmentByWhDptId = departmentByWhDptId;
        this.employeeByWsr1EmpId = employeeByWsr1EmpId;
        this.examineresult = examineresult;
        this.itempsn = itempsn;
        this.proexadate = proexadate;
        this.proexasitudation = proexasitudation;
        this.propsn = propsn;
        this.proquasitudation = proquasitudation;
        this.prorecdate = prorecdate;
        this.prorecord = prorecord;
        this.psncontent = psncontent;
        this.qualitySituation = qualitySituation;
        this.testdate = testdate;
        this.tryadvice = tryadvice;
        this.trydate = trydate;
        this.trymanagerdate = trymanagerdate;
        this.trypsn = trypsn;
        this.whexamineDate = whexamineDate;
        this.whrecordate = whrecordate;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployeeByTryEmpId() {
        return this.employeeByTryEmpId;
    }
    
    public void setEmployeeByTryEmpId(Employee employeeByTryEmpId) {
        this.employeeByTryEmpId = employeeByTryEmpId;
    }

    public Department getDepartmentByWs2Dpt() {
        return this.departmentByWs2Dpt;
    }
    
    public void setDepartmentByWs2Dpt(Department departmentByWs2Dpt) {
        this.departmentByWs2Dpt = departmentByWs2Dpt;
    }

    public Employee getEmployeeByExa2EmpId() {
        return this.employeeByExa2EmpId;
    }
    
    public void setEmployeeByExa2EmpId(Employee employeeByExa2EmpId) {
        this.employeeByExa2EmpId = employeeByExa2EmpId;
    }

    public Department getDepartmentByWs1DptId() {
        return this.departmentByWs1DptId;
    }
    
    public void setDepartmentByWs1DptId(Department departmentByWs1DptId) {
        this.departmentByWs1DptId = departmentByWs1DptId;
    }

    public Testnotes getTestnotes() {
        return this.testnotes;
    }
    
    public void setTestnotes(Testnotes testnotes) {
        this.testnotes = testnotes;
    }

    public Employee getEmployeeByExa1EmpId() {
        return this.employeeByExa1EmpId;
    }
    
    public void setEmployeeByExa1EmpId(Employee employeeByExa1EmpId) {
        this.employeeByExa1EmpId = employeeByExa1EmpId;
    }

    public Employee getEmployeeByManEmpId() {
        return this.employeeByManEmpId;
    }
    
    public void setEmployeeByManEmpId(Employee employeeByManEmpId) {
        this.employeeByManEmpId = employeeByManEmpId;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Employee getEmployeeByWsr2EmpId() {
        return this.employeeByWsr2EmpId;
    }
    
    public void setEmployeeByWsr2EmpId(Employee employeeByWsr2EmpId) {
        this.employeeByWsr2EmpId = employeeByWsr2EmpId;
    }

    public Department getDepartmentByWhDptId() {
        return this.departmentByWhDptId;
    }
    
    public void setDepartmentByWhDptId(Department departmentByWhDptId) {
        this.departmentByWhDptId = departmentByWhDptId;
    }

    public Employee getEmployeeByWsr1EmpId() {
        return this.employeeByWsr1EmpId;
    }
    
    public void setEmployeeByWsr1EmpId(Employee employeeByWsr1EmpId) {
        this.employeeByWsr1EmpId = employeeByWsr1EmpId;
    }

    public String getExamineresult() {
        return this.examineresult;
    }
    
    public void setExamineresult(String examineresult) {
        this.examineresult = examineresult;
    }

    public String getItempsn() {
        return this.itempsn;
    }
    
    public void setItempsn(String itempsn) {
        this.itempsn = itempsn;
    }

    public Date getProexadate() {
        return this.proexadate;
    }
    
    public void setProexadate(Date proexadate) {
        this.proexadate = proexadate;
    }

    public String getProexasitudation() {
        return this.proexasitudation;
    }
    
    public void setProexasitudation(String proexasitudation) {
        this.proexasitudation = proexasitudation;
    }

    public String getPropsn() {
        return this.propsn;
    }
    
    public void setPropsn(String propsn) {
        this.propsn = propsn;
    }

    public String getProquasitudation() {
        return this.proquasitudation;
    }
    
    public void setProquasitudation(String proquasitudation) {
        this.proquasitudation = proquasitudation;
    }

    public Date getProrecdate() {
        return this.prorecdate;
    }
    
    public void setProrecdate(Date prorecdate) {
        this.prorecdate = prorecdate;
    }

    public String getProrecord() {
        return this.prorecord;
    }
    
    public void setProrecord(String prorecord) {
        this.prorecord = prorecord;
    }

    public String getPsncontent() {
        return this.psncontent;
    }
    
    public void setPsncontent(String psncontent) {
        this.psncontent = psncontent;
    }

    public String getQualitySituation() {
        return this.qualitySituation;
    }
    
    public void setQualitySituation(String qualitySituation) {
        this.qualitySituation = qualitySituation;
    }

    public Date getTestdate() {
        return this.testdate;
    }
    
    public void setTestdate(Date testdate) {
        this.testdate = testdate;
    }

    public String getTryadvice() {
        return this.tryadvice;
    }
    
    public void setTryadvice(String tryadvice) {
        this.tryadvice = tryadvice;
    }

    public Date getTrydate() {
        return this.trydate;
    }
    
    public void setTrydate(Date trydate) {
        this.trydate = trydate;
    }

    public Date getTrymanagerdate() {
        return this.trymanagerdate;
    }
    
    public void setTrymanagerdate(Date trymanagerdate) {
        this.trymanagerdate = trymanagerdate;
    }

    public String getTrypsn() {
        return this.trypsn;
    }
    
    public void setTrypsn(String trypsn) {
        this.trypsn = trypsn;
    }

    public Date getWhexamineDate() {
        return this.whexamineDate;
    }
    
    public void setWhexamineDate(Date whexamineDate) {
        this.whexamineDate = whexamineDate;
    }

    public Date getWhrecordate() {
        return this.whrecordate;
    }
    
    public void setWhrecordate(Date whrecordate) {
        this.whrecordate = whrecordate;
    }
   








}