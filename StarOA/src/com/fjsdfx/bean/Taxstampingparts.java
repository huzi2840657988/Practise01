package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Taxstampingparts entity. @author MyEclipse Persistence Tools
 */

public class Taxstampingparts  implements java.io.Serializable {


    // Fields    

     private Integer tasId;
     private Employee employeeByQuaconfirmEmp;
     private Employee employeeByInspectorEmp;
     private Itemtype itemtype;
     private Shi1good shi1good;
     private Employee employeeByRperEmp;
     private String batchno;
     private String checkresult1;
     private String checkresult2;
     private String chenkresult3;
     private String confirm;
     private Integer goodstotal;
     private Integer inspector;
     private Timestamp makdate;
     private Integer quaconfirm;
     private Timestamp repdate;
     private Integer rper;
     private String sizecheckaql;
     private Integer sizechecknum;
     private Integer vischecknum1;
     private Integer vischecknum2;


    // Constructors

    /** default constructor */
    public Taxstampingparts() {
    }

    
    /** full constructor */
    public Taxstampingparts(Employee employeeByQuaconfirmEmp, Employee employeeByInspectorEmp, Itemtype itemtype, Shi1good shi1good, Employee employeeByRperEmp, String batchno, String checkresult1, String checkresult2, String chenkresult3, String confirm, Integer goodstotal, Integer inspector, Timestamp makdate, Integer quaconfirm, Timestamp repdate, Integer rper, String sizecheckaql, Integer sizechecknum, Integer vischecknum1, Integer vischecknum2) {
        this.employeeByQuaconfirmEmp = employeeByQuaconfirmEmp;
        this.employeeByInspectorEmp = employeeByInspectorEmp;
        this.itemtype = itemtype;
        this.shi1good = shi1good;
        this.employeeByRperEmp = employeeByRperEmp;
        this.batchno = batchno;
        this.checkresult1 = checkresult1;
        this.checkresult2 = checkresult2;
        this.chenkresult3 = chenkresult3;
        this.confirm = confirm;
        this.goodstotal = goodstotal;
        this.inspector = inspector;
        this.makdate = makdate;
        this.quaconfirm = quaconfirm;
        this.repdate = repdate;
        this.rper = rper;
        this.sizecheckaql = sizecheckaql;
        this.sizechecknum = sizechecknum;
        this.vischecknum1 = vischecknum1;
        this.vischecknum2 = vischecknum2;
    }

   
    // Property accessors

    public Integer getTasId() {
        return this.tasId;
    }
    
    public void setTasId(Integer tasId) {
        this.tasId = tasId;
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

    public String getCheckresult1() {
        return this.checkresult1;
    }
    
    public void setCheckresult1(String checkresult1) {
        this.checkresult1 = checkresult1;
    }

    public String getCheckresult2() {
        return this.checkresult2;
    }
    
    public void setCheckresult2(String checkresult2) {
        this.checkresult2 = checkresult2;
    }

    public String getChenkresult3() {
        return this.chenkresult3;
    }
    
    public void setChenkresult3(String chenkresult3) {
        this.chenkresult3 = chenkresult3;
    }

    public String getConfirm() {
        return this.confirm;
    }
    
    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public Integer getGoodstotal() {
        return this.goodstotal;
    }
    
    public void setGoodstotal(Integer goodstotal) {
        this.goodstotal = goodstotal;
    }

    public Integer getInspector() {
        return this.inspector;
    }
    
    public void setInspector(Integer inspector) {
        this.inspector = inspector;
    }

    public Timestamp getMakdate() {
        return this.makdate;
    }
    
    public void setMakdate(Timestamp makdate) {
        this.makdate = makdate;
    }

    public Integer getQuaconfirm() {
        return this.quaconfirm;
    }
    
    public void setQuaconfirm(Integer quaconfirm) {
        this.quaconfirm = quaconfirm;
    }

    public Timestamp getRepdate() {
        return this.repdate;
    }
    
    public void setRepdate(Timestamp repdate) {
        this.repdate = repdate;
    }

    public Integer getRper() {
        return this.rper;
    }
    
    public void setRper(Integer rper) {
        this.rper = rper;
    }

    public String getSizecheckaql() {
        return this.sizecheckaql;
    }
    
    public void setSizecheckaql(String sizecheckaql) {
        this.sizecheckaql = sizecheckaql;
    }

    public Integer getSizechecknum() {
        return this.sizechecknum;
    }
    
    public void setSizechecknum(Integer sizechecknum) {
        this.sizechecknum = sizechecknum;
    }

    public Integer getVischecknum1() {
        return this.vischecknum1;
    }
    
    public void setVischecknum1(Integer vischecknum1) {
        this.vischecknum1 = vischecknum1;
    }

    public Integer getVischecknum2() {
        return this.vischecknum2;
    }
    
    public void setVischecknum2(Integer vischecknum2) {
        this.vischecknum2 = vischecknum2;
    }
   








}