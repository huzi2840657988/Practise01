package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Shinote2 entity. @author MyEclipse Persistence Tools
 */

public class Shinote2  implements java.io.Serializable {


    // Fields    

     private Integer shi2id;
     private Employee employeeByWper;
     private Department department;
     private Employee employeeByWhmgetEmp;
     private Employee employeeByMtab;
     private Employee employeeByDelper;
     private String letrecper;
     private Date makeDate;
     private String raddress;
     private String rcode;
     private String recper;
     private String recstyle;
     private String recunit;
     private String sbranch1;
     private String sbranch2;
     private String sbranch3;
     private String schper;
     private Date shi2date;
     private String shi2note;
     private String sn;
     private String storageper;
     private String tostation;
     private Integer totals;
     private String trno;
     private String whmger;
     private Set shi2goods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Shinote2() {
    }

    
    /** full constructor */
    public Shinote2(Employee employeeByWper, Department department, Employee employeeByWhmgetEmp, Employee employeeByMtab, Employee employeeByDelper, String letrecper, Date makeDate, String raddress, String rcode, String recper, String recstyle, String recunit, String sbranch1, String sbranch2, String sbranch3, String schper, Date shi2date, String shi2note, String sn, String storageper, String tostation, Integer totals, String trno, String whmger, Set shi2goods) {
        this.employeeByWper = employeeByWper;
        this.department = department;
        this.employeeByWhmgetEmp = employeeByWhmgetEmp;
        this.employeeByMtab = employeeByMtab;
        this.employeeByDelper = employeeByDelper;
        this.letrecper = letrecper;
        this.makeDate = makeDate;
        this.raddress = raddress;
        this.rcode = rcode;
        this.recper = recper;
        this.recstyle = recstyle;
        this.recunit = recunit;
        this.sbranch1 = sbranch1;
        this.sbranch2 = sbranch2;
        this.sbranch3 = sbranch3;
        this.schper = schper;
        this.shi2date = shi2date;
        this.shi2note = shi2note;
        this.sn = sn;
        this.storageper = storageper;
        this.tostation = tostation;
        this.totals = totals;
        this.trno = trno;
        this.whmger = whmger;
        this.shi2goods = shi2goods;
    }

   
    // Property accessors

    public Integer getShi2id() {
        return this.shi2id;
    }
    
    public void setShi2id(Integer shi2id) {
        this.shi2id = shi2id;
    }

    public Employee getEmployeeByWper() {
        return this.employeeByWper;
    }
    
    public void setEmployeeByWper(Employee employeeByWper) {
        this.employeeByWper = employeeByWper;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployeeByWhmgetEmp() {
        return this.employeeByWhmgetEmp;
    }
    
    public void setEmployeeByWhmgetEmp(Employee employeeByWhmgetEmp) {
        this.employeeByWhmgetEmp = employeeByWhmgetEmp;
    }

    public Employee getEmployeeByMtab() {
        return this.employeeByMtab;
    }
    
    public void setEmployeeByMtab(Employee employeeByMtab) {
        this.employeeByMtab = employeeByMtab;
    }

    public Employee getEmployeeByDelper() {
        return this.employeeByDelper;
    }
    
    public void setEmployeeByDelper(Employee employeeByDelper) {
        this.employeeByDelper = employeeByDelper;
    }

    public String getLetrecper() {
        return this.letrecper;
    }
    
    public void setLetrecper(String letrecper) {
        this.letrecper = letrecper;
    }

    public Date getMakeDate() {
        return this.makeDate;
    }
    
    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    public String getRaddress() {
        return this.raddress;
    }
    
    public void setRaddress(String raddress) {
        this.raddress = raddress;
    }

    public String getRcode() {
        return this.rcode;
    }
    
    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getRecper() {
        return this.recper;
    }
    
    public void setRecper(String recper) {
        this.recper = recper;
    }

    public String getRecstyle() {
        return this.recstyle;
    }
    
    public void setRecstyle(String recstyle) {
        this.recstyle = recstyle;
    }

    public String getRecunit() {
        return this.recunit;
    }
    
    public void setRecunit(String recunit) {
        this.recunit = recunit;
    }

    public String getSbranch1() {
        return this.sbranch1;
    }
    
    public void setSbranch1(String sbranch1) {
        this.sbranch1 = sbranch1;
    }

    public String getSbranch2() {
        return this.sbranch2;
    }
    
    public void setSbranch2(String sbranch2) {
        this.sbranch2 = sbranch2;
    }

    public String getSbranch3() {
        return this.sbranch3;
    }
    
    public void setSbranch3(String sbranch3) {
        this.sbranch3 = sbranch3;
    }

    public String getSchper() {
        return this.schper;
    }
    
    public void setSchper(String schper) {
        this.schper = schper;
    }

    public Date getShi2date() {
        return this.shi2date;
    }
    
    public void setShi2date(Date shi2date) {
        this.shi2date = shi2date;
    }

    public String getShi2note() {
        return this.shi2note;
    }
    
    public void setShi2note(String shi2note) {
        this.shi2note = shi2note;
    }

    public String getSn() {
        return this.sn;
    }
    
    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getStorageper() {
        return this.storageper;
    }
    
    public void setStorageper(String storageper) {
        this.storageper = storageper;
    }

    public String getTostation() {
        return this.tostation;
    }
    
    public void setTostation(String tostation) {
        this.tostation = tostation;
    }

    public Integer getTotals() {
        return this.totals;
    }
    
    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    public String getTrno() {
        return this.trno;
    }
    
    public void setTrno(String trno) {
        this.trno = trno;
    }

    public String getWhmger() {
        return this.whmger;
    }
    
    public void setWhmger(String whmger) {
        this.whmger = whmger;
    }

    public Set getShi2goods() {
        return this.shi2goods;
    }
    
    public void setShi2goods(Set shi2goods) {
        this.shi2goods = shi2goods;
    }
   








}