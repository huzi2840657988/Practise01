package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Storescheduling entity. @author MyEclipse Persistence Tools
 */

public class Storescheduling  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Date reqstodate;
     private Integer stonum;
     private String storsn;
     private Set stoschgoods = new HashSet(0);


    // Constructors

    /** default constructor */
    public Storescheduling() {
    }

    
    /** full constructor */
    public Storescheduling(Date reqstodate, Integer stonum, String storsn, Set stoschgoods) {
        this.reqstodate = reqstodate;
        this.stonum = stonum;
        this.storsn = storsn;
        this.stoschgoods = stoschgoods;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReqstodate() {
        return this.reqstodate;
    }
    
    public void setReqstodate(Date reqstodate) {
        this.reqstodate = reqstodate;
    }

    public Integer getStonum() {
        return this.stonum;
    }
    
    public void setStonum(Integer stonum) {
        this.stonum = stonum;
    }

    public String getStorsn() {
        return this.storsn;
    }
    
    public void setStorsn(String storsn) {
        this.storsn = storsn;
    }

    public Set getStoschgoods() {
        return this.stoschgoods;
    }
    
    public void setStoschgoods(Set stoschgoods) {
        this.stoschgoods = stoschgoods;
    }
   








}