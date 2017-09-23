package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Shippingnote1 entity. @author MyEclipse Persistence Tools
 */

public class Shippingnote1  implements java.io.Serializable {


    // Fields    

     private Integer shi1id;
     private Employee employee;
     private Integer empId;
     private String goodlist;
     private String sended;
     private Date shi1date;
     private String shi1receive;
     private String shi1send;
     private Set shi1goods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Shippingnote1() {
    }

    
    /** full constructor */
    public Shippingnote1(Employee employee, Integer empId, String goodlist, String sended, Date shi1date, String shi1receive, String shi1send, Set shi1goods) {
        this.employee = employee;
        this.empId = empId;
        this.goodlist = goodlist;
        this.sended = sended;
        this.shi1date = shi1date;
        this.shi1receive = shi1receive;
        this.shi1send = shi1send;
        this.shi1goods = shi1goods;
    }

   
    // Property accessors

    public Integer getShi1id() {
        return this.shi1id;
    }
    
    public void setShi1id(Integer shi1id) {
        this.shi1id = shi1id;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getGoodlist() {
        return this.goodlist;
    }
    
    public void setGoodlist(String goodlist) {
        this.goodlist = goodlist;
    }

    public String getSended() {
        return this.sended;
    }
    
    public void setSended(String sended) {
        this.sended = sended;
    }

    public Date getShi1date() {
        return this.shi1date;
    }
    
    public void setShi1date(Date shi1date) {
        this.shi1date = shi1date;
    }

    public String getShi1receive() {
        return this.shi1receive;
    }
    
    public void setShi1receive(String shi1receive) {
        this.shi1receive = shi1receive;
    }

    public String getShi1send() {
        return this.shi1send;
    }
    
    public void setShi1send(String shi1send) {
        this.shi1send = shi1send;
    }

    public Set getShi1goods() {
        return this.shi1goods;
    }
    
    public void setShi1goods(Set shi1goods) {
        this.shi1goods = shi1goods;
    }
   








}