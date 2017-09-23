package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Taxboard entity. @author MyEclipse Persistence Tools
 */

public class Taxboard  implements java.io.Serializable {


    // Fields    

     private Integer taxId;
     private Employee employeeByQuaconfirmEmp;
     private Employee employeeByInspectorEmp;
     private Itemtype itemtype;
     private Shi1good shi1good;
     private Employee employeeByRperEmp;
     private String batchno;
     private Integer checknum;
     private String cresult;
     private String cresult2;
     private String detfinally;
     private Integer goodstotal;
     private String ictchk;
     private Integer inspector;
     private String lineno;
     private String lineno2;
     private String outerchk;
     private String packingchk;
     private Integer quaconfirm;
     private Timestamp rdate;
     private Integer rper;
     private String servicingchk;
     private String userf;
     private Timestamp wdate;


    // Constructors

    /** default constructor */
    public Taxboard() {
    }

    
    /** full constructor */
    public Taxboard(Employee employeeByQuaconfirmEmp, Employee employeeByInspectorEmp, Itemtype itemtype, Shi1good shi1good, Employee employeeByRperEmp, String batchno, Integer checknum, String cresult, String cresult2, String detfinally, Integer goodstotal, String ictchk, Integer inspector, String lineno, String lineno2, String outerchk, String packingchk, Integer quaconfirm, Timestamp rdate, Integer rper, String servicingchk, String userf, Timestamp wdate) {
        this.employeeByQuaconfirmEmp = employeeByQuaconfirmEmp;
        this.employeeByInspectorEmp = employeeByInspectorEmp;
        this.itemtype = itemtype;
        this.shi1good = shi1good;
        this.employeeByRperEmp = employeeByRperEmp;
        this.batchno = batchno;
        this.checknum = checknum;
        this.cresult = cresult;
        this.cresult2 = cresult2;
        this.detfinally = detfinally;
        this.goodstotal = goodstotal;
        this.ictchk = ictchk;
        this.inspector = inspector;
        this.lineno = lineno;
        this.lineno2 = lineno2;
        this.outerchk = outerchk;
        this.packingchk = packingchk;
        this.quaconfirm = quaconfirm;
        this.rdate = rdate;
        this.rper = rper;
        this.servicingchk = servicingchk;
        this.userf = userf;
        this.wdate = wdate;
    }

   
    // Property accessors

    public Integer getTaxId() {
        return this.taxId;
    }
    
    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public Employee getEmployeeByQuaconfirmEmp() {
        return this.employeeByQuaconfirmEmp;
    }
    
    public void setEmployeeByQuaconfirmEmp(Employee employeeByQuaconfirmEmp) {
        this.employeeByQuaconfirmEmp = employeeByQuaconfirmEmp;
    }

    public Employee getEmployeeByInspectorEmp() {
        return this.employeeByInspectorEmp;
    }
    
    public void setEmployeeByInspectorEmp(Employee employeeByInspectorEmp) {
        this.employeeByInspectorEmp = employeeByInspectorEmp;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Shi1good getShi1good() {
        return this.shi1good;
    }
    
    public void setShi1good(Shi1good shi1good) {
        this.shi1good = shi1good;
    }

    public Employee getEmployeeByRperEmp() {
        return this.employeeByRperEmp;
    }
    
    public void setEmployeeByRperEmp(Employee employeeByRperEmp) {
        this.employeeByRperEmp = employeeByRperEmp;
    }

    public String getBatchno() {
        return this.batchno;
    }
    
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public Integer getChecknum() {
        return this.checknum;
    }
    
    public void setChecknum(Integer checknum) {
        this.checknum = checknum;
    }

    public String getCresult() {
        return this.cresult;
    }
    
    public void setCresult(String cresult) {
        this.cresult = cresult;
    }

    public String getCresult2() {
        return this.cresult2;
    }
    
    public void setCresult2(String cresult2) {
        this.cresult2 = cresult2;
    }

    public String getDetfinally() {
        return this.detfinally;
    }
    
    public void setDetfinally(String detfinally) {
        this.detfinally = detfinally;
    }

    public Integer getGoodstotal() {
        return this.goodstotal;
    }
    
    public void setGoodstotal(Integer goodstotal) {
        this.goodstotal = goodstotal;
    }

    public String getIctchk() {
        return this.ictchk;
    }
    
    public void setIctchk(String ictchk) {
        this.ictchk = ictchk;
    }

    public Integer getInspector() {
        return this.inspector;
    }
    
    public void setInspector(Integer inspector) {
        this.inspector = inspector;
    }

    public String getLineno() {
        return this.lineno;
    }
    
    public void setLineno(String lineno) {
        this.lineno = lineno;
    }

    public String getLineno2() {
        return this.lineno2;
    }
    
    public void setLineno2(String lineno2) {
        this.lineno2 = lineno2;
    }

    public String getOuterchk() {
        return this.outerchk;
    }
    
    public void setOuterchk(String outerchk) {
        this.outerchk = outerchk;
    }

    public String getPackingchk() {
        return this.packingchk;
    }
    
    public void setPackingchk(String packingchk) {
        this.packingchk = packingchk;
    }

    public Integer getQuaconfirm() {
        return this.quaconfirm;
    }
    
    public void setQuaconfirm(Integer quaconfirm) {
        this.quaconfirm = quaconfirm;
    }

    public Timestamp getRdate() {
        return this.rdate;
    }
    
    public void setRdate(Timestamp rdate) {
        this.rdate = rdate;
    }

    public Integer getRper() {
        return this.rper;
    }
    
    public void setRper(Integer rper) {
        this.rper = rper;
    }

    public String getServicingchk() {
        return this.servicingchk;
    }
    
    public void setServicingchk(String servicingchk) {
        this.servicingchk = servicingchk;
    }

    public String getUserf() {
        return this.userf;
    }
    
    public void setUserf(String userf) {
        this.userf = userf;
    }

    public Timestamp getWdate() {
        return this.wdate;
    }
    
    public void setWdate(Timestamp wdate) {
        this.wdate = wdate;
    }
   








}